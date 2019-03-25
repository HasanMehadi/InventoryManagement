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
    this.getAllUser(this.loginUser.token, this.page);
  }

  pageChangeFire(page: number) {
    console.log("hello >>>> " + page);
    this.getAllUser(this.loginUser.token, page-1);

  }

  getAllUser(token: any, pageNumber) {
    this.adminService.getBrandPage(token, pageNumber, this.size).subscribe((brands) => {
      this.brands = brands.content;
      this.totalElements = brands.totalElements;
    })
  }

  check() {
    this.getAllUser(this.loginUser.token, this.page);

  }

  pageChanged(page: number) {
    this.getAllUser(this.loginUser.token, page-1);
  }

  logOut(){

    localStorage.removeItem('currentUser');
    this.router.navigate(['login']);
  }
}
