import { Component, OnInit } from '@angular/core';
import { OrderPipe } from 'ngx-order-pipe';



@Component({
  selector: 'app-restaurants-list',
  templateUrl: './restaurants-list.component.html',
  styleUrls: ['./restaurants-list.component.scss']
})
export class RestaurantsListComponent implements OnInit {

  gameListData: any;
  filter: any;
  p = 1;
  order = 'title';
  reverse = false;
  caseInsensitive = false;
  sortedCollection!: any[];

  constructor(
    private orderPipe: OrderPipe) { }

  ngOnInit() {

  }

 

}
