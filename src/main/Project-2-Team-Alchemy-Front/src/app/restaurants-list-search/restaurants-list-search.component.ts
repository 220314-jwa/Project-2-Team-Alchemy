import { Component, OnInit, Output } from '@angular/core';
import { OrderPipe } from 'ngx-order-pipe';
import { RestaurantDataService } from '../services/restaurant-data.service';
import { RestaurantsListComponent } from '../restaurants-list/restaurants-list.component';
import { RestaurantInfo } from '../models/restaurant-info';

@Component({
  selector: 'app-restaurants-list-search',
  templateUrl: './restaurants-list-search.component.html',
  styleUrls: ['./restaurants-list-search.component.scss']
})
export class RestaurantsListSearchComponent implements OnInit {

  searchContent : string;

  public restaurantSearchResult: RestaurantInfo[];

  constructor( private dataService: RestaurantDataService,
      private restaurantListComponent: RestaurantsListComponent
  ) { 
    
  }

  ngOnInit() {
  }

  submitSearch() : void{
    this.dataService.getRestaurantsBySearchForm(this.searchContent).subscribe(
      resp => {
        this.restaurantSearchResult = resp;
        this.restaurantListComponent.setSearchResult(this.restaurantSearchResult);
    });
    //Submit fetch request here
  }

}
