import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ChartsModule, WavesModule } from 'angular-bootstrap-md'
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DragDropModule } from '@angular/cdk/drag-drop';
import { RegisterComponent } from './auth-components/register/register.component';
import { LoginComponent } from './auth-components/login/login.component';
import { ForgotPasswordComponent } from './auth-components/forgot-password/forgot-password.component';
import { HttpClientModule } from '@angular/common/http';
import { ResetPasswordComponent } from './auth-components/reset-password/reset-password.component';
import { PatientsComponent } from './admin-components/patients/patients.component';
import { ServicesComponent } from './admin-components/services/services.component';
import { AppointmentsComponent } from './admin-components/appointments/appointments.component';
import { DoctorsComponent } from './admin-components/doctors/doctors.component';
import { MedicinesComponent } from './admin-components/medicines/medicines.component';
import { ClinicsComponent } from './admin-components/clinics/clinics.component';
import { PatientHomeComponent } from './patient-components/patient-home/patient-home.component';
import { AdminHomeComponent } from './admin-components/admin-home/admin-home.component';
import { AddClinicComponent } from './admin-components/add-entity-forms/add-clinic/add-clinic.component';
import { AddDoctorComponent } from './admin-components/add-entity-forms/add-doctor/add-doctor.component';
import { AddPatientComponent } from './admin-components/add-entity-forms/add-patient/add-patient.component';
import { AddMedicineComponent } from './admin-components/add-entity-forms/add-medicine/add-medicine.component';
import { AddAppointmentComponent } from './admin-components/add-entity-forms/add-appointment/add-appointment.component';
import { AddServiceComponent } from './admin-components/add-entity-forms/add-service/add-service.component';
import { TestComponent } from './universal-components/test/test.component';
import { DashboardComponent } from './admin-components/dashboard/dashboard.component';
import { SidebarComponent } from './universal-components/sidebar/sidebar.component';
import { EquipmentComponent } from './admin-components/equipment/equipment.component';
import { SplashScreenComponent } from './universal-components/splash-screen/splash-screen.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { DecimalPipe } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PatientAppointmentsComponent } from './patient-components/patient-appointments/patient-appointments.component';
import { AccountComponent } from './universal-components/account/account.component';
import { PatientComponent } from './patient-components/patient/patient.component';
import { ClinicDetailsComponent } from './patient-components/clinic-details/clinic-details.component';
import { DoctorDetailsComponent } from './patient-components/doctor-details/doctor-details.component';
import { RoughWorkComponent } from './universal-components/rough-work/rough-work.component';
import { NgChartsModule } from 'ng2-charts';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    ForgotPasswordComponent,
    ResetPasswordComponent,
    PatientsComponent,
    ServicesComponent,
    AppointmentsComponent,
    DoctorsComponent,
    MedicinesComponent,
    ClinicsComponent,
    PatientHomeComponent,
    AdminHomeComponent,
    AddClinicComponent,
    AddDoctorComponent,
    AddPatientComponent,
    AddMedicineComponent,
    AddAppointmentComponent,
    AddServiceComponent,
    TestComponent,
    DashboardComponent,
    SidebarComponent,
    EquipmentComponent,
    SplashScreenComponent,
    PatientAppointmentsComponent,
    AccountComponent,
    PatientComponent,
    ClinicDetailsComponent,
    DoctorDetailsComponent,
    RoughWorkComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
    BrowserAnimationsModule,
    DragDropModule,
    NgChartsModule,
    ChartsModule,
  ],
  providers: [DecimalPipe],
  bootstrap: [AppComponent]
})

export class AppModule { }
