import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CustomersComponent } from './customers/customers.component';
import { ProductsComponent } from './products/products.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { DataFromJsonComponent } from './data-from-json/data-from-json.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CustomersComponent,
    ProductsComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    PageNotFoundComponent,
    DataFromJsonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
    {path : '' , component: HomeComponent},
    {path : 'customers' , component: CustomersComponent},
    {path : 'products' , component: ProductsComponent},
    {path : 'login' , component: LoginComponent},
    {path : 'footer' , component: FooterComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
