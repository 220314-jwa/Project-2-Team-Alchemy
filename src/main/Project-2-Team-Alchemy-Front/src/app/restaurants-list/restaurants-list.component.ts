import { Component, OnInit } from '@angular/core';
import { OrderPipe } from 'ngx-order-pipe';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantReviewService } from "../services/restaurant-review.service";


@Component({
  selector: 'app-restaurants-list',
  templateUrl: './restaurants-list.component.html',
  styleUrls: ['./restaurants-list.component.scss']
})
export class RestaurantsListComponent implements OnInit {

  restaurantList : RestaurantInfo[] = [{
    id:0,
		name: 'Panera Bread',
    address: "example adress",
		description: 'Panera Bread Company is an American chain store of bakery-café fast casual restaurants with over 2,000 locations,\
		 all of which are in the United States and Canada. \
		 Its headquarters are in Sunset Hills, Missouri. Wikipedia',
    avgrating: 4,
		phone: 'String'
	},
  {
    id:1,
		name: 'BurgerKing',
    address: "example adress",
		description: 'Burger King is an American multinational chain of hamburger \
    fast food restaurants. Headquartered in Miami-Dade County, Florida, the company was founded\
     in 1953 as Insta-Burger King, a Jacksonville, Florida–based restaurant chain',
    avgrating: 4,
		phone: 'String'
	}
  ];
  constructor(
    private orderPipe: OrderPipe) { }

  ngOnInit() {

  }

  ngDoCheck() {

  }

}
