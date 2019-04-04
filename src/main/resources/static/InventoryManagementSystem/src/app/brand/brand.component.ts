import {Component, OnInit} from '@angular/core';
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
  public currentStatus: any;
  private size: number = 10;
  private page: number = 0;
  private totalElements: number = 0;

  constructor(private brandService: BrandService, private loginAuthService: LoginAuthService, private router: Router) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));

    this.currentStatus = this.loginAuthService.getStatus().subscribe((currentStatus) => {
      this.currentStatus = currentStatus;
    })
  }

  ngOnInit() {
    this.brands = null;
    this.getBrandByPage(this.loginUser.token, this.page);
  }

  getBrandByPage(token: any, pageNumber) {
    this.brandService.getBrandPage(token, pageNumber, this.size).subscribe((brands) => {
      this.brands = brands.content;
      this.totalElements = brands.totalElements;
    })
  }

  pageChangeFire(page: number) {
    this.getBrandByPage(this.loginUser.token, page - 1);

  }

  editBrand(paramKey: number){

    this.router.navigate(['admin/brandEdit',paramKey]);
  }

}
