import { Component } from '@angular/core';
import { userData } from 'src/app/Shared/shared';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent {
  userName=userData?.userName
  goBack(){
       history.back()
       alert("The button has been clicked")
  }








}

