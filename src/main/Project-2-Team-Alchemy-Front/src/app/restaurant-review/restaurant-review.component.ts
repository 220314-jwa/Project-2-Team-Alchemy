import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
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
  reviewText: string;

  @ViewChild(RestaurantRatingComponent) 
  private restaurantRatingComponent = {} as RestaurantRatingComponent;

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
      console.log(this.restaurantRatingComponent.getValue());
      let credentials = {
        user_id:sessionStorage.getItem('user-id'),
        rating: this.restaurantRatingComponent.getValue(),
        reviewtext: this.reviewText,
      }

      let restaurantReviewJson = JSON.stringify(credentials);
      //GlobalConstant.apiURL 
      let httpResp = await fetch(GlobalConstant.apiURL + '/restaurants/'+this.restaurantId+ '/post-reviews',
              {method:'POST' , body:restaurantReviewJson, headers: {
                'Content-Type': 'application/json'
              }});
      if(httpResp && httpResp.status === 200){
        //take the user to reivew
      }else{
        //Tell user submission fail
      }
    }
  }
}