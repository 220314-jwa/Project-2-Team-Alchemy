import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaginationService {

  paginationValue = new BehaviorSubject('');

  constructor() { }

  set pagination(value){
    this.paginationValue.next(value);
  }

  get pagination() : any{
    return this.pagination;
  }
}
