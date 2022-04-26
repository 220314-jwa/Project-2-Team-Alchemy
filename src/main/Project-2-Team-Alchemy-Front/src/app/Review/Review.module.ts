import { NgModule } from '@angular/core';
import { RestaurantReviewComponent } from './restaurant-review/restaurant-review.component';

@NgModule({

    declarations: [RestaurantReviewComponent],
    exports: [RestaurantReviewComponent]
})
export class ReviewModule {}