import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { MyComponent } from './my/my.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { ApplicableRefactorInfo } from 'typescript';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CustomerComponent } from './customer/customer.component';
import { DonateComponent } from './donate/donate.component';
import { AdminComponent } from './admin/admin.component';
import { ReceiveComponent } from './receive/receive.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ReceivedetailsComponent } from './receivedetails/receivedetails.component';
import { HomeComponent } from './home/home.component';
import { LogoutComponent } from './logout/logout.component';

 const appRoutes: Routes = [
  {path: 'login', component : LoginComponent},
  {path: 'home', component : HomeComponent},
  {path: 'register', component : RegisterComponent},
  {path: 'customer', component : CustomerComponent},
  {path: 'donor', component : DonateComponent},
  {path: 'receive', component : ReceiveComponent},
  {path: 'admin', component : AdminComponent},
  {path: 'adminlogin', component : AdminloginComponent},
  {path: 'receivedetails', component : ReceivedetailsComponent},
 ];

@NgModule({
  declarations: [
    AppComponent,
    MyComponent,
    LoginComponent,
    RegisterComponent,
    CustomerComponent,
    DonateComponent,
    AdminComponent,
    ReceiveComponent,
    AdminloginComponent,
    ReceivedetailsComponent,
    HomeComponent,
    LogoutComponent

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
