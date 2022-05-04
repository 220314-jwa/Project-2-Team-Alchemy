import { Component, OnInit, Input } from '@angular/core';
import { RestaurantReview } from '../models/restaurant-review';

@Component({
  selector: 'app-review-container',
  templateUrl: './review-container.component.html',
  styleUrls: ['./review-container.component.css']
})
export class ReviewContainerComponent implements OnInit {
  
  @Input()
  reviewData!: RestaurantReview;
  constructor(){}

  ngOnInit(): void {
  }

  checkAnonymous(){
    if(this.reviewData.username == "anonymous") return true;
    return false;
  }

}
