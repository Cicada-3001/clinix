import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ApiService } from 'src/app/API service/API';
import { userData } from 'src/app/Shared/shared';

@Component({
  selector: 'app-patient-appointments',
  templateUrl: './patient-appointments.component.html',
  styleUrls: ['./patient-appointments.component.css']
})
export class PatientAppointmentsComponent {
  apiService= new ApiService(this.http)
  appointments!:any;

constructor(private http: HttpClient) {
  
  }

  ngOnInit(): void {
    this.getAppointments()
   }

  getAppointments() {
     this.apiService.getAppointmentsByPatient(userData.id).subscribe((Response: any) => {
      this.appointments = Response;
      console.log(Response)
      
    }  
  )     

 }

 deleteAppointment(val: number){
    this.apiService.deleteAppointment(val).subscribe((Response: any) => {
      this.appointments = Response;
      console.log(Response)
      if(Response==null){
        this.ngOnInit();
      }
      
    }  
    )     
 }

 










}
