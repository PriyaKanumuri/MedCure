import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
@Component({
  selector: 'app-donate',
  templateUrl: './donate.component.html',
  styleUrls: ['./donate.component.css']
})
export class DonateComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
 onclick(data) {
   this.http.post('Restfulapi/webresources/myresource/donate', {
     dis_name: data.dis_name,
     med_name: data.med_name,
     med_type: data.med_type,
     exp_date: data.exp_date,
     dosage: data.dosage,
     quantity: data.quantity
   })
   .subscribe(
     (res: any) => {
      console.log(res);
      alert("Thanks for donating. We will be contacting you soon!")
   },
     err => {
     console.log('error occured');
   }
  );
  }
}