import {Component, ElementRef, HostListener, OnInit} from '@angular/core';
import {LoginAuthService} from "../../login/login-auth.service";
import {ActivatedRoute, Router} from "@angular/router";
import {CurrencyService} from "../currency.service";


declare var $: any;

@Component({
  selector: 'app-currency-add',
  templateUrl: './currency-add.component.html',
  styleUrls: ['./currency-add.component.css']
})
export class CurrencyAddComponent implements OnInit {

  loginUser: any = {};
  currency: any = {};
  editBol: boolean = true;
  url = '';
  file: File;


  constructor(private el: ElementRef,
              private loginAuthService: LoginAuthService,
              private router: Router,
              private activatedRouter: ActivatedRoute,
              private currencyService: CurrencyService) {
    var input = document.querySelector('input[type=file]');

    this.loginAuthService.isLoggedIn();
    this.loginUser = JSON.parse(localStorage.getItem('currentUser'));

    /* this.currentStatus = this.loginAuthService.getStatus().subscribe( (currentStatus)=>{
       this.currentStatus = currentStatus;
       console.log(currentStatus);
     })*/

    this.activatedRouter.params.subscribe((params) => {
      const id = Number.parseInt(params['paramKey']);
      if (id) {
        //this.getBrand(id);
        this.editBol = false;
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

  addCurrency() {
    $('#saveModal').modal('show');

  }

  onFileSelected(event){

    if (event.target.files && event.target.files[0]) {
      let reader = new FileReader();
      this.file = event.target.files[0];
      let len = event.target.files.length;

      for(var i =0;i<len;i++){
        console.log(event.target.files[i]);
      }
      // reader.readAsDataURL(event.target.files[0]); // read file as data url
      //
      // reader.onload = (event:any)=>{
      //   this.url = event.target.result;
      // }
    }
  }


  confirmSave(){

    if(this.currency.currId == null){
      this.currency.crtBy = this.loginUser.user.id;
      this.currency.crtDttm = new Date();
      this.currencyService.saveCurrencyWithFile(this.loginUser.token, this.currency,this.file).subscribe((response) => {
        console.log(response);
        this.router.navigate(['admin'])
      }, (error) => {

      })
    }else{
      this.currency.updBy = this.loginUser.user.id;
      this.currency.updDttm = new Date();
      this.currencyService.updateCurrency(this.loginUser.token, this.currency).subscribe((response) => {
        console.log(response);
        this.router.navigate(['admin'])
      }, (error) => {

      })
    }
  }

}
