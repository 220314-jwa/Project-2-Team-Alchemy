import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../shared/services/api/api.service';
import { PageService } from '../../shared/services/page/page.service';
import { OrderPipe } from 'ngx-order-pipe';
import { SearchService } from '../../shared/services/common/search.service';
import { SortService } from '../../shared/services/common/sort.service';


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
  sortedCollection: any[];

  constructor(private apiService: ApiService, private pageService: PageService, 
    private orderPipe: OrderPipe, private searchService: SearchService, private sortService: SortService) { }

  setOrder(value: string) {
    this.reverse = !this.reverse;
    this.sortService.sort = this.reverse;
    console.log(value);
    setTimeout(() => {
      this.pageService.setBodyBGHeight('board-container', 'search-container');
    }, 0);
  }


  checkQuery(filter) {
    console.log(filter);
    this.searchService.filter = filter;
    setTimeout(() => {
      this.pageService.setBodyBGHeight('board-container', 'search-container');
    }, 0);
  }


  ngOnInit() {
  }

}
