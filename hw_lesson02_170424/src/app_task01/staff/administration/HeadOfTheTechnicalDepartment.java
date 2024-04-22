package app_task01.staff.administration;

import app_task01.staff.specialists.technical_department.Electrician;
import app_task01.staff.specialists.technical_department.Plumber;

public class HeadOfTheTechnicalDepartment {
    private Electrician electrician;
    private Plumber plumber;

    public Electrician getElectrician() {
        return electrician;
    }
    public void setElectrician(Electrician electrician) {
        this.electrician = electrician;
    }
    public Plumber getPlumber() {
        return plumber;
    }
    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }

    public void giveOrders(){
        electrician.work();
        plumber.work();
    }
}
