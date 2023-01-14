import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminHomeComponent } from './admin-components/admin-home/admin-home.component';
import { AppointmentsComponent } from './admin-components/appointments/appointments.component';
import { ClinicsComponent } from './admin-components/clinics/clinics.component';
import { DashboardComponent } from './admin-components/dashboard/dashboard.component';
import { DoctorsComponent } from './admin-components/doctors/doctors.component';
import { EquipmentComponent } from './admin-components/equipment/equipment.component';
import { MedicinesComponent } from './admin-components/medicines/medicines.component';
import { PatientsComponent } from './admin-components/patients/patients.component';
import { ServicesComponent } from './admin-components/services/services.component';
import { ForgotPasswordComponent } from './auth-components/forgot-password/forgot-password.component';
import { LoginComponent } from './auth-components/login/login.component';
import { RegisterComponent } from './auth-components/register/register.component';
import { ResetPasswordComponent } from './auth-components/reset-password/reset-password.component';
import { ClinicDetailsComponent } from './patient-components/clinic-details/clinic-details.component';
import { DoctorDetailsComponent } from './patient-components/doctor-details/doctor-details.component';
import { PatientAppointmentsComponent } from './patient-components/patient-appointments/patient-appointments.component';
import { PatientHomeComponent } from './patient-components/patient-home/patient-home.component';
import { PatientComponent } from './patient-components/patient/patient.component';
import { TestComponent } from './universal-components/test/test.component';



const routes: Routes = [
  
    {path: "admin", component: AdminHomeComponent,
      children: [
        { path: "patients", component: PatientsComponent },
        { path: "clinics", component: ClinicsComponent },
        { path: "appointments", component: AppointmentsComponent },
        { path: "medicines", component: MedicinesComponent },
        { path: "services", component: ServicesComponent},
        { path: "doctors", component: DoctorsComponent},
        { path: "dashboard", component: DashboardComponent},
        { path: "equipment", component: EquipmentComponent},
    ]},

    {path: "patient", component: PatientComponent,
    children: [
      { path: "home", component: PatientHomeComponent },
      { path: "clinic", component: ClinicDetailsComponent },
      { path: "appointments", component: PatientAppointmentsComponent },
      { path: "doctor", component: DoctorDetailsComponent },
      { path: "services", component: ServicesComponent},
      { path: "doctors", component: DoctorsComponent},
      { path: "**", redirectTo: "/patient/home" },
    ]},

    { path: "sign-in", component: LoginComponent },
    { path: "test", component:TestComponent },
    { path: "sign-up", component: RegisterComponent},
    { path: "forgot-password", component: ForgotPasswordComponent },
    { path: "recover-password", component: ResetPasswordComponent},
    { path: "**", redirectTo: "/sign-in" },
    
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})



export class AppRoutingModule {

}
