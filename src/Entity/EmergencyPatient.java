package Entity;

import Interface.Displayable;

public class EmergencyPatient extends InPatient implements Displayable {

    private String emergencyType;
    private String arrivalMode;
    private int triageLevel;
    private boolean admittedViaER;
    public EmergencyPatient(String roomNumber, String bedNumber, double dailyCharges, String emergencyType, String arrivalMode, int triageLevel, boolean admittedViaER) {

        super(roomNumber, bedNumber, dailyCharges);

        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }
    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getArrivalMode() {
        return arrivalMode;
    }

    public void setArrivalMode(String arrivalMode) {
        this.arrivalMode = arrivalMode;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public boolean getAdmittedViaER() {
        return admittedViaER;
    }

    public void setAdmittedViaER(boolean admittedViaER) {
        this.admittedViaER = admittedViaER;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Emergency Type: " + emergencyType);
        System.out.println("Arrival Mode: " + arrivalMode);
        System.out.println("Triage Level: " + triageLevel);
        System.out.println("Admitted via ER: " + admittedViaER);
    }

    public void handleEmergencyPatient(String patientId) {

        System.out.println("Emergency case accepted immediately for patient: " + patientId);
        System.out.println("Skipping normal appointment queue");
    }
}


