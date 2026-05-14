package Entity;

import Interface.Displayable;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class patient extends Person  implements Displayable {

    private String patientId;
    private String bloodGroup;
    private List<String> allergies;
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private List<String> medicalRecords;
    private List<String> appointments;
    private String patientName;

    public patient(String id, String firstname) {

        super(id, firstname, null, null, null, null, null, null);

        this.patientId = id;
        this.bloodGroup = null;
        this.allergies = new ArrayList<>();
        this.emergencyContact = null;
        this.registrationDate = null;
        this.insuranceId = null;
        this.medicalRecords = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public patient(LocalDate admissionDate, LocalDate dischargeDate, String roomNumber, String bedNumber, double dailyCharges) {

    }

    public patient(int visitCount, LocalDate lastVisitDate, String preferredDoctorId) {
        super();
    }

    public String getpatientId() {
        return patientId;
    }

    public void setpatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getbloodGroup() {
        return bloodGroup;
    }

    public void setbloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<String> getallergies() {
        return allergies;
    }

    public void setallergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public String getemergencyContact() {
        return emergencyContact;
    }

    public void setemergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public LocalDate getregistrationDate() {
        return registrationDate;
    }

    public void setregistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getinsuranceId() {
        return insuranceId;
    }

    public void setinsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public List<String> getmedicalRecords() {
        return medicalRecords;
    }

    public void setmedicalRecords(List<String> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public List<String> getappointments() {
        return appointments;
    }

    public void setappointments(List<String> appointments) {
        this.appointments = appointments;
    }

    public void displayInfo() {

        System.out.println("patientId :" + patientId);
        System.out.println("bloodGroup :" + bloodGroup);
        System.out.println("allergies :" + allergies);
        System.out.println("emergencyContact :" + emergencyContact);
        System.out.println("registrationDate :" + registrationDate);
        System.out.println("insuranceId :" + insuranceId);
        System.out.println("medicalRecords :" + medicalRecords);
        System.out.println("appointments :" + appointments);
    }

    @Override
    public void displaySummary() {

    }

    public void addMedicalRecord(String record) {

        if (medicalRecords == null) {
            medicalRecords = new ArrayList<>();
        }

        medicalRecords.add(record);
    }

    public void addAppointment(String appointment) {

        if (appointments == null) {
            appointments = new ArrayList<>();
        }

        appointments.add(appointment);
    }

    public void updateInsurance(String newInsuranceId) {
        this.insuranceId = newInsuranceId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}

