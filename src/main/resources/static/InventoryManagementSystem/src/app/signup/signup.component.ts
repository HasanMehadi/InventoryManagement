import {Component, ElementRef, HostListener, OnInit} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {SignupService} from "./signup.service";
import {Router, RouterModule} from '@angular/router';
import { LoginAuthService } from "../login/login-auth.service";
declare var $: any;


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user:any;
  rematch:any;
  message:any;
  phone:any;
  notMatched:boolean;
  pass:any;
  conPass:any;
  matched:any;
  constructor( private signupService:SignupService,
               private router: Router,
               private loginAuthService :LoginAuthService,
               private el: ElementRef) {

    this.loginAuthService.isLoggedIn();
  }

  ngOnInit() {

    $('input[required],select[required]').each(function(){
      $(this).prev('label').after("<span style='color:red'>*</span>");
    });

    this.user= {};
    this.phone=null;
    this.notMatched = true;
    this.matched = false;
  }

  @HostListener('submit', ['$event'])
  onFormSubmit() {
    const invalidElements = this.el.nativeElement.querySelectorAll('.ng-invalid');
    if (invalidElements.length > 0) {
      invalidElements[1].focus();
    } else {
//console();
    }
  }

  passwordErrorChecker(newPass) {
    if (!newPass) {
      this.message = '';
    } else {
      let pattern = new RegExp("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}");
      if (newPass.length < 8) {
        this.message = 'Your password is required to be at least 8 characters.'
      } else if (newPass.length > 50) {
        this.message = 'Your password cannot be longer than 50 characters.'
      } else if (("" + pattern.test(newPass)) == 'false') {
        this.message = 'Password must contain at least one number, one uppercase letter , one lowercase letter and at least 8 or more characters.'
      } else {
        this.message= '';
      }
    }
  };

  matchPass(confirmPassword) {
    this.pass = this.user.password;
    this.conPass = this.rematch;
    if (!confirmPassword) {
      this.notMatched = true;
    } else {
      if (this.pass != this.conPass) {
        this.notMatched = false;
        this.matched= false;
      } else {
        this.notMatched = true;
        this.matched=true;
      }
    }
  };


  createAccount( signupForm: any){

    let s = this.phone;
    this.user.phoneNumber = s.concat(this.user.phoneNumber);
    console.log(this.user);

    this.signupService.saveUser(this.user).subscribe((response)=>{
       if(response){
         console.log(response);
         signupForm.reset();
         this.router.navigate(['login']);
       }

    },error => {
      console.log(error)
    })
  }

  checkEmail(){

    console.log(this.user.email);

    this.signupService.checkEmail(this.user.email).subscribe((response)=>{
      if(response){
        console.log(response);
      }
    })
  }

}
