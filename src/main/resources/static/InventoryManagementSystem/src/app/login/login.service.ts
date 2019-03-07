import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  mainUrl="http://localhost:8080/";
  headers =new HttpHeaders({'Access-Control-Allow-Origin':'*'});

  constructor(private http: HttpClient) {
    this.http = http;
  }

  public loginUser(user:any): Observable<any>{

    return this.http.post(this.mainUrl+"login",user,{headers: this.headers});

  }
}
