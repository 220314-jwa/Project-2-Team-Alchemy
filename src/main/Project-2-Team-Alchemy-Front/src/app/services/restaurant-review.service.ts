import { ComponentRef, ElementRef, Injectable,ViewContainerRef  } from '@angular/core';
import { RestaurantInfo } from '../models/restaurant-info';
import { RestaurantContentComponent } from '../restaurant-content/restaurant-content.component';

@Injectable({
  providedIn: 'root'
})
export class RestaurantReviewService {

  restaurantMap = new Map<number,any>();
  public restaurantInfoContainer!: ViewContainerRef;
  private currentInfo!: any;

  constructor() {
  }

  
  createRestaurantInfo(restaurantInfo: RestaurantInfo) {
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

}
