import { Injectable } from '@angular/core';
import {ConstantService} from "../constant.service";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class BrandService {



  constructor(private router: Router, private constantService: ConstantService, private http: HttpClient) { }

  getBrand(token: any):Observable<any>{
    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'brand',{headers: headers});
  }

  getBrandPage(token:any,page:any,size:any):Observable<any>{
    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'brand/gets',{headers: headers, params: {page: page.toString(),size:size.toString(),sort:"brandNm,desc",}});

  }

  saveBrand(token:any,brand: any):Observable<any>{

    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.post(this.constantService.brandUrl+'/save',brand,{headers: headers});

  }
}
