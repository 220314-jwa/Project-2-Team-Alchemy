import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant-review',
  templateUrl: './restaurant-review.component.html',
  styleUrls: ['./restaurant-review.component.css']
})
export class RestaurantReviewComponent implements OnInit {

  comment = " ";		//Header display fr comment section, had rev typed in
  postComment = [];
  
  
  post()	{
    this.postComment.push(this.comment);  
    this.comment = "";
  }
  
  constructor() { }

  ngOnInit(): void {
  }

}
