import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { RouterModule, Routes, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  data;
  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit() {
  }
  onClick(data) {
   this.http.post('Restfulapi/webresources/myresource/login', {
     name: data.name,
     password: data.password
     },{responseType: 'text'})
     .subscribe(
      (res: any) => {
        console.log(res);
        if (res == null) {
           alert("Successfully LoggedIn");
           this.router.navigate(['/customer/']);
        } else {
          alert("Failure");
        }
      },
     err => {
     alert('chill baby!! Retry Again');
     console.log('error occured');
   }
  );
  }

}
