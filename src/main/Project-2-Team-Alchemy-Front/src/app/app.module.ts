import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; 
import { NgxPaginationModule} from 'ngx-pagination';
import { BrowserModule } from '@angular/platform-browser';
import { OrderModule } from 'ngx-order-pipe'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantReviewComponent } from './Review/restaurant-review/restaurant-review.component';
import { UserReviewComponent } from './Review/user-review/user-review.component';
import { ReviewModule } from './Review/restaurant-review.module';
import { RestaurantInfoContainerComponent } from './restaurant-info-container/restaurant-info-container.component';
import { NavTabComponent } from './nav-tab/nav-tab.component';
import { RestaurantReviewContainerComponent } from './restaurant-review-container/restaurant-review-container.component';
import { ReviewContainerComponent } from './review-container/review-container.component';
import { RestaurantContentComponent } from './restaurant-content/restaurant-content.component';
import { RestaurantsListComponent } from './restaurants-list/restaurants-list.component';
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
import { RestaurantsListSearchComponent } from './restaurants-list-search/restaurants-list-search.component';
import { RestaurantsListPaginationComponent } from './restaurants-list-pagination/restaurants-list-pagination.component';
import { HeaderComponent } from './header/header.component';
import { SearchTextPipe } from './pipe/search-text.pipe';


@NgModule({
  declarations: [
    AppComponent,
    RestaurantReviewComponent,
    UserReviewComponent,
    RestaurantInfoContainerComponent,
    NavTabComponent,
    RestaurantReviewContainerComponent,
    ReviewContainerComponent,
    RestaurantContentComponent,
    RestaurantsListComponent,
    RestaurantItemComponent,
    RestaurantListAndReviewComponent,
    RestaurantRatingComponent,
    NavBarComponent,
    HomeImgTittleComponent,
    HomePageComponent,
    LoginComponent,
    SignupComponent,
    RestaurantsListSearchComponent,
    RestaurantsListPaginationComponent,
    HeaderComponent,
    SearchTextPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReviewModule,
    HttpClientModule,
    NgModule,
    NgbModule,
    FormsModule,
    NgxPaginationModule,
    OrderModule
  ],
  providers: [
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
