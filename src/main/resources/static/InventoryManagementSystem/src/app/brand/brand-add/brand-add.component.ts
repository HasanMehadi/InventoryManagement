import {Component, ElementRef, HostListener, OnInit} from '@angular/core';
import {LoginAuthService} from "../../login/login-auth.service";
import {ActivatedRoute, Router} from "@angular/router";
import {BrandService} from "../brand.service";

declare var $: any;

@Component({
  selector: 'app-brand-add',
  templateUrl: './brand-add.component.html',
  styleUrls: ['./brand-add.component.css']
})
export class BrandAddComponent implements OnInit {

  loginUser: any = {};
  brand: any = {};
  editBol: boolean=true;

  constructor(private el: ElementRef,
              private loginAuthService: LoginAuthService,
              private brandService: BrandService,
              private router: Router,
              private activatedRouter: ActivatedRoute) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));

    /* this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
       this.currentStatus = currentStatus;
       console.log(currentStatus);
     })*/

    this.activatedRouter.params.subscribe((params)=>{
      const id = Number.parseInt(params['paramKey']);
      if(id){
        this.getBrand(id);
        this.editBol=false;
      }
    });
  }

  ngOnInit() {


    $('input[required],ng-select[required],textarea[required]').each(function () {
      $(this).prev('label').after("<span style='color:red'> *</span>");
    });

  }

  @HostListener('submit', ['$event'])
  onFormSubmit() {
    const invalidElements = this.el.nativeElement.querySelectorAll('.ng-invalid');
    if (invalidElements.length > 0) {
      invalidElements[1].focus();
    } else {
//console();
    }
  }

  addBrand(brandForm: any) {
    if (this.brand.brandNm &&
      this.brand.appBrandId &&
      this.brand.brandCmnt &&
      this.brand.brandDescr){
      $('#saveModal').modal('show');
    }
  }

  confirmSave() {

    if(this.brand.brandId == null){
      this.brand.crtBy = this.loginUser.user.id;
      this.brand.crtDttm = new Date();
      this.brandService.saveBrand(this.loginUser.token, this.brand).subscribe((response) => {
        console.log(response);
        this.router.navigate(['admin'])
      }, (error) => {

      })
    }else{
      this.brand.updBy = this.loginUser.user.id;
      this.brand.updDttm = new Date();
      this.brandService.updateBrand(this.loginUser.token, this.brand).subscribe((response) => {
        console.log(response);
        this.router.navigate(['admin'])
      }, (error) => {

      })
    }
  }

  getBrand(id:any){
    this.brandService.getBrand(this.loginUser.token,id).subscribe((response)=>{
      console.log(response);
      this.brand = response;
    })
  }
}
