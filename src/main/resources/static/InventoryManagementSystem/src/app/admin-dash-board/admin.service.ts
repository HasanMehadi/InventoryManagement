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

    console.log(token);

    const headers = new HttpHeaders({'Authorization': 'Bearer '+token});
    return this.http.get(this.constantService.mainUrl+'users',{headers: headers});
  }
}
