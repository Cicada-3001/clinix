import { HttpClient } from '@angular/common/http';
import { Component, Input } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ClinicUrl } from 'src/app/Shared/shared';
//import { ClinicUrl } from 'src/app/Shared/shared';

declare let Swal: any;


@Component({
  selector: 'app-add-clinic',
  templateUrl: './add-clinic.component.html',
  styleUrls: ['./add-clinic.component.css']
})
export class AddClinicComponent {
  @Input() show = false;
  
  
  addClinicForm = new FormGroup({
    name: new FormControl('', [Validators.required]),
    location: new FormControl('', [Validators.required]),
    coordinates: new FormControl('', [Validators.required]),
   
  })

  constructor(private http:HttpClient) { }

  
  
  saveClinic() {
    let data = this.addClinicForm.value;
    
    this.http.post(ClinicUrl,data)
    .subscribe(Result => {
      if (1) {
        Swal.fire(
       'Success!',
        Result,
       'success'
     )
     } else if (!1) {
       Swal.fire({
         icon: 'error',
         title: 'Oops...',
         text: Result
       })
     } else {
      Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Something went wrong!',
        footer: '<a>Why do I have this issue?</a>'
      })
     }
     })
  }

  closeForm(){
    this.show = false;
  }

  
}
