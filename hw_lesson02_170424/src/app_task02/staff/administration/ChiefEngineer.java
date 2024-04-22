package app_task02.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class ChiefEngineer {

    @Autowired
    private HeadOfTheTechnicalDepartment headOfTheTechnicalDepartment;
    @Autowired
    private HeadOfTheTransportationDepartment headOfTheTransportationDepartment;

    public HeadOfTheTechnicalDepartment getHeadOfTheTechnicalDepartment() {
        return headOfTheTechnicalDepartment;
    }
    public void setHeadOfTheTechnicalDepartment(HeadOfTheTechnicalDepartment headOfTheTechnicalDepartment) {
        this.headOfTheTechnicalDepartment = headOfTheTechnicalDepartment;
    }
    public HeadOfTheTransportationDepartment getHeadOfTheTransportationDepartment() {
        return headOfTheTransportationDepartment;
    }
    public void setHeadOfTheTransportationDepartment(HeadOfTheTransportationDepartment headOfTheTransportationDepartment) {
        this.headOfTheTransportationDepartment = headOfTheTransportationDepartment;
    }

    public void giveOrders(){
        headOfTheTechnicalDepartment.giveOrders();
        headOfTheTransportationDepartment.giveOrders();
    }
}
