import {Component, OnInit} from '@angular/core';
import {LoginService} from "./login.service";
import {Router} from "@angular/router";
import { LoginAuthService } from "../login/login-auth.service";
import {ConstantService} from "../constant.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private user: any;


  constructor(private loginService: LoginService ,
              private router: Router,
              private loginAuthService :LoginAuthService,
              private constant: ConstantService) {

    this.user= {};
    this.loginAuthService.isLoggedIn();
  }

  ngOnInit() {

    if(this.constant.response !=null){
        if(this.constant.response.user.role === 'ADMIN'){
          this.router.navigate(['admin']);
        }else{
          this.router.navigate(['user']);
        }
    }
  }

  public loginUser(loginForm: any) {

    this.loginService.loginUser(this.user).subscribe((response)=>{

      this.constant.response= response;

      if(this.constant.response !=null){
        if(this.constant.response.token){
           localStorage.setItem('currentUser',JSON.stringify(response));

           if(this.constant.response.user.role === 'ADMIN'){
             this.router.navigate(['admin']);
           }else{
             this.router.navigate(['user']);
           }
        }
      }

    }, error=>{

    });
  }
}
