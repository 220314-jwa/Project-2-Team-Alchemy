import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SortService {
 
  sortValue = new BehaviorSubject('');

  constructor() { }

  set sort(value){
    this.sortValue.next(value);
  }

  get sort(){
    return this.sort;
  }
}
