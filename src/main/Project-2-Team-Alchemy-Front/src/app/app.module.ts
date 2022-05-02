import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantInfoContainerComponent } from './restaurant-info-container/restaurant-info-container.component';
import { NavTabComponent } from './nav-tab/nav-tab.component';
import { RestaurantReviewContainerComponent } from './restaurant-review-container/restaurant-review-container.component';
import { ReviewContainerComponent } from './review-container/review-container.component';
import { RestaurantContentComponent } from './restaurant-content/restaurant-content.component';
import { RestaurantListComponent } from './restaurant-list/restaurant-list.component';
import { RestaurantItemComponent } from './restaurant-item/restaurant-item.component';
import { RestaurantListAndReviewComponent } from './restaurant-list-and-review/restaurant-list-and-review.component';
import { RestaurantRatingComponent } from './restaurant-rating/restaurant-rating.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HomeImgTittleComponent } from './home-img-tittle/home-img-tittle.component';


@NgModule({
  declarations: [
    AppComponent,
    RestaurantInfoContainerComponent,
    NavTabComponent,
    RestaurantReviewContainerComponent,
    ReviewContainerComponent,
    RestaurantContentComponent,
    RestaurantListComponent,
    RestaurantItemComponent,
    RestaurantListAndReviewComponent,
    RestaurantRatingComponent,
    NavBarComponent,
    HomeImgTittleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
