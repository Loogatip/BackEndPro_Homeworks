package app_task01.staff.administration;

public class ChiefEngineer {
    private HeadOfTheTechnicalDepartment headOfTheTechnicalDepartment;
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
