import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConstantService {

  mainUrl = "http://localhost:8080/";

  brandUrl = this.mainUrl+"brand";

  constructor() { }


}
