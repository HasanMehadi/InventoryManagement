import {Component, OnInit} from '@angular/core';
import {LoginAuthService} from "../login/login-auth.service";
import {Router} from "@angular/router";
import {AdminService} from "./admin.service";


@Component({
  selector: 'app-admin-dash-board',
  templateUrl: './admin-dash-board.component.html',
  styleUrls: ['./admin-dash-board.component.css']
})
export class AdminDashBoardComponent implements OnInit {

  loginUser: any = {};
  users: any = [];
  brands: any = [];
  private size: number = 1;
  private page: number = 0;
  private totalElements: number = 0;
  public currentStatus: any;

  constructor(private adminService: AdminService, private loginAuthService: LoginAuthService, private router: Router) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));

    this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.currentStatus = currentStatus;
      console.log(currentStatus);
    })
  }

  ngOnInit() {

  }

  logOut(){

    localStorage.removeItem('currentUser');
    this.router.navigate(['login']);
  }

  brandAdd(){
    this.router.navigate(['admin/brandAdd']);
  }
}
