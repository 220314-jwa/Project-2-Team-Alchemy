import { Component, OnInit } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';



@Component({
  selector: 'app-restaurants-list',
  templateUrl: './restaurants-list.component.html',
  styleUrls: ['./restaurants-list.component.scss']
})
export class RestaurantsListComponent implements OnInit {

  constructor() {
  }
  public restaurantSearchResult: RestaurantInfo[];

  ngOnInit() {
  }

  setSearchResult(result:RestaurantInfo[]){
    this.restaurantSearchResult = result;
  }
}