import { Injectable } from '@angular/core';
import { RestaurantReviewInterface } from './restaurant-review-interface';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestaurantReviewService {
  constructor(private httpClient: HttpClient) { }

  getReviews(): Observable<RestaurantReviewInterface[]>{
    return this.httpClient.get('http://localhost:3000/restaurant-review');
     //refer to pg1 on interface conn if error shows up l8r

  }

  
}
