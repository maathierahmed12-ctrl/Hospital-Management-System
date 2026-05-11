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


    public Doctor(String id, String firstname, LocalDate lastname,
                  String dateofBrith, String gender,
                  String phoneNumber, String email, String address, String doctorId, String specialization, String qualification,
                  int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<String> assignedPatients) {

        super(id, firstname, lastname, dateofBrith, gender, phoneNumber, email, address);

        this.doctorId = doctorId;
        this.specialization = specialization;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.departmentId = departmentId;
        this.consultationFee = consultationFee;
        this.availableSlots = availableSlots;
        this.assignedPatients = assignedPatients;
    }

    public Doctor() {
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

        super.displayIfo();
        System.out.println("doctorId" + doctorId);
        System.out.println("specialization" + specialization);
        System.out.println("qualification" + qualification);
        System.out.println("experienceYears" + experienceYears);
        System.out.println("departmentId" + departmentId);
        System.out.println("consultationFee" + consultationFee);
        System.out.println("availableSlots" + availableSlots);
        System.out.println("assignedPatients" + assignedPatients);

    }

    public void assignPatient(String Patient) {

        if (assignedPatients == null) {

            assignedPatients = new ArrayList<>();
        }

    }

    public void removePatient(String Patient) {

        if (assignedPatients != null){

            assignedPatients.remove(Patient);
        }

    }

    public void updateAvailability(String Slot) {

        if (availableSlots == null) {

            availableSlots = new ArrayList<>();

            }
          availableSlots.add(Slot);
        }

    public List<String> isAvailable() {

        return availableSlots;
    }
}




