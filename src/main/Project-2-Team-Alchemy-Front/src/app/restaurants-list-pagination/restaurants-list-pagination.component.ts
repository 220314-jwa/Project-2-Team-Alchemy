import { Component, OnInit } from '@angular/core';
import { PaginationService } from '../services/common/pagination.service';

@Component({
  selector: 'app-restaurants-list-pagination',
  templateUrl: './restaurants-list-pagination.component.html',
  styleUrls: ['./restaurants-list-pagination.component.scss']
})
export class RestaurantsListPaginationComponent implements OnInit {

  constructor(private paginationService: PaginationService) { }

  ngOnInit() {
  }

  pageChanged($event){
    console.log($event);
    this.paginationService.pagination = $event; 
  }

}
