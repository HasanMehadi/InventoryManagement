import { Component, OnInit } from '@angular/core';
import { LoginAuthService } from "../login/login-auth.service";

@Component({
  selector: 'app-user-dash-board',
  templateUrl: './user-dash-board.component.html',
  styleUrls: ['./user-dash-board.component.css']
})
export class UserDashBoardComponent implements OnInit {

  constructor(private loginAuthService: LoginAuthService) {

    this.loginAuthService.isLoggedIn();
  }

  ngOnInit() {


  }

}
