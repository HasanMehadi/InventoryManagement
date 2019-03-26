import { Component, OnInit } from '@angular/core';
import {AdminService} from "../admin-dash-board/admin.service";
import {LoginAuthService} from "../login/login-auth.service";
import {Router} from "@angular/router";
import {BrandService} from "./brand.service";

@Component({
  selector: 'app-brand',
  templateUrl: './brand.component.html',
  styleUrls: ['./brand.component.css']
})
export class BrandComponent implements OnInit {

  loginUser: any = {};
  brands: any = [];
  private size: number = 1;
  private page: number = 0;
  private totalElements: number = 0;
  public currentStatus: any;

  constructor(private brandService: BrandService, private loginAuthService: LoginAuthService, private router: Router) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));

    this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.currentStatus = currentStatus;
      console.log(currentStatus);
    })
  }

  ngOnInit() {
    this.getBrandByPage(this.loginUser.token,this.page);
  }

  getBrandByPage(token: any, pageNumber) {
    this.brandService.getBrandPage(token, pageNumber, this.size).subscribe((brands) => {
      this.brands = brands.content;
      this.totalElements = brands.totalElements;
    })
  }

  pageChangeFire(page: number) {
    console.log("hello >>>> " + page);
    this.getBrandByPage(this.loginUser.token, page-1);

  }

}
