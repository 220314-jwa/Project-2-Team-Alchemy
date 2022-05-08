import { Injectable } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SearchFormData } from '../models/search-form-data';

@Injectable({
  providedIn: 'root'
})
export class RestaurantDataService {
  url:string = window.location.href;

  public restaurantSearchResult!: RestaurantInfo[];
  constructor(private http : HttpClient) { 

  }

  getRestaurantsBySearchForm(searchForm : SearchFormData) : RestaurantInfo[]{
    let searchFormJSON = JSON.stringify(searchForm);
    this.restaurantSearchResult = this.http.put(this.url + '', {body: searchFormJSON}) as any;
    return this.restaurantSearchResult;
  }

}
