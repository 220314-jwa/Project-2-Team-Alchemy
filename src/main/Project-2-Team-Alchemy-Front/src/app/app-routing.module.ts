import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { HomeImgTittleComponent } from './home-img-tittle/home-img-tittle.component';
import { SignupComponent } from './signup/signup.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginComponent } from './login/login.component';
import { RestaurantsListComponent } from './restaurants-list/restaurants-list-.component';

const routes: Routes = [
  {
    path:'',
    component: HomePageComponent
  },
  {
    path:'home',
    component: HomePageComponent
  },
  {
    path:'restaurant-list',
    component:RestaurantsListComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'signUp',
    component:SignupComponent
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
