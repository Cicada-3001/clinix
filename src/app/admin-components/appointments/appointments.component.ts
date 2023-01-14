import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, PipeTransform } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { NgbHighlight } from '@ng-bootstrap/ng-bootstrap';
import { map, Observable, startWith } from 'rxjs';
import { ApiService } from 'src/app/API service/API';
import { Appointment, userData } from 'src/app/Shared/shared';


let appointments: Appointment[];


function search(text: string, pipe: PipeTransform): Appointment[] {
  return  appointments.filter(appointment => {
    const term = text.toLowerCase();
    return appointment.date.toLowerCase().includes(term)
      || appointment.doctorName.toLowerCase().includes(term)
      || appointment.patientName.toLowerCase().includes(term)
      || appointment.clinicName.toLowerCase().includes(term)
  });
} 

@Component({
  selector: 'app-appointments',
  templateUrl: './appointments.component.html',
  styleUrls: ['./appointments.component.css']
})


export class AppointmentsComponent {
  data: any;
  appointments$: Observable<Appointment[]>
  apiService= new ApiService(this.http)
  filter= new FormControl('');
  columns =['Number', 'Patient', 'Doctor', 'CLinic', 'Date'];
  formIsOpen =false;
  
  constructor(private http: HttpClient, pipe: DecimalPipe, private router:Router) {
    //this.refreshProperty()
    this.appointments$ = this.filter.valueChanges.pipe(
      startWith(''),
      map(text => search(text!, pipe))
    );
  }



  
  ngOnInit(): void {
   this.getAppointments()
  }



  getAppointments() {
    this.apiService.getAppointmentsByDoctor(userData.id).subscribe((Response: any) => {
     appointments= Response
     console.log(Response)
   }  
  )     
  }

  openForm(){
    this.formIsOpen = true;
  }


}




