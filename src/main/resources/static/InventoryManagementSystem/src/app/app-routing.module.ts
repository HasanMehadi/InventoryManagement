import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SignupComponent} from './signup/signup.component';
import {LoginComponent} from "./login/login.component";
import {AdminDashBoardComponent} from "./admin-dash-board/admin-dash-board.component";
import {UserDashBoardComponent} from "./user-dash-board/user-dash-board.component";
import {AuthGuard} from "./auth.guard";
import {BrandComponent} from "./brand/brand.component";
import {BrandAddComponent} from "./brand/brand-add/brand-add.component";
import {CurrencyAddComponent} from "./currency/currency-add/currency-add.component";


const routes: Routes = [
  {
    path: 'currency',
    component: CurrencyAddComponent,
    data: {
      title: 'Currency Add'
    }
  },
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
    },
    children:[
      {
        path: '',
        component:BrandComponent, canActivate:[AuthGuard],
        data:{
          title:'Brand'
        }
      },
      {
        path:'brandAdd',
        component:BrandAddComponent, canActivate:[AuthGuard]
      },
      {
        path:'brandEdit/:paramKey',
        component:BrandAddComponent, canActivate:[AuthGuard]
      }
    ]

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
    path: '',
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
