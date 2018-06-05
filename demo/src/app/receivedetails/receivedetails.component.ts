import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receivedetails',
  templateUrl: './receivedetails.component.html',
  styleUrls: ['./receivedetails.component.css']
})
export class ReceivedetailsComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
   onclick(data) {
   this.http.post('Restfulapi/webresources/myresource/receivedetails', {
     patient_name: data.patient_name,
     patient_phone: data.patient_phone,
     patient_address: data.patient_address,
     req_quantity: data.req_quantity
   })
   .subscribe(
     (res: any) => {
      console.log(res);
       alert("we will deliver you within 3 days.Safe recovery!!!")
   },
     err => {
     console.log('error occured');
   }
  );
  }

}