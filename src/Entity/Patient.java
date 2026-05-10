package Entity;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Patient extends Person {

    private String patientId;
    private String bloodGroup;
    private List<String> allergies;
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private List<String> medicalRecords;
    private List<String> appointments;

    public Patient(String id, String firstname, String lastname,
                   LocalDate dateofBrith, String gender,
                   String phoneNumber, String email, String address,
                   String patientId, String bloodGroup,
                   List<String> allergies, String emergencyContact,
                   LocalDate registrationDate, String insuranceId,
                   List<String> medicalRecords,
                   List<String> appointments) {

        super(id, firstname, lastname, dateofBrith,
                gender, phoneNumber, email, address);

        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
        this.allergies = allergies;
        this.emergencyContact = emergencyContact;
        this.registrationDate = registrationDate;
        this.insuranceId = insuranceId;
        this.medicalRecords = medicalRecords;
        this.appointments = appointments;
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

    @Override

    public void displayInfo() {

        super.displayIfo(){

            System.out.println("patientId :" + patientId);
            System.out.println("bloodGroup :" + bloodGroup);
            System.out.println("allergies :" + allergies);
            System.out.println("emergencyContact :" + emergencyContact);
            System.out.println("registrationDate :" + registrationDate);
            System.out.println("insuranceId :" + insuranceId);
            System.out.println("medicalRecords :" + medicalRecords);
            System.out.println("appointments :" + appointments);

        }
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
}