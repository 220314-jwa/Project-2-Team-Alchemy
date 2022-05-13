import { HttpRequest } from '@angular/common/http';
import { ComponentRef, ElementRef, Injectable,ViewContainerRef  } from '@angular/core';
import { map, Observable } from 'rxjs';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantReview } from '../models/restaurant-review';
import { RestaurantContentComponent } from '../restaurant-content/restaurant-content.component';
import { HttpClient } from '@angular/common/http';
import { GlobalConstant } from '../common/global-constant';

@Injectable({
  providedIn: 'root'
})
export class RestaurantReviewService {
  headers = {'Content-type':'application/json'};

  restaurantMap = new Map<number,any>();
  public restaurantInfoContainer!: ViewContainerRef;
  private currentInfo!: any;

  constructor(private http:HttpClient) {
  }


  
  public createRestaurantInfo(restaurantInfo: RestaurantInfo) {
    this.hideInfo();
    if(this.checkIfInfoLoaded(restaurantInfo.id)){ 
      this.displayInfo(restaurantInfo.id);
      return;
    }
    console.log(restaurantInfo);
    this.currentInfo = this.restaurantInfoContainer.createComponent(RestaurantContentComponent);
    this.currentInfo.instance.restaurantInfo = restaurantInfo;
  
  }


  hideInfo(/*id: number*/){
    //var eleId = this.restaurantMap.get(id);
    //var element = document.getElementById(eleId!);
    if(this.currentInfo == undefined) {
      console.log("undefined");
      return;
    }
    this.currentInfo.instance.thisComponent.nativeElement.style.setProperty("display","none");

  }

  checkIfInfoLoaded(id: number){
    return this.restaurantMap.has(id);
  }

  displayInfo(id: number){
    var eleId = this.restaurantMap.get(id);
    eleId.instance.thisComponent.nativeElement.style.setProperty("display","flex");
    this.currentInfo = eleId;
  }

  
  loadReview(restaurant_id : number): Observable<RestaurantReview[]>{
    console.log(restaurant_id);
    return this.http.get(GlobalConstant.apiURL +"/restaurants/"+ restaurant_id +'/get-reviews', {headers:this.headers}).pipe(
      map(resp=>resp as RestaurantReview[])
    );
  }
}
