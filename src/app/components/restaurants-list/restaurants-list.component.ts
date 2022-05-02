import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../shared/services/api/api.service';
import { PageService } from '../../shared/services/page/page.service';
import { OrderPipe } from 'ngx-order-pipe';
import { SearchService } from '../../shared/services/common/search.service';
import { SortService } from '../../shared/services/common/sort.service';
import { PaginationService } from '../../shared/services/common/pagination.service';


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
  sortedCollection: any[];

  constructor(private apiService: ApiService, private pageService: PageService, private orderPipe: OrderPipe,
  private searchService: SearchService, private sortService: SortService, private paginationService: PaginationService) { }

  ngOnInit() {
    this.apiService.getGameList().subscribe((data: any) => {
      // console.log(data);
      this.gameListData = data;
      this.sortedCollection = this.orderPipe.transform(this.gameListData, this.order);
      this.searchService.filterValue.subscribe((value) => {
        this.filter = value;
      });
      this.sortService.sortValue.subscribe((value) => {
        this.reverse = !!(value);
      })

      this.paginationService.paginationValue.subscribe( (value) => {
        this.p = parseInt(value);
      })

      setTimeout(() => {
        this.pageService.setBodyBGHeight('board-container', 'search-container');
      }, 0);
    });



  }

 

}
