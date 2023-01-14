//import { AppointmentUrl, ClinicUrl, DoctorUrl, EquipmentUrl, MedicineUrl, PatientUrl, ServiceUrl, UserUrl } from "src/app/Shared/shared";
import { HttpClient, HttpParams } from "@angular/common/http";
import { AppointmentUrl, ClinicUrl, DoctorUrl, EquipmentUrl, MedicineUrl, PatientUrl, ServiceUrl, UserUrl } from "../Shared/shared";

export class ApiService {
    
    constructor(private http: HttpClient) { }
    data:any
    getClinics(): any { 
        return  this.http.get(ClinicUrl);
    }

    getDoctors():any{
        return this.http.get(DoctorUrl)
    }

    getAppointments():any{
        return this.http.get(AppointmentUrl) 
    }    
    
    getServices(): any {
        return  this.http.get(ServiceUrl)
    }

    getUsers(val:number):any{
        return this.http.get(UserUrl)
    }

    getMedicines():any{
        return this.http.get(MedicineUrl) 
    }    


    getEquipment():any{
        return this.http.get(EquipmentUrl) 
    }    


    getPatients():any{
        return this.http.get(PatientUrl) 
    }    


    emailLogin(email:any, password:any):any{
        let queryParams = new HttpParams();
        queryParams = queryParams.append("email", email)
        queryParams = queryParams.append("password", password)
        return this.http.get("http://localhost:8060/users/login", { params: queryParams })
    }


    getPatientById(id:number):any{
        let queryParams = new HttpParams();
        queryParams = queryParams.append("id", id)
        return this.http.get("http://localhost:8060/patients/id", { params: queryParams })
    }



    getAppointmentsByClinic(clinicId:number):any{
        let queryParams = new HttpParams();
        queryParams = queryParams.append("clinicId", clinicId)
        return this.http.get("http://localhost:8060/appointments/clinic", { params: queryParams })
    }


    getAppointmentsByPatient(patientId:number):any{
        let queryParams = new HttpParams();
        queryParams = queryParams.append("patientId", patientId)
        return this.http.get("http://localhost:8060/appointments/patient", { params: queryParams })
    }


    getAppointmentsByDoctor(doctorId:number):any{
        let queryParams = new HttpParams();
        queryParams = queryParams.append("doctorId",  doctorId)
        return this.http.get("http://localhost:8060/patient/doctor", { params: queryParams })
    }


    deleteAppointment(appointmentId:number){ 
        return this.http.delete(AppointmentUrl+"/"+appointmentId) 
    }













    
}


