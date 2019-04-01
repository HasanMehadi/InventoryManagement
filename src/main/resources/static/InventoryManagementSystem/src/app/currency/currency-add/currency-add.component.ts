import {Component, ElementRef, HostListener, OnInit} from '@angular/core';
import {LoginAuthService} from "../../login/login-auth.service";
import {ActivatedRoute, Router} from "@angular/router";


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

  constructor(private el: ElementRef,
              private loginAuthService: LoginAuthService,
              private router: Router,
              private activatedRouter: ActivatedRoute) {
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

  }

  onFileSelected(event){

    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event:any)=>{
        this.url = event.target.result;
      }
    }
  }

}
