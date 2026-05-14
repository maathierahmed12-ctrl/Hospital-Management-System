package Entity;

import java.util.ArrayList;
import java.util.List;

public class Surgeon extends Doctor {

    private int surgeriesPerformed;
    private List<String> surgeryTypes;
    private boolean operationTheatreAccess;

    public Surgeon(int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {

        super(surgeriesPerformed, surgeryTypes, operationTheatreAccess);

        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = surgeryTypes;
        this.operationTheatreAccess = operationTheatreAccess;


    }

    public int getsurgeriesPerformed() {

        return surgeriesPerformed;
    }

    public void setSurgeriesPerformed(int surgeriesPerformed) {

        this.surgeriesPerformed = surgeriesPerformed;
    }

    public List<String> getSurgeryTypes() {

        return surgeryTypes;
    }

    public void setSurgeryTypes(List<String> surgeryTypes) {

        this.surgeryTypes = surgeryTypes;
    }

    public boolean getOperationTheatreAccess() {

        return operationTheatreAccess;
    }

    public void setOperationTheatreAccess(boolean operationTheatreAccess) {

        this.operationTheatreAccess = operationTheatreAccess;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void addPerformSurgery(String performSurgery) {

        if (surgeryTypes == null) {

            surgeryTypes = new ArrayList<>();
        }

        surgeryTypes.add(performSurgery);

        surgeriesPerformed++;
    }

    public void updateSurgeryCount(int newCount) {

        this.surgeriesPerformed = newCount;
    }

}