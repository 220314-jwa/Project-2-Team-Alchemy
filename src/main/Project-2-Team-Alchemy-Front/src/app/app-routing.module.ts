import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { HomeImgTittleComponent } from './home-img-tittle/home-img-tittle.component';
import { LoginComponent } from './login/login.component';
import { RestaurantListAndReviewComponent } from './restaurant-list-and-review/restaurant-list-and-review.component';

const routes: Routes = [
  {
    path:'',
    component: HomeImgTittleComponent
  },
  {
    path:'home',
    component: HomeImgTittleComponent
  },
  {
    path:'restaurant-list',
    component:RestaurantListAndReviewComponent
  },
  {
    path:'login',
    component:LoginComponent
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
