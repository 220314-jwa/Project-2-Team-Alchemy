import { Component, Input, OnInit } from '@angular/core';
import {RestaurantReview } from '../models/restaurant-review';

@Component({
  selector: 'app-restaurant-review-container',
  templateUrl: './restaurant-review-container.component.html',
  styleUrls: ['./restaurant-review-container.component.css']
})
export class RestaurantReviewContainerComponent implements OnInit {



  @Input()
  restaurantReviews!: Array<RestaurantReview>;
  constructor() { }

  ngOnInit(): void {
  }

  //Get review from service

}
