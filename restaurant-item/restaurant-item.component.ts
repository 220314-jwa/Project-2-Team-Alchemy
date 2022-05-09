import { Component, ComponentRef, ElementRef, Input, OnInit, ViewChild, ViewContainerRef } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantReviewService } from '../services/restaurant-review.service';

@Component({
  selector: 'app-restaurant-item',
  templateUrl: './restaurant-item.component.html',
  styleUrls: ['./restaurant-item.component.css']
})
export class RestaurantItemComponent implements OnInit {
/*
  restaurantInfoExamples : Array<RestaurantInfo> = [{
    id:0,
		restaurantName: 'Panera Bread',
		restaurantDescription: 'Panera Bread Company is an American chain store of bakery-café fast casual restaurants with over 2,000 locations,\
		 all of which are in the United States and Canada. \
		 Its headquarters are in Sunset Hills, Missouri. Wikipedia',
		restaurantRating: 4,
		restaurantImage: 'String'
	},
  {
    id:1,
		restaurantName: 'BurgerKing',
		restaurantDescription: 'Burger King is an American multinational chain of hamburger \
    fast food restaurants. Headquartered in Miami-Dade County, Florida, the company was founded\
     in 1953 as Insta-Burger King, a Jacksonville, Florida–based restaurant chain',
		restaurantRating: 4,
		restaurantImage: 'String'
	}

  ];
  */
  @Input()
  restaurantInfo: RestaurantInfo;
  
  constructor(private restaurantReviewService : RestaurantReviewService) { }

  ngOnInit(): void {
  }

  /*
    name:showRestaurantInfo
    description: create Restaurant Info Component with
      while passing in restaurant information
    Input: restaurantInfo Interface<RestaurantInfo>
    Ouput: void

    showRestaurantInfo(restaurantInfo: RestaurantInfo){
      this.restaurantReviewService.createRestaurantInfo(restaurantInfo);
    }
  */
  //Example for debugging purposes
  showRestaurantInfo(id: number){
    //this.restaurantReviewService.createRestaurantInfo(this.restaurantInfoExamples[id]);
    this.restaurantReviewService.createRestaurantInfo(this.restaurantInfo);
  }
}
