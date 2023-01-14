import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { AppointmentUrl, userData } from 'src/app/Shared/shared';

declare let Swal: any;

@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css']
})

export class DoctorDetailsComponent {
  @Input() doctor!:any; 
  @Input() clinic!: any; 
  back!:boolean
  @Output() event = new EventEmitter();

  today = new Date ();
  
  constructor(private http:HttpClient) { }

   
  saveAppointment() {

  let  appointment={
    date : new Date(),
    number: Math.floor(1000 + Math.random() * 9000),
    doctorName: this.doctor.firstname+ " "+this.doctor.lastname,
    patientName: this.doctor.firstname+ " "+this.doctor.lastname,
    clinicName: this.clinic.name,
    patientId:userData.id,
    doctorId: this.doctor.id,
    clinicId: this.clinic.id,
  }

  let test= {
    "date": "2020/8/5",
    "number": 8,
    "doctorId": 3,
    "clinicId": 2
  }

    console.log(appointment);
    console.log(userData);
    this.http.post(AppointmentUrl,appointment)
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

  goBack(){ 
    this.event.emit(this.back)
  }





  appointmentCode = Math.floor(1000 + Math.random() * 9000);
  
  




}
