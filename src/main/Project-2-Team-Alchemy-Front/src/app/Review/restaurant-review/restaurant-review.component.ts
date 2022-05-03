import { Component, OnInIt, Input} from '@angular/core';
import { RestaurantReview } from 'src/app/restaurant-review';

@Component({
  selector: 'app-restaurant-review',
  templateUrl: './restaurant-review.component.html',
  styleUrls: ['./restaurant-review.component.css']
})
export class RestaurantReviewComponent implements OnInIt{

  @Input() currentUserId!: string | null;

  constructor(private RestaurantReviewService: any) {}

  ngOnInit(): void{
    this.RestaurantReviewService.getReviews().subscribe((RestaurantReview: any) => {
      console.log('Reviews', RestaurantReview);
    });
  }
  
}
