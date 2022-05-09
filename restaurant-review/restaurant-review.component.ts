import { Component, Input, OnInit, ViewChild } from '@angular/core';
import { RestaurantReview } from '../models/restaurant-review';
import { HttpClient } from '@angular/common/http';
import { DatePipe } from '@angular/common';
import { RestaurantRatingComponent } from '../restaurant-rating/restaurant-rating.component';

@Component({
  selector: 'app-restaurant-review',
  templateUrl: './restaurant-review.component.html',
  styleUrls: ['./restaurant-review.component.css']
})
export class RestaurantReviewComponent implements OnInit {
  url = window.location.href;
  restaurantReview!: RestaurantReview;
  @ViewChild("rating") restaurantRatingComponent: RestaurantRatingComponent;

  @Input()
  restaurantId : number;
  constructor(private http : HttpClient,
              private dataPipe: DatePipe
    ){

    this.restaurantReview = new RestaurantReview(-1,"test",0,"",0,"",this.restaurantId
    );
  }

  ngOnInit(){
    this.restaurantReview = new RestaurantReview(-1,"test",0,"",0,"",this.restaurantId);
	}

  async submitReview()
  {
    this.restaurantReview.rating = this.restaurantRatingComponent.getValue();
    var date=new Date();
    let latest_date =this.dataPipe.transform(date, 'long');
    this.restaurantReview.datecreated = latest_date.toString();
    this.restaurantReview.users = sessionStorage.getItem('Login-Auth');

    let restaurantReviewJson = JSON.stringify(this.restaurantReview);
    let httpResp = await fetch(this.url + '/restaurants/'+this.restaurantId+ '/post-reviews',
            {method:'POST' , body:restaurantReviewJson});
    if(httpResp && httpResp.status === 200){
      //take the user to reivew
    }else{
      //Tell user submission fail
    }
  }
}