import { Component, OnInit } from '@angular/core';
import { LoginAuthService } from "../login/login-auth.service";
import {Router} from "@angular/router";
import { AdminService } from "./admin.service";

@Component({
  selector: 'app-admin-dash-board',
  templateUrl: './admin-dash-board.component.html',
  styleUrls: ['./admin-dash-board.component.css']
})
export class AdminDashBoardComponent implements OnInit {

  loginUser : any={};
  users: any= [];

  constructor(private adminService: AdminService, private loginAuthService :LoginAuthService, private router : Router) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));
  }

  ngOnInit() {


  }

  getAllUser(token: any){
    this.adminService.getAllUser(token).subscribe((users)=>{
      console.log(users);
      this.users = users;

    });
  }

  check(){
    this.getAllUser(this.loginUser.token);
  }
}
