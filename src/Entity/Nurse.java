package Entity;

import java.time.LocalDate;
import java.util.*;

public class Nurse extends Person {

    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String> assignedPatients;


    public Nurse(String id, String firstname, String lastname, String gender, String phoneNumber, LocalDate dob, String email, String address, int experienceYears, String departmentId, String shift) {
        super(id, firstname, lastname, dateofBrith, gender, phoneNumber, email, address, String nurseId, String departmentId, String shift, String qualification, List < String > assignedPatients);

        this.nurseId = nurseId;
        this.departmentId = this.departmentId;
        this.shift = this.shift;
        this.qualification = qualification;
        this.assignedPatients = assignedPatients;

    }

    public String getnurseId() {
        return nurseId;
    }

    public void setnurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getdepartmentId() {
        return departmentId;
    }

    public void setdepartmentId(String departmentId) {

        this.departmentId = departmentId;
    }

    public String getshift() {

        return shift;
    }

    public void setShift(String MorningEveningNigh) {

        this.shift = shift;
    }

    public String getQualification() {

        return qualification;
    }

    public List<String> getassignedPatients() {

        return assignedPatients;
    }

    public List<String> setassignedPatients(List<String> assignedPatients) {

        this.assignedPatients = assignedPatients;
    }

    @Override

    public void displayInfo(){

        super.displayIfo();

        System.out.println("nurseId" + nurseId);
        System.out.println("departmentId" + departmentId);
        System.out.println("shift" + shift);
        System.out.println("qualification" + qualification);
        System.out.println("assignedPatients" + assignedPatients);

    }

    public void addpatientassignment( String patientassignmen){

        if (assignedPatients == null){

            assignedPatients = new ArrayList<>();

        }
        assignedPatients.add(patientassignmen);
    }

}

