import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  data;

  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit() {
  }
onclick(data) {
   this.http.post('Restfulapi/webresources/myresource/adminlogin', {
     name: data.name,
     password: data.password
   },{responseType: 'text'})
   .subscribe(
      (res: any) => {
        console.log(res);
        if (res == null) {
          alert("Successfully LoggedIn");
          this.router.navigate(['/admin/']);
        } else {
          alert("Failure");
        }
      },
     err => {
     console.log('error occured');
   }
  );
  }
}
