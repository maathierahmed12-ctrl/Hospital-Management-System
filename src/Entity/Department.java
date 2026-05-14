package Entity;
import Interface.Displayable;

import java.time.LocalDate;
import java.util.List;
import java.util.*;
public class Department implements Displayable {

    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<String> doctors;
    private List<String> nurses;
    private int bedCapacity;
    private int availableBeds;


    public Department(String departmentId, String departmentName,
                      String headDoctorId, List<String> doctors,
                      List<String> nurses, int bedCapacity,
                      int availableBeds) {

        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headDoctorId = headDoctorId;
        this.doctors = doctors;
        this.nurses = nurses;
        this.bedCapacity = bedCapacity;
        this.availableBeds = availableBeds;
    }

    public String getDepartmentId() {


        return departmentId;
    }

    public void setDepartmentId(String departmentId) {

        this.departmentId = departmentId;
    }

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;
    }

    public String getHeadDoctorId() {
        return headDoctorId;
    }

    public void setHeadDoctorId(String headDoctorId) {
        this.headDoctorId = headDoctorId;
    }

    public List<String> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<String> doctors) {
        this.doctors = doctors;
    }

    public List<String> getNurses() {
        return nurses;
    }

    public void setNurses(List<String> nurses) {
        this.nurses = nurses;
    }

    public int getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(int bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }
    public void assignDoctor(String doctorId) {

        if (doctors == null) {

            doctors = new ArrayList<>();

        }        doctors.add(doctorId);

    }    public void assignNurse(String nurseId) {

        if (nurses == null) {

            nurses = new ArrayList<>();        }

        nurses.add(nurseId);    }

    public void updateBedAvailability(int availableBeds) {

        this.availableBeds = this.availableBeds - availableBeds;
    }

    public void displayInfo() {
    }

    @Override
    public void displaySummary() {

    }

    public class department implements Displayable{

        private String departmentId;
        private String departmentName;
        private String headDoctorId;
        private List<String> doctors;
        private List<String> nurses;
        private int bedCapacity;
        private int availableBeds;


        public department(String departmentId, String departmentName, String headDoctorId, List<String> doctors, List<String> nurses, int bedCapacity, int availableBeds) {

            this.departmentId = departmentId;
            this.departmentName = departmentName;
            this.headDoctorId = headDoctorId;
            this.doctors = doctors;
            this.nurses = nurses;
            this.bedCapacity = bedCapacity;
            this.availableBeds = availableBeds;
        }

        @Override
        public void displayInfo() {

            System.out.println("departmentId");
            System.out.println("departmentName");
            System.out.println("headDoctorId");
            System.out.println("doctors");
            System.out.println("nurses");
            System.out.println("bedCapacity");
            System.out.println("availableBeds");
        }

        @Override
        public void displaySummary() {

            System.out.println("ID,Name,DoctorId,doctors,nurses,bedCapacity,availableBeds");

        }
    }
}

