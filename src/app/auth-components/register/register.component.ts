import { HttpClient, HttpParams } from '@angular/common/http';
import { Component } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Option, UserUrl,userData } from 'src/app/Shared/shared';
declare let Swal: any



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(private http: HttpClient,  private router:Router) { }
  user: any
  userTypes: Option[] = [
    { value: 1, viewValue: 'Doctor' },
    { value: 2, viewValue: 'Patient' },
  ]
  
  MatchValidator(source: string, target: string): ValidatorFn {
    return (control: AbstractControl): ValidationErrors | null => {
      const sourceCtrl = control.get(source);
      const targetCtrl = control.get(target);

      return sourceCtrl && targetCtrl && sourceCtrl.value !== targetCtrl.value
        ? { mismatch: true }
        : null;
    };
  }

  signUpForm = new FormGroup({
    userName: new FormControl('', [Validators.required]),
    userPhone: new FormControl('', [Validators.required]),
    userEmail: new FormControl('', [Validators.required, Validators.email]),
    userType: new FormControl('', [Validators.required]),
    userPassword: new FormControl('', [Validators.required]),
    confirm_psw: new FormControl('', [Validators.required])
  },
    [this.MatchValidator('userPassword', 'confirm_psw')]
  )
  
  userName= this.signUpForm.get('userName')
  userPhone = this.signUpForm.get('userPhone')
  userEmail = this.signUpForm.get('userEmail')
  userType = this.signUpForm.get('userType')
  userPassword = this.signUpForm.get('userPassword')
  get passwordMatchError() {
    return (
      this.signUpForm.getError('mismatch') &&
      this.signUpForm.get('confirm_psw')?.touched
    );
  }

  registerUser() {
    this.user = {
      userName: this.userName?.value,
      userPhone: this.userPhone?.value,
      userEmail: this.userEmail?.value,
      userPassword: this.userPassword?.value,
      userType: this.userType?.value,
    }
   // this.user=JSON.stringify(this.user);

  
    try {
      this.http.post(UserUrl,this.user)
        .subscribe(Result => {
          
          if (true) {
           // this.showSplash = true
            if(1){
                setTimeout(() => {
                     this.router.navigate(['/sign-in']);
               }, 3200)
            }
          } else{
            Swal.fire({
              icon: 'error',
              title: 'Oops...',
              text: Result,
            })
          }
        })
    } catch (error) {
      Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Something went wrong!',
        footer: '<a>Why do I have this issue?</a>'
      })
    }


    let queryParams = new HttpParams();
            queryParams = queryParams.append("userEmail",this.user.userEmail);
            this.http.get(UserUrl,{params:queryParams}).subscribe((Response: any)=>{
              this.user=Response

              console.log(this.user);
              sessionStorage.setItem('user',JSON.stringify(this.user))
              console.log(sessionStorage.getItem('user'))
    })
          


  }




}
