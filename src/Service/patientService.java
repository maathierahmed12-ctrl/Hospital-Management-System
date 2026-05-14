package Service;

import Interface.Manageable;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class patientService implements Manageable {

    private Scanner scanner = new Scanner(System.in);
    private List<Patient> patients = new ArrayList<>();

    public void addPatient() {
        System.out.println("Enter Patient ID:");
        String id = scanner.nextLine();

        System.out.println("Enter Patient Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Patient Phone Number:");
        String number = scanner.nextLine();

        Patient patient = new Patient(id, name);
        patient.setEmergencyContact(number);

        patients.add(patient);
        System.out.println("Patient added successfully: " + id);
    }

    public void updatePatient(String id, String newName) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(id)) {
                p.setName(newName);
                System.out.println("Patient Updated");
                return;
            }
        }
        System.out.println("Patient Not Found");
    }

    public void removePatient(String patientId) {
        if (patientId == null) {
            System.out.println("Invalid ID");
            return;
        }
        boolean removed = patients.removeIf(p -> p.getPatientId().equals(patientId));
        System.out.println(removed ? "Patient Removed Successfully" : "Patient Not Found");
    }

    public Patient getPatientById(String patientId) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) {
                return p;
            }
        }
        return null;
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found");
            return;
        }
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Patient p : patients) {
            if (p.getName() != null &&
                    p.getName().toLowerCase().contains(name.toLowerCase())) {
                p.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Matching Patients Found");
        }
    }

    @Override
    public void add(Object entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll() {

    }
}

class Patient {

    private String patientId;
    private String name;
    private String emergencyContact;

    private static List<Patient> patients = new ArrayList<>();

    public Patient(String patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmergencyContact(String contact) {
        this.emergencyContact = contact;
    }

    public void displayInfo() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Contact: " + emergencyContact);
    }

    //@Override
    public void add(Object entity) {
        Patient p = (Patient) entity;
        patients.add(p);
        System.out.println("Patient Added: " + p.patientId);
    }
    public void handlePatientMenu() {

        Boolean patientExit = true;

        while (patientExit) {

            System.out.println(MenuMessage.PatientManagementMenu);

            int option = InputHandler.getIntInput(Constants.ENTER_OPTION, 0, 9);

            switch (option) {

                case 1 -> {
                    registerPatient();
                }

                case 2 -> {
                    registerInPatient();
                }

                case 3 -> {
                    registerOutPatient();
                }

                case 4 -> {
                    registerEmergencyPatient();
                }

                case 5 -> {
                    getAll();
                }

                case 6 -> {

                    String key = InputHandler.getStringInput("Search keyword: ");
                    search(key);
                }

                case 7 -> {
                    updatePatient();
                }

                case 8 -> {

                    String patientId = InputHandler.getStringInput("Enter patient Id: ");
                    remove(patientId);
                }

                case 9 -> {

                    String patientId = InputHandler.getStringInput("Enter patient Id: ");
                    displayPatientHistory(patientId);
                }

                case 0 -> {
                    patientExit = false;
                }
            }
        }
    }

    private void registerEmergencyPatient() {

    }

    private void registerOutPatient() {

    }

    private void registerInPatient() {

    }

    private void registerPatient() {

    }

    private void updatePatient() {

    }

    private void displayPatientHistory(String patientId) {

    }
}
