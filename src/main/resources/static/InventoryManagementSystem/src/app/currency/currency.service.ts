import { Injectable } from '@angular/core';
import {Router} from "@angular/router";
import {ConstantService} from "../constant.service";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {

  constructor(private router: Router, private constantService: ConstantService, private http: HttpClient) {
  }

  saveCurrency(token: any, currency: any): Observable<any> {
    const headers = new HttpHeaders({'Authorization': 'Bearer ' + token});
    return this.http.post(this.constantService.currencyUrl + '/save', currency, {headers: headers});

  }

  saveCurrencyWithFile(token: any, currency: any, file: File): Observable<any> {
    const headers = new HttpHeaders({'Authorization': 'Bearer ' + token});
    let form: FormData = new FormData();
    form.append('currency', new Blob([JSON.stringify(currency)], {type: 'application/json'}));
    form.append('file', file, file.name);
    return this.http.post(this.constantService.currencyUrl + '/save', form, {headers: headers});

  }

  updateCurrency(token: any, brand: any): Observable<any> {
    const headers = new HttpHeaders({'Authorization': 'Bearer ' + token});
    return this.http.put(this.constantService.currencyUrl + '/update', brand, {headers: headers});

  }
}
