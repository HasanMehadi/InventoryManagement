import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {ConstantService} from "../constant.service";


@Injectable({
  providedIn: 'root'
})
export class SignupService {

  headers =new HttpHeaders({'Access-Control-Allow-Origin':'*'});
  constructor(private http: HttpClient, private constantService:ConstantService) {
    this.http = http;
  }

  public saveUser(user:any): Observable<any>{


    return this.http.post(this.constantService.mainUrl+"registration",user,{headers: this.headers});

  }

  public checkEmail(email: any):Observable<any>{

    console.log(email);
     return this.http.get(this.constantService.mainUrl+"checkEmail", {params: {email: email}});

  }
}
