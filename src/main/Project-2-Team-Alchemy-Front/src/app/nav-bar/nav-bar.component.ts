import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
 
  

  constructor(public userService:UserService) { }

  ngOnInit(): void {
    this.checkLogin();
  }

  getUserLoggedIn(): boolean{
    return this.userService.getUserHasLoggedIn();
  }

  checkLogin(){
    if(sessionStorage.getItem('Login-Auth') !== null){
      this.userService.setUserHasLoggedIn(false);
    } else {
      this.userService.setUserHasLoggedIn(true);
    }
  }
  logOut(){
    this.userService.logOut();
    this.userService.setUserHasLoggedIn(false);
  }


}
