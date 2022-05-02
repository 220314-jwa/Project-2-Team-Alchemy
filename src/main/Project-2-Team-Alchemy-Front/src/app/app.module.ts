import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { RestaurantReviewComponent } from './Review/restaurant-review/restaurant-review.component';
import { ReviewModule } from './Review/Review.module';
=======
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
import { HomePageComponent } from './home-page/home-page.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from '@angular/forms';
import { UserService } from './services/user.service';
>>>>>>> e1c748bc3d58fb94b36695845988256e86f7a8e0


@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    RestaurantReviewComponent
=======
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
    HomeImgTittleComponent,
    HomePageComponent,
    LoginComponent,
    SignupComponent
>>>>>>> e1c748bc3d58fb94b36695845988256e86f7a8e0
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    ReviewModule
=======
    NgbModule,
    FormsModule
  ],
  providers: [
    UserService
>>>>>>> e1c748bc3d58fb94b36695845988256e86f7a8e0
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
