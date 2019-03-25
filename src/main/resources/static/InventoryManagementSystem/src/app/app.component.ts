import { Component } from '@angular/core';
import { LoginAuthService} from "./login/login-auth.service";
import {Router} from "@angular/router";
import {ConstantService} from "./constant.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'InventoryManagementSystem';



  constructor( private loginAuthService: LoginAuthService ,
               private router: Router,
               private constant: ConstantService){

    this.constant.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.constant.currentStatus = currentStatus;
    })

  }

  signUp(){
    this.router.navigate(['signUp']);
  }

  signIn(){
    this.router.navigate(['login']);
  }
}
