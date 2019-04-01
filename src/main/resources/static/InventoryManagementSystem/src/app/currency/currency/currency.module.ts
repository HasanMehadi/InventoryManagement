import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CurrencyComponent} from "../currency.component";
import {CurrencyAddComponent} from "../currency-add/currency-add.component";
import {CurrencyService} from "../currency.service";
import {FormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import {NgxPaginationModule} from "ngx-pagination";

@NgModule({
  declarations: [CurrencyComponent,CurrencyAddComponent],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule,
    NgxPaginationModule
  ],
  providers:[CurrencyService]
})
export class CurrencyModule { }
