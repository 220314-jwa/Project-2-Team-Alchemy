import { Component, Input, OnInit, ViewChild } from '@angular/core';
import { RestaurantReview } from '../models/restaurant-review';
import { HttpClient } from '@angular/common/http';
import { DatePipe } from '@angular/common';
import { RestaurantRatingComponent } from '../restaurant-rating/restaurant-rating.component';
import { GlobalConstant } from '../common/global-constant';

@Component({
  selector: 'app-restaurant-review',
  templateUrl: './restaurant-review.component.html',
  styleUrls: ['./restaurant-review.component.css']
})
export class RestaurantReviewComponent implements OnInit {
  url = window.location.href;
  rating: number = 0;
  reviewText: string;
  @ViewChild("review-star-rating") restaurantRatingComponent: RestaurantRatingComponent;

  @Input()
  restaurantId : number;
  constructor(private http : HttpClient,
    ){

  }

  ngOnInit(){
	}

  async submitReview()
  {
    var userId:String;
    if(sessionStorage.getItem('Login-Auth') !== null){
      userId = sessionStorage.getItem('Login-Auth');
      let credentials = {
        user_id: userId,
        rating: this.rating,
        reviewtext: this.reviewText,
      }

      let restaurantReviewJson = JSON.stringify(credentials);
      //GlobalConstant.apiURL 
      let httpResp = await fetch(GlobalConstant.apiURL + '/restaurants/'+this.restaurantId+ '/post-reviews',
              {method:'POST' , body:restaurantReviewJson});
      if(httpResp && httpResp.status === 200){
        //take the user to reivew
      }else{
        //Tell user submission fail
      }
    }
  }
}