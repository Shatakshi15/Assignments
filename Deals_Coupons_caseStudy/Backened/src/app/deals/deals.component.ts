import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-deals',
  templateUrl: './deals.component.html',
  styleUrls: ['./deals.component.css']
})
export class DealsComponent implements OnInit {

  constructor(private _http:HttpClient,private service:LoginService) { }
  searchText;
  coupon:any;
  public loggedIn=false;
  ngOnInit(): void {
    if(this.service.isLoggedIn())
    {
      this.loggedIn=true;
    }
    else{
      this.loggedIn=false;
    }
    this._http.get<any>('./assets/classes/deals.json')
    .subscribe(response => {
  
      // If response comes hideloader() function is called
      // to hide that loader 
      console.log(response);

      this.coupon=response;
      console.log(this.coupon);
      },
      error=>{
        console.log(error);
      });
  }
  logoutUser()
  {
    this.service.logout();
    location.reload();
  }

}
