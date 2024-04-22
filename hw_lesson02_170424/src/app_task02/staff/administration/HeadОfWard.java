package app_task02.staff.administration;

import app_task02.staff.specialists.hospital_wards.Doctors;
import org.springframework.beans.factory.annotation.Autowired;

public class HeadОfWard {

    @Autowired
    private SeniorNurse seniorNurse;
    @Autowired
    private Doctors doctors;

    public SeniorNurse getSeniorNurse() {
        return seniorNurse;
    }
    public void setSeniorNurse(SeniorNurse seniorNurse) {
        this.seniorNurse = seniorNurse;
    }
    public Doctors getDoctors() {
        return doctors;
    }
    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    public void giveOrders(){
        seniorNurse.giveOrders();
        doctors.work();
    }
}
