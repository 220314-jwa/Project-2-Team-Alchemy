import { Injectable } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { map, Observable } from 'rxjs';
import { SearchFormData } from '../models/search-form-data';
import { GlobalConstant } from '../common/global-constant';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestaurantDataService {
  headers = {'Content-type':'application/json'};

  constructor(private http:HttpClient) { 

  }


//GlobalConstant.apiURL
  getRestaurantsBySearchForm(searchForm : string): Observable<RestaurantInfo[]>{
    return this.http.get(GlobalConstant.apiURL  + '/restaurants/search/' + searchForm, {headers:this.headers}).pipe(
      map(resp => resp as RestaurantInfo[])
    );
  }
}
