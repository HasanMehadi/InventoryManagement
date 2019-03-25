import { Injectable } from '@angular/core';
import {ConstantService} from "../constant.service";
import {Router} from "@angular/router";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private router: Router, private constantService: ConstantService, private http: HttpClient) {

  }

  getAllUser(token: any):Observable<any>{
    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'users',{headers: headers});
  }

  getBrand(token: any):Observable<any>{
    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'brand',{headers: headers});
  }

  getBrandPage(token:any,page:any,size:any):Observable<any>{
    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'brand/gets',{headers: headers, params: {page: page.toString(),size:size.toString(),sort:"brandNm,desc",}});

  }
}
