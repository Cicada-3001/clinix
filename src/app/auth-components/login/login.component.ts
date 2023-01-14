import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {ReactiveFormsModule} from '@angular/forms'
import { ApiService } from 'src/app/API service/API';
import { userData } from 'src/app/Shared/shared';

declare let Swal: any


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  user: any

  constructor(private http: HttpClient,  private router:Router) { }

  loginForm= new FormGroup({   
    emailAddress: new FormControl('',[Validators.required, Validators.email]),
    password: new FormControl('',[Validators.required]),
  })

  apiService= new ApiService(this.http)
  
  userEmail=this.loginForm.get('emailAddress')
  userPassword=this.loginForm.get('password')
     
  loginUser() {
    try {
      this.apiService.emailLogin(this.userEmail?.value,this.userPassword?.value).subscribe((Result: any) => {
      this.user=Result;
      console.log(Result)
      console.log("This is the new application")
      
      if (1) {
       // this.showSplash = true
        sessionStorage.setItem('user', JSON.stringify(this.user))
        console.log(userData)
        if(this.user.userType == 1){
           setTimeout(() => {
          this.router.navigate(['/patient/home']);
         
        }, 2200)
        }else if(this.user.userType == 2){
          setTimeout(() => {
            this.router.navigate(['/patient/home']);
          }, 2200)
        }
       
        
      } else if (0) {
       // this.loginError=this.report
      }
    })
    }

    catch (error) {
      Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Something went wrong!',
        footer: '<a>Why do I have this issue?</a>'
      }) 
    }
    
  }
   
  setSplash($event: string) {
    switch ($event) {
      case 'splash':
        //this.showSplash = true
        break;
      case 'login':
        //this.phoneSign = false
    }
    
  }

}
