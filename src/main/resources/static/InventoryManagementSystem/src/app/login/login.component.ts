import {Component, OnInit} from '@angular/core';
import {LoginService} from "./login.service";
import {Router} from "@angular/router";
import {el} from "@angular/platform-browser/testing/src/browser_util";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private user: any;

  constructor(private loginService: LoginService , private router: Router) {

    this.user= {};
  }

  ngOnInit() {
  }

  public loginUser(loginForm: any) {

    this.loginService.loginUser(this.user).subscribe((response)=>{

      if(response){
        if(response.token){
           localStorage.setItem('currentUser',JSON.stringify(response));

           if(response.user.role === 'ADMIN'){
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
