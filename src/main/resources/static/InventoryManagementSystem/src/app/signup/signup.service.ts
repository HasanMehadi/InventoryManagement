import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class SignupService {

  mainUrl="http://localhost:8080/";
  headers =new HttpHeaders({'Access-Control-Allow-Origin':'*'});
  constructor(private http: HttpClient) {
    this.http = http;
  }

  public saveUser(user:any): Observable<any>{


    return this.http.post(this.mainUrl+"registration",user,{headers: this.headers});

  }

  public checkEmail(email: any):Observable<any>{

    console.log(email);
     return this.http.get(this.mainUrl+"checkEmail", {params: {email: email}});

  }
}
