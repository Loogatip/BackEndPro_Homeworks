package app_task02.config;

import app_task02.staff.administration.*;
import app_task02.staff.specialists.Secretary;
import app_task02.staff.specialists.hospital_wards.Doctors;
import app_task02.staff.specialists.hospital_wards.MedicalNurse;
import app_task02.staff.specialists.hospital_wards.Orderlies;
import app_task02.staff.specialists.technical_department.Electrician;
import app_task02.staff.specialists.technical_department.Plumber;
import app_task02.staff.specialists.transport_department.Driver;
import app_task02.staff.specialists.transport_department.Mechanic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Secretary secretary(){
        return new Secretary();
    }
    @Bean
    public Mechanic mechanic(){
        return new Mechanic();
    }
    @Bean
    public Driver driver(){
        return new Driver();
    }
    @Bean
    public Plumber plumber(){
        return new Plumber();
    }
    @Bean
    public Electrician electrician(){
        return new Electrician();
    }
    @Bean
    public Orderlies orderlies(){
        return new Orderlies();
    }
    @Bean
    public MedicalNurse medicalNurse(){
        return new MedicalNurse();
    }
    @Bean
    public Doctors doctors(){
        return new Doctors();
    }
    @Bean
    public SeniorNurse seniorNurse(){
        return new SeniorNurse();
    }
    @Bean
    public HeadОfWard headОfWard(){
        return new HeadОfWard();
    }
    @Bean
    public HeadOfTheTransportationDepartment headOfTheTransportationDepartment(){
        return new HeadOfTheTransportationDepartment();
    }
    @Bean
    public HeadOfTheTechnicalDepartment headOfTheTechnicalDepartment(){
        return new HeadOfTheTechnicalDepartment();
    }
    @Bean
    public ChiefEngineer chiefEngineer(){
        return new ChiefEngineer();
    }
    @Bean
    public ChiefPhysician chiefPhysician(){
        return new ChiefPhysician();
    }
}
