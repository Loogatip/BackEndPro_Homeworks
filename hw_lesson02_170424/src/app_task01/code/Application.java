package app_task01.code;

import app_task01.staff.administration.*;
import app_task01.staff.specialists.Secretary;
import app_task01.staff.specialists.hospital_wards.Doctors;
import app_task01.staff.specialists.hospital_wards.MedicalNurse;
import app_task01.staff.specialists.hospital_wards.Orderlies;
import app_task01.staff.specialists.technical_department.Electrician;
import app_task01.staff.specialists.technical_department.Plumber;
import app_task01.staff.specialists.transport_department.Driver;
import app_task01.staff.specialists.transport_department.Mechanic;

public class Application {
    public static void main(String[] args) {

        Secretary secretary = new Secretary();

        Mechanic mechanic = new Mechanic();
        Driver driver = new Driver();

        Plumber plumber = new Plumber();
        Electrician electrician = new Electrician();

        Orderlies orderlies = new Orderlies();
        MedicalNurse medicalNurse = new MedicalNurse();
        Doctors doctors = new Doctors();

        HeadOfTheTechnicalDepartment headOfTheTechnicalDepartment = new HeadOfTheTechnicalDepartment();
        headOfTheTechnicalDepartment.setPlumber(plumber);
        headOfTheTechnicalDepartment.setElectrician(electrician);

        HeadOfTheTransportationDepartment headOfTheTransportationDepartment = new HeadOfTheTransportationDepartment();
        headOfTheTransportationDepartment.setMechanic(mechanic);
        headOfTheTransportationDepartment.setDriver(driver);

        ChiefEngineer chiefEngineer = new ChiefEngineer();
        chiefEngineer.setHeadOfTheTechnicalDepartment(headOfTheTechnicalDepartment);
        chiefEngineer.setHeadOfTheTransportationDepartment(headOfTheTransportationDepartment);

        SeniorNurse seniorNurse = new SeniorNurse();
        seniorNurse.setOrderlies(orderlies);
        seniorNurse.setMedicalNurse(medicalNurse);

        HeadОfWard headОfWard = new HeadОfWard();
        headОfWard.setSeniorNurse(seniorNurse);
        headОfWard.setDoctors(doctors);

        ChiefPhysician chiefPhysician = new ChiefPhysician();
        chiefPhysician.setSecretary(secretary);
        chiefPhysician.setChiefEngineer(chiefEngineer);
        chiefPhysician.setHeadОfWard(headОfWard);

        chiefPhysician.manageHospital();
    }
}
