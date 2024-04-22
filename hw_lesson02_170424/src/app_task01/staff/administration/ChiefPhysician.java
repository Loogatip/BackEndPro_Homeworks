package app_task01.staff.administration;

import app_task01.staff.specialists.Secretary;

public class ChiefPhysician {
    private ChiefEngineer chiefEngineer;
    private HeadОfWard headОfWard;
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
