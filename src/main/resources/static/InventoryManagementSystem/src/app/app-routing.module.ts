import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SignupComponent} from './signup/signup.component';
import {LoginComponent} from "./login/login.component";
import {AdminDashBoardComponent} from "./admin-dash-board/admin-dash-board.component";
import {UserDashBoardComponent} from "./user-dash-board/user-dash-board.component";
import {AuthGuard} from "./auth.guard";


const routes: Routes = [
  {
    path: 'signUp',
    component: SignupComponent,
    data: {
      title: 'Sign Up'
    }
  },
  {
    path: 'admin',
    component: AdminDashBoardComponent, canActivate:[AuthGuard],
    data: {
      title: 'Admin Dash Board'
    }
  },
  {
    path: 'user',
    component: UserDashBoardComponent,canActivate:[AuthGuard],
    data: {
      title: 'User Dash Board'
    }
  }
  ,
  {
    path: 'login',
    component: LoginComponent,
    data: {
      title: 'Login'
    }
  }
  ,{
    path:'**', pathMatch:'full', redirectTo:''
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
