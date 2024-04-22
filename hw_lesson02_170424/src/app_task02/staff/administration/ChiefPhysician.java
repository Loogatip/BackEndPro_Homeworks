package app_task02.staff.administration;

import app_task02.staff.specialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class ChiefPhysician {

    @Autowired
    private ChiefEngineer chiefEngineer;
    @Autowired
    private HeadОfWard headОfWard;
    @Autowired
    private Secretary secretary;

    public ChiefEngineer getChiefEngineer() {
        return chiefEngineer;
    }
    public void setChiefEngineer(ChiefEngineer chiefEngineer) {
        this.chiefEngineer = chiefEngineer;
    }
    public HeadОfWard getHeadОfWard() {
        return headОfWard;
    }
    public void setHeadОfWard(HeadОfWard headОfWard) {
        this.headОfWard = headОfWard;
    }
    public Secretary getSecretary() {
        return secretary;
    }
    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void manageHospital(){
        secretary.work();
        headОfWard.giveOrders();
        chiefEngineer.giveOrders();
    }
}
