import { Component, OnInit } from '@angular/core';
import { OrderPipe } from 'ngx-order-pipe';



@Component({
  selector: 'app-restaurants-list',
  templateUrl: './restaurants-list.component.html',
  styleUrls: ['./restaurants-list.component.scss']
})
export class RestaurantsListComponent implements OnInit {

  constructor(
    private orderPipe: OrderPipe) { }

  ngOnInit() {

  }

 

}
