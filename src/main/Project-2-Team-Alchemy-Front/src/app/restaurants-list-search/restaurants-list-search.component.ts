import { Component, OnInit, Output } from '@angular/core';
import { OrderPipe } from 'ngx-order-pipe';
import { RestaurantDataService } from '../services/restaurant-data.service';

@Component({
  selector: 'app-restaurants-list-search',
  templateUrl: './restaurants-list-search.component.html',
  styleUrls: ['./restaurants-list-search.component.scss']
})
export class RestaurantsListSearchComponent implements OnInit {

  searchContent : string;

  
  constructor( private dataService: RestaurantDataService
  ) { }

  ngOnInit() {
  }

  submitSearch(){
    this.dataService.getRestaurantsBySearchForm(this.searchContent);
    //Submit fetch request here

  }

}
