import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {SignupComponent} from './signup/signup.component';
import {LoginComponent} from './login/login.component';
import {HttpClientModule} from "@angular/common/http";
import {SignupService} from "./signup/signup.service";
import {AdminDashBoardComponent} from './admin-dash-board/admin-dash-board.component';
import {UserDashBoardComponent} from './user-dash-board/user-dash-board.component';
import {LoginService} from "./login/login.service";
import {AuthGuard} from "./auth.guard";

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    AdminDashBoardComponent,
    UserDashBoardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

  ],
  providers: [SignupService, LoginService,AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule {
}
