import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {BrandComponent} from "../brand.component";
import {BrandService} from "../brand.service";
import {FormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import {NgxPaginationModule} from "ngx-pagination";
import {BrandAddComponent} from "../brand-add/brand-add.component";

@NgModule({
  declarations: [BrandComponent,BrandAddComponent],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule,
    NgxPaginationModule
  ],
  providers: [BrandService]
})
export class BrandModule { }
