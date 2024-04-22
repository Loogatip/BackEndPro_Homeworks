package app_task01.staff.administration;

import app_task01.staff.specialists.hospital_wards.Doctors;

public class HeadОfWard {
    private SeniorNurse seniorNurse;
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
