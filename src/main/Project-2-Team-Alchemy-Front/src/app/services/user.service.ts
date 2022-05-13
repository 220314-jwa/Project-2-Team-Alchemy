import { Injectable } from '@angular/core';
import { GlobalConstant } from '../common/global-constant';
import { Login } from '../models/login';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  headers = {'Content-type':'application/json'};
  private userHasLoggedIn:boolean = false;

  constructor() { }

  setUserHasLoggedIn(setVal:boolean){
    this.userHasLoggedIn = setVal;
  }

  getUserHasLoggedIn():boolean{
    return this.userHasLoggedIn;
  }
  
  async checkLogin(): Promise<boolean> {
    
    let username = sessionStorage.getItem('Login-Auth');
    //GlobalConstant.apiURL
    let credentialsJSON = JSON.stringify(username);

    let httpResp = await fetch(GlobalConstant.apiURL + '/users/checklogin',{method:'POST' ,
                                                                        body:credentialsJSON,
                                                                        headers: {
                                                                          'Content-Type': 'application/json'
                                                                        }});
    if(httpResp && httpResp.status === 200){
      return true;
    }else{
      return false;
    }
  }

  async logIn(credentials:any): Promise<boolean>{
    let credentialsJSON = JSON.stringify(credentials);
    let httpResp = await fetch(GlobalConstant.apiURL  + '/users/login', {method:'POST' ,
                                                                          body:credentialsJSON,
                                                                          headers: {
                                                                            'Content-Type': 'application/json'
                                                                          }});
    if(httpResp && httpResp.status === 200){
      let user = await httpResp.json();
      sessionStorage.setItem('Login-Auth', user.username.toString());
      sessionStorage.setItem('user-id', user.id.toString());
      this.userHasLoggedIn = true;
    }
    return this.userHasLoggedIn;
  }




  logOut(): void{
    sessionStorage.removeItem('Login-Auth');
  }
}
