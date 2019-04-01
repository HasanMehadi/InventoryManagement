import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ProductComponent} from "../product.component";
import {ProductAddComponent} from "../product-add/product-add.component";
import {ProductService} from "../product.service";
import {FormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import {NgxPaginationModule} from "ngx-pagination";


@NgModule({
  declarations: [ProductComponent,ProductAddComponent],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule,
    NgxPaginationModule
  ],
  providers: [ProductService]
})
export class ProductModule { }
