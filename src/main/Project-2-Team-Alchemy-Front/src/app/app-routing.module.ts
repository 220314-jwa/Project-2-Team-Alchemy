import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeImgTittleComponent } from './home-img-tittle/home-img-tittle.component';
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
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
