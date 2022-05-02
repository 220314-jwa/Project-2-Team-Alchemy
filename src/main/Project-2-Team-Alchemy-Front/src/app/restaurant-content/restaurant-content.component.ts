import { Component, OnInit, Input, ViewChild, ElementRef, ViewContainerRef } from '@angular/core';
import { RestaurantInfo } from '../restaurant-info';
import { RestaurantReview } from '../restaurant-review';
import { RestaurantReviewContainerComponent } from '../restaurant-review-container/restaurant-review-container.component';

@Component({
  selector: 'app-restaurant-content',
  templateUrl: './restaurant-content.component.html',
  styleUrls: ['./restaurant-content.component.css']
})
export class RestaurantContentComponent implements OnInit {
  examples : Array<RestaurantReview> = [
    { username: 'example1',
      reviewContent: 'The service was alright. The new waitress was amazing \
      and very sweet but the man who seemed like the restaurant owner greeted everyone \
      personally except me and my girlfriend, which we found offensive. The mussels were very \
      delicious but the chicken and braided salmon had literally no flavor or seasoning. Not worth the price.',
      userRating: 'example1'
    },
    { username: 'example2',
    reviewContent: 'example2',
    userRating: 'example2'
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

  loadUserReviews(){
    //Need a fetch request to grab from database
    this.reviewComponent.clear();
    var reviewComponent = this.reviewComponent.createComponent(RestaurantReviewContainerComponent);
    reviewComponent.instance.restaurantReviews = this.examples;
  }

}
