import { Component } from '@angular/core';
import { LoginAuthService} from "./login/login-auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'InventoryManagementSystem';

  public currentStatus: any;

  constructor( private loginAuthService: LoginAuthService , private router: Router){

    this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.currentStatus = currentStatus;
      console.log(currentStatus);
    })

  }

  logOut(){

    localStorage.removeItem('currentUser');
    this.router.navigate(['login']);
  }

  signUp(){
    this.router.navigate(['signUp']);
  }

  signIn(){
    this.router.navigate(['login']);
  }
}
