import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant-review',
  templateUrl: './restaurant-review.component.html',
  styleUrls: ['./restaurant-review.component.css']
})
export class RestaurantReviewComponent implements OnInit {

  ngOnInit(){

	}

title :"Reviews";
  displayVal:any='';

  getValue(val:any)
  {
      console.log(val);
      this.displayVal=(val);
      
  }
}