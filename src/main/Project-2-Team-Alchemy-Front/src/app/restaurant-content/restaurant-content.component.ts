import { Component, OnInit, Input, ViewChild, ElementRef, ViewContainerRef } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantReview } from '../models/restaurant-review';
import { RestaurantReviewContainerComponent } from '../restaurant-review-container/restaurant-review-container.component';
import { RestaurantReviewComponent } from '../restaurant-review/restaurant-review.component';
import { RestaurantReviewService } from '../services/restaurant-review.service';
import { GlobalConstant } from '../common/global-constant';

@Component({
  selector: 'app-restaurant-content',
  templateUrl: './restaurant-content.component.html',
  styleUrls: ['./restaurant-content.component.css']
})
export class RestaurantContentComponent implements OnInit {
  /*examples : Array<RestaurantReview> = [
    { users: 'example1',
      reviewId: 1,
      reviewtext: 'The service was alright. The new waitress was amazing \
      and very sweet but the man who seemed like the restaurant owner greeted everyone \
      personally except me and my girlfriend, which we found offensive. The mussels were very \
      delicious but the chicken and braided salmon had literally no flavor or seasoning. Not worth the price.',
      rating: 1,
      reviewrating: 1,
      datecreated: "mm-dd-yy",
      restaurant: 1,
    },
    { reviewId:1,
      users: 'example2',
      reviewtext: 'example2',
      rating: 1,
      reviewrating: 1,
      datecreated: "mm-dd-yy",
      restaurant: 1,
    },
  ];*/

  @ViewChild('thisComponent') thisComponent!: ElementRef;
  @ViewChild('restaurantReview', { read: ViewContainerRef }) reviewComponent!: ViewContainerRef;

  @Input()
  restaurantInfo!: RestaurantInfo;

  restaurantReview:RestaurantReview[];
  constructor( private restaurantReviewService:RestaurantReviewService) { 
  }

  ngOnInit(): void {

  }

  fetchData(){
    
  }

  //Get reviews

  loadWriteReview(){
    this.reviewComponent.clear();
    var reviewComponent = this.reviewComponent.createComponent(RestaurantReviewComponent);
    reviewComponent.instance.restaurantId = this.restaurantInfo.id;
  }

  loadUserReviews(): void{
    this.restaurantReviewService.loadReview(this.restaurantInfo.id).subscribe(
      resp => {
        this.restaurantReview = resp;
        this.reviewComponent.clear();
        var reviewComponent = this.reviewComponent.createComponent(RestaurantReviewContainerComponent);
        reviewComponent.instance.restaurantReviews = this.restaurantReview;
      },
    );

  }

}
