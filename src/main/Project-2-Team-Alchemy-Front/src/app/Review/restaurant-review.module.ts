import { NgModule } from '@angular/core';
import { RestaurantReviewComponent } from './restaurant-review/restaurant-review.component';
import { RestaurantReviewDataTypeComponent } from './restaurant-review-data-types/restaurant-review-data-type.component';
import { RestaurantReviewService } from '../restaurant-review.service';
import { UserReviewComponent } from './user-review/user-review.component';

@NgModule({

    declarations: [RestaurantReviewComponent, RestaurantReviewDataTypeComponent, UserReviewComponent],
    exports: [RestaurantReviewComponent],
    providers: [RestaurantReviewService]
})
export class ReviewModule {}