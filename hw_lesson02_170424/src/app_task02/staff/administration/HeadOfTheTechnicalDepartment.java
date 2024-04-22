package app_task02.staff.administration;

import app_task02.staff.specialists.technical_department.Electrician;
import app_task02.staff.specialists.technical_department.Plumber;
import org.springframework.beans.factory.annotation.Autowired;

public class HeadOfTheTechnicalDepartment {

    @Autowired
    private Electrician electrician;
    @Autowired
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
