import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receive',
  templateUrl: './receive.component.html',
  styleUrls: ['./receive.component.css']
})
export class ReceiveComponent implements OnInit {
  data;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
   onclick(data) {
   this.http.get('Restfulapi/webresources/myresource/receive/' + data.dis_name )
   .subscribe((res) => {
   this.data = res;
   console.log(this.data);
  });
}
}
