import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SignupComponent} from './signup/signup.component';
import {LoginComponent} from "./login/login.component";


const routes: Routes = [
  {
    path: '',
    component: SignupComponent,
    data: {
      title: 'Sign Up'
    }
  },
  {
    path: '/login',
    component: LoginComponent,
    data: {
      title: 'Sign Up'
    }
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
