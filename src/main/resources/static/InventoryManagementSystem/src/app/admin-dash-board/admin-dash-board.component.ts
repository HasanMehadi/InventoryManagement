import { Component, OnInit } from '@angular/core';
import { LoginAuthService } from "../login/login-auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-dash-board',
  templateUrl: './admin-dash-board.component.html',
  styleUrls: ['./admin-dash-board.component.css']
})
export class AdminDashBoardComponent implements OnInit {

  constructor( private loginAuthService :LoginAuthService, private router : Router) {

    this.loginAuthService.isLoggedIn();
  }

  ngOnInit() {

  }

  logout(){
    localStorage.removeItem("currentUser");
    this.router.navigate(["login"])

  }

}
