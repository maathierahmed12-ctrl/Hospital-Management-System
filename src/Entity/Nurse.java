package Entity;

import Interface.Displayable;

import java.time.LocalDate;
import java.util.*;

public class Nurse extends Person implements Displayable {

    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String> assignedPatients;

    public Nurse(String id, String firstname, String lastname, String gender, String phoneNumber, LocalDate dob, String email, String address, int experienceYears, String nurseId, String departmentId) {

        super();

        this.nurseId = nurseId;
        this.departmentId = departmentId;
        this.shift = shift;
        this.qualification = qualification;

        this.assignedPatients = new ArrayList<>();
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

    public void setShift(String shift) {

        this.shift = shift;
    }

    public String getQualification() {

        return qualification;
    }

    public void setQualification(String qualification) {

        this.qualification = qualification;
    }

    public List<String> getassignedPatients() {

        return assignedPatients;
    }

    public List<String> setassignedPatients(List<String> assignedPatients) {

        this.assignedPatients = assignedPatients;

        return assignedPatients;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("nurseId : " + nurseId);
        System.out.println("departmentId : " + departmentId);
        System.out.println("shift : " + shift);
        System.out.println("qualification : " + qualification);
        System.out.println("assignedPatients : " + assignedPatients);
    }

    @Override
    public void displaySummary() {

        System.out.println(nurseId + " " + departmentId + " " + shift);
    }

    public void addpatientassignment(String patientassignment) {

        if (assignedPatients == null) {

            assignedPatients = new ArrayList<>();
        }

        assignedPatients.add(patientassignment);
    }
}

