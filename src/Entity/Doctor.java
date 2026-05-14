package Entity;

import java.time.LocalDate;
import java.util.*;

public class Doctor extends Person {

    private String doctorId;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String departmentId;
    private double consultationFee;
    private List<String> availableSlots;
    private List<String> assignedPatients;

    public Doctor(String id, String firstname, String DOB) {

        super(id, firstname, null, LocalDate.parse(DOB),
                null, null, null, null);

        this.doctorId = id;
        this.specialization = null;
        this.qualification = null;
        this.experienceYears = 0;
        this.departmentId = null;
        this.consultationFee = 0.0;
        this.availableSlots = new ArrayList<>();
        this.assignedPatients = new ArrayList<>();
    }

    public Doctor(int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {
        super();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setdoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getqualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getexperienceYears() {
        return experienceYears;
    }

    public void setexperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getdepartmentId() {
        return departmentId;
    }

    public void setdepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public double getconsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<String> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public List<String> getassignedPatients() {
        return assignedPatients;
    }

    public void setassignedPatients(List<String> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("doctorId: " + doctorId);
        System.out.println("specialization: " + specialization);
        System.out.println("qualification: " + qualification);
        System.out.println("experienceYears: " + experienceYears);
        System.out.println("departmentId: " + departmentId);
        System.out.println("consultationFee: " + consultationFee);
        System.out.println("availableSlots: " + availableSlots);
        System.out.println("assignedPatients: " + assignedPatients);
    }

    public void assignPatient(String patient) {

        if (assignedPatients == null) {
            assignedPatients = new ArrayList<>();
        }

        assignedPatients.add(patient);
    }

    public void removePatient(String patient) {

        if (assignedPatients != null) {
            assignedPatients.remove(patient);
        }
    }

    public void updateAvailability(String slot) {

        if (availableSlots == null) {
            availableSlots = new ArrayList<>();
        }

        availableSlots.add(slot);
    }

    public List<String> isAvailable() {
        return availableSlots;
    }
}




