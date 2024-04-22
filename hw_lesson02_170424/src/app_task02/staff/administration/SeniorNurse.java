package app_task02.staff.administration;

import app_task02.staff.specialists.hospital_wards.Orderlies;
import app_task02.staff.specialists.hospital_wards.MedicalNurse;
import org.springframework.beans.factory.annotation.Autowired;

public class SeniorNurse {

    @Autowired
    private Orderlies orderlies;
    @Autowired
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
