import { Component, OnInit, Input, ViewChild, ElementRef, ViewContainerRef } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantReview } from '../models/restaurant-review';
import { RestaurantReviewContainerComponent } from '../restaurant-review-container/restaurant-review-container.component';
import { RestaurantReviewComponent } from '../restaurant-review/restaurant-review.component';

@Component({
  selector: 'app-restaurant-content',
  templateUrl: './restaurant-content.component.html',
  styleUrls: ['./restaurant-content.component.css']
})
export class RestaurantContentComponent implements OnInit {
  examples : Array<RestaurantReview> = [
    { users: 'example1',
      reviewId: 1,
      reviewtext: 'The service was alright. The new waitress was amazing \
      and very sweet but the man who seemed like the restaurant owner greeted everyone \
      personally except me and my girlfriend, which we found offensive. The mussels were very \
      delicious but the chicken and braided salmon had literally no flavor or seasoning. Not worth the price.',
      rating: 1,
      reviewrating: 1,
      datecreated: "mm-dd-yy",
      restaurant_id: 1,
    },
    { reviewId:1,
      users: 'example2',
      reviewtext: 'example2',
      rating: 1,
      reviewrating: 1,
      datecreated: "mm-dd-yy",
      restaurant_id: 1,
    },
  ];

  @ViewChild('thisComponent') thisComponent!: ElementRef;
  @ViewChild('restaurantReview', { read: ViewContainerRef }) reviewComponent!: ViewContainerRef;

  @Input()
  restaurantInfo!: RestaurantInfo;
  constructor() { 
  }

  ngOnInit(): void {

  }

  fetchData(){
    
  }

  loadWriteReview(){
    this.reviewComponent.clear();
    var reviewComponent = this.reviewComponent.createComponent(RestaurantReviewComponent);
  }

  loadUserReviews(){
    //Need a fetch request to grab from database
    this.reviewComponent.clear();
    var reviewComponent = this.reviewComponent.createComponent(RestaurantReviewContainerComponent);
    reviewComponent.instance.restaurantReviews = this.examples;
  }

}
