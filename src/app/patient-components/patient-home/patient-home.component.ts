import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, PipeTransform } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { map, Observable, startWith } from 'rxjs';
import { ApiService } from 'src/app/API service/API';
import { Clinic } from 'src/app/Shared/shared';


let clinics: Clinic[];

function search(text: string, pipe: PipeTransform): Clinic[] {
  return clinics.filter(clinic => {
    const term = text.toLowerCase();
    return clinic.name.toLowerCase().includes(term)
      || clinic.location.toLowerCase().includes(term)
      || clinic.coordinates.toLowerCase().includes(term)
  });
} 


@Component({
  selector: 'app-patient-home',
  templateUrl: './patient-home.component.html',
  styleUrls: ['./patient-home.component.css']
})


export class PatientHomeComponent {
  showDetails:boolean = false;
  index!: number;
 
  data: any;
  clinics$: Observable<Clinic[]>;
  apiService= new ApiService(this.http)
  filter= new FormControl('');
  columns =['Name', 'Location', 'Description'];
  formIsOpen =false;
  clinics:any;

  constructor(private http: HttpClient, pipe: DecimalPipe, private router:Router) {
    //this.refreshProperty()
    this.clinics$ = this.filter.valueChanges.pipe(
      startWith(''),
      map(text => search(text!, pipe))
    );
  }


  ngOnInit(): void {
   this.getClinics()
  }

  getClinics() {
    this.apiService.getClinics().subscribe((Response: any) => {
     this.data = Response;
     clinics= this.data
     this.clinics=clinics
     console.log(this.clinics)
   }  
 )     
}

  displayDetails(val: number){
    this.showDetails = !this.showDetails
    this.index= val;
  }

  openForm(){
    this.formIsOpen = true;
  }


  goBack($event: any){ 
    this.showDetails =false;
  }

}
