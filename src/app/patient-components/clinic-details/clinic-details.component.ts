import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ApiService } from 'src/app/API service/API';

@Component({
  selector: 'app-clinic-details',
  templateUrl: './clinic-details.component.html',
  styleUrls: ['./clinic-details.component.css']
})


export class ClinicDetailsComponent {
  @Input() clinic!:any; 
  showDetails:boolean = false;
  index!: number;
  back!:boolean;
  control:number= 1; 
  active="nav-item nav-link active"
  inactive="nav-item nav-link"
  services: any;
  @Output() event= new EventEmitter()
  doctors:any; 
  data: any;
  apiService= new ApiService(this.http)
 
  constructor(private http: HttpClient, pipe: DecimalPipe) {
    //this.refreshProperty()
   
  }

  ngOnInit(): void {
     this.getDoctors()
     this.getServices()
   }



  getDoctors() {
    this.apiService.getDoctors().subscribe((Response: any) => {
     this.data = Response
     this.doctors= this.data
     console.log(this.doctors)
   }  
  )    
  } 



  getServices() {
    this.apiService.getServices().subscribe((Response: any) => {
     this.data = Response
     this.services= this.data
     console.log(this.services)
   }  
  )    
  } 


 displayDetails(val: number){
    this.showDetails = !this.showDetails
    this.index= val;
  }


  goBack(){ 
    this.event.emit(this.back)
  }
  

  goBackwards($event: any){
    this.showDetails= false;
  }



   switchControl(val: number){
      this.control = val;
   }











}
