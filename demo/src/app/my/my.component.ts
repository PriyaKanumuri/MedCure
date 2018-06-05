import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my',
  templateUrl: './my.component.html',
  styleUrls: ['./my.component.css']
})
export class MyComponent implements OnInit {
  data;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  onclick(event) {
    console.log(event);
    alert('button clicked');
    this.http.get('Restfulapi/webresources/myresource/getData').subscribe(res => this.data = res);
  }
}