import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  getGameList() {
    return this.http.get('../../../../assets/restaurantsList.json');
  }
}
