package Service;

import Entity.Patient;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;

public class PatientService {

    private ArrayList<Patient> patients = new ArrayList<>();


    public void addPatient(Patient patient) {

        Scanner scanner = new Scanner(System.in);

        patients.add(patient);

    }

    public void editPatient(String patientId, Patient updatedPatient) {

        if (patients == null) {

            patients = new ArrayList<>();
        }

    }

    public void removePatient(String patientId) {

        for (Patient patient : patients) {

            if (patient.getpatientId().equals(patientId)) {

                patients.remove(patient);

                break;
            }
        }

    }

    public Patient getPatientById(String patientId) {

        for (Patient patient : patients) {

            if (patient.getpatientId().equals(patientId)) {

                return patient;
            }
        }
    }

    public void displayAllPatients() {

        for (Patient patient : patients) {

            System.out.println(" Patients");
        }

    }

    public void searchPatientsByName(String name) {

        List<Patient> PatientsByName = new ArrayList<>();

        for (Patient patient : patients) {

            if (patient.getPatientName().equalsIgnoreCase(name)) {

                PatientsByName.add(patient);

                System.out.println(patient);
            }
        }
    }
}



