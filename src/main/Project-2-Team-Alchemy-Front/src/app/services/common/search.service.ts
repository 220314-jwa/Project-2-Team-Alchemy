import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class SearchService {

  filterValue = new BehaviorSubject('');

  constructor() { }

  set filter(value) {
    this.filterValue.next(value);
  }

  get filter() {
    return this.filter;
  }
}
