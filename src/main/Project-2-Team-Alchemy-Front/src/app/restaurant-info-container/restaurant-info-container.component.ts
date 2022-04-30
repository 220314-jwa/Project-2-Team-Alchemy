import { AfterViewInit, Component, ElementRef, OnInit, ViewChild, ViewContainerRef } from '@angular/core';
import {  RestaurantInfo  }   from '../restaurant-info';
import { RestaurantReviewService } from "../restaurant-review.service";

@Component({
  selector: 'app-restaurant-info-container',
  templateUrl: './restaurant-info-container.component.html',
  styleUrls: ['./restaurant-info-container.component.css']
})
export class RestaurantInfoContainerComponent implements OnInit,AfterViewInit {


  @ViewChild("restaurantInfo", { read: ViewContainerRef }) input!: ViewContainerRef;

  constructor(private restaurantReviewService : RestaurantReviewService) {
  }

  ngOnInit(): void {
  }
  ngAfterViewInit(): void {
    this.restaurantReviewService.restaurantInfoContainer = this.input;
  }



}
