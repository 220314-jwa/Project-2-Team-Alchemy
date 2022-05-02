import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { RestaurantsListComponent } from './components/restaurants-list/restaurants-list.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';


import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { NgHttpLoaderModule } from 'ng-http-loader/ng-http-loader.module';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { OrderModule } from 'ngx-order-pipe';
import { NgxPaginationModule } from 'ngx-pagination';
import { RestaurantsListSearchComponent } from './components/restaurants-list-search/restaurants-list-search.component';
import { RestaurantsListPaginationComponent } from './components/restaurants-list-pagination/restaurants-list-pagination.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RestaurantsListComponent,
    PageNotFoundComponent,
    RestaurantsListSearchComponent,
    RestaurantsListPaginationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgHttpLoaderModule,
    FormsModule,
    Ng2SearchPipeModule,
    OrderModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
