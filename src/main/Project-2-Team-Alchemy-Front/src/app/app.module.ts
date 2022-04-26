import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantReviewComponent } from './Review/restaurant-review/restaurant-review.component';
import { ReviewModule } from './Review/Review.module';


@NgModule({
  declarations: [
    AppComponent,
    RestaurantReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReviewModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
