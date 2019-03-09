import { Component } from '@angular/core';
import { LoginAuthService} from "./login/login-auth.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'InventoryManagementSystem';

  public currentStatus: any;

  constructor( private loginAuthService: LoginAuthService){

    this.currentStatus = loginAuthService.getStatus().subscribe( (currentStatus)=>{
      this.currentStatus = currentStatus;
      console.log(currentStatus);
    })

  }


}
