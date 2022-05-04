import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurants-list-pagination',
  templateUrl: './restaurants-list-pagination.component.html',
  styleUrls: ['./restaurants-list-pagination.component.scss']
})
export class RestaurantsListPaginationComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  pageChanged($event: any){
    console.log($event);
  }

}
