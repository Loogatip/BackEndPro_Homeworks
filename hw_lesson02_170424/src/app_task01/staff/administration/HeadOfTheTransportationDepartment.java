package app_task01.staff.administration;

import app_task01.staff.specialists.transport_department.Driver;
import app_task01.staff.specialists.transport_department.Mechanic;

public class HeadOfTheTransportationDepartment {
    private Driver driver;
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
