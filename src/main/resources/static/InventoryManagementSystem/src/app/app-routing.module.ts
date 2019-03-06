import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SignupComponent} from "./signup/signup.component";


const routes: Routes = [{
  path: '',
  component: SignupComponent,
  data: {
    title: 'Sign Up'
  }
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
