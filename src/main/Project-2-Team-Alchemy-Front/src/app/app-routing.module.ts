import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginComponent } from './login/login.component';
import { RestaurantListAndReviewComponent } from './restaurant-list-and-review/restaurant-list-and-review.component';

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
