import {Component, HostListener, OnInit,ElementRef} from '@angular/core';
import {AdminService} from "../../admin-dash-board/admin.service";
import {LoginAuthService} from "../../login/login-auth.service";
import {Router} from "@angular/router";
import {BrandService} from "../brand.service";
declare var $: any;

@Component({
  selector: 'app-brand-add',
  templateUrl: './brand-add.component.html',
  styleUrls: ['./brand-add.component.css']
})
export class BrandAddComponent implements OnInit {

  private brand:any={};
  loginUser: any = {};

  constructor( private el: ElementRef,
               private loginAuthService: LoginAuthService,
               private brandService: BrandService,
               private router: Router) {

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));
    console.log(this.loginUser.token);

   /* this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.currentStatus = currentStatus;
      console.log(currentStatus);
    })*/
  }

  ngOnInit() {

    $('input[required],ng-select[required],textarea[required]').each(function(){
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

  addBrand(brandForm: any){

   this.brand.crtBy = this.loginUser.user.id;
   this.brand.crtDttm = new Date();
   this.brand.updBy=  null;
   this.brand.updDttm = null;

   console.log(this.brand);
    this.brandService.saveBrand(this.loginUser.token,this.brand).subscribe((response)=>{
      console.log(response)
    },(error) =>{

    })

  }
}
