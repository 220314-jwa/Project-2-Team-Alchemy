import { Component, OnInit } from '@angular/core';

import { OrderPipe } from 'ngx-order-pipe';


@Component({
  selector: 'app-restaurants-list-search',
  templateUrl: './restaurants-list-search.component.html',
  styleUrls: ['./restaurants-list-search.component.scss']
})
export class RestaurantsListSearchComponent implements OnInit {

  gameListData: any;
  filter: any;
  p = 1;
  order = 'restaurantName';
  reverse = false;
  sortedCollection!: any[];

  constructor( private orderPipe: OrderPipe
  ) { }

  ngOnInit() {
  }

}
