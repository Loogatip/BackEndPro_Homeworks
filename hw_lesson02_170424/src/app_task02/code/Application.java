package app_task02.code;

import app_task02.staff.administration.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        ChiefPhysician chiefPhysician = context.getBean(ChiefPhysician.class);
        chiefPhysician.manageHospital();


    }
}
