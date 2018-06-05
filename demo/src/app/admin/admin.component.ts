import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { RouterModule, Routes, Router } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  data;
  constructor( private http: HttpClient) { }

  ngOnInit() {
  }
  
   onclick(event) {
    console.log(event);
    alert('button clicked');
    this.http.get('Restfulapi/webresources/myresource/donorhistory')
      .subscribe(res => {
     this.data = res;
      console.log(this.data);
  });
  }
  
   onClick(event) {
    console.log(event);
    alert('button clicked');
    this.http.get('Restfulapi/webresources/myresource/stock')
      .subscribe(res => {
     this.data = res;
      console.log(this.data);
  });
  }

}
