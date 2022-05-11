import { NgModule } from '@angular/core';
import { NgxPaginationModule } from 'ngx-pagination';
import { BrowserModule } from '@angular/platform-browser';
import { OrderModule } from 'ngx-order-pipe';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { DatePipe } from '@angular/common';

import { AppComponent } from './app.component';
import { RestaurantInfoContainerComponent } from './restaurant-info-container/restaurant-info-container.component';
import { RestaurantReviewContainerComponent } from './restaurant-review-container/restaurant-review-container.component';
import { ReviewContainerComponent } from './review-container/review-container.component';
import { RestaurantContentComponent } from './restaurant-content/restaurant-content.component';
import { RestaurantsListComponent } from './restaurants-list/restaurants-list.component';
import { RestaurantItemComponent } from './restaurant-item/restaurant-item.component';
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
import { RestaurantReviewComponent } from './restaurant-review/restaurant-review.component';



@NgModule({
  declarations: [
    AppComponent,
    RestaurantInfoContainerComponent,
    RestaurantReviewContainerComponent,
    ReviewContainerComponent,
    RestaurantContentComponent,
    RestaurantsListComponent,
    RestaurantItemComponent,
    RestaurantRatingComponent,
    NavBarComponent,
    HomeImgTittleComponent,
    HomePageComponent,
    LoginComponent,
    SignupComponent,
    RestaurantsListSearchComponent,
    RestaurantsListPaginationComponent,
    HeaderComponent,
    SearchTextPipe,
    RestaurantReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    NgxPaginationModule,
    OrderModule,
    HttpClientModule
  ],
  providers: [
    UserService,
    DatePipe
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
