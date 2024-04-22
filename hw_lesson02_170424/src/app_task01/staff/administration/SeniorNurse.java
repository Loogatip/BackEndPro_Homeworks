package app_task01.staff.administration;

import app_task01.staff.specialists.hospital_wards.MedicalNurse;
import app_task01.staff.specialists.hospital_wards.Orderlies;

public class SeniorNurse {
    private Orderlies orderlies;
    private MedicalNurse medicalNurse;

    public Orderlies getOrderlies() {
        return orderlies;
    }
    public void setOrderlies(Orderlies orderlies) {
        this.orderlies = orderlies;
    }
    public MedicalNurse getMedicalNurse() {
        return medicalNurse;
    }
    public void setMedicalNurse(MedicalNurse medicalNurse) {
        this.medicalNurse = medicalNurse;
    }

    public void giveOrders(){
        orderlies.work();
        medicalNurse.work();
    }
}
