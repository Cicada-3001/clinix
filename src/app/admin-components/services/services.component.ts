import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, PipeTransform } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { map, Observable, startWith } from 'rxjs';
import { ApiService } from 'src/app/API service/API';
import { Service } from 'src/app/Shared/shared';


let services: Service[] =[];

function search(text: string, pipe: PipeTransform): Service[] {
  return services.filter(service => {
    const term = text.toLowerCase();
    return pipe.transform(service.serviceType).includes(term)
      || service.serviceName.toLowerCase().includes(term)
    
  });
}

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css']
})

export class ServicesComponent {
  data: any;
  services$: Observable<Service[]>;
  apiService= new ApiService(this.http)
  filter= new FormControl('');
  columns: string[]= ['Name', 'Type']
  formIsOpen= false;

  constructor(private http: HttpClient, pipe: DecimalPipe, private router:Router) {
   // this.refreshProperty()
    this.services$ = this.filter.valueChanges.pipe(
      startWith(''),
      map(text => search(text!, pipe))
    );
  }
  refreshProperty() {
    throw new Error('Method not implemented.');
  }
  ngOnInit(): void {
    this.getServices()
  }

  getServices() {
    this.apiService.getServices().subscribe((Response: any) => {
     this.data = Response
     services= this.data 
     console.log(services)
   }  
 )     
 }

 openForm(){
  this.formIsOpen = true;
}


}
