import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  mainUrl="http://localhost:8080/";

  constructor(private http: HttpClient) {
    this.http = http;
  }

  public saveUser(user:any){

    const headers =new HttpHeaders({'Access-Control-Allow-Origin':'*'})

    return this.http.post(this.mainUrl+"registration",user,{headers: headers});

  }
}
