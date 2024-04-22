package app_task02.staff.administration;

import app_task02.staff.specialists.transport_department.Mechanic;
import app_task02.staff.specialists.transport_department.Driver;
import org.springframework.beans.factory.annotation.Autowired;

public class HeadOfTheTransportationDepartment {

    @Autowired
    private Driver driver;
    @Autowired
    private Mechanic mechanic;

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Mechanic getMechanic() {
        return mechanic;
    }
    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public void giveOrders(){
        driver.work();
        mechanic.work();
    }
}
