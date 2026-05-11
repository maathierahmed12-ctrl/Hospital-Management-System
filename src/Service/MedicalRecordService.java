package Service;

import Entity.MedicalRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService {

    Scanner scanner = new Scanner(System.in);

    static List<MedicalRecord> medicalRecords = new ArrayList<>();


    public List<MedicalRecord> addMedicalRecord() {

        System.out.println("Enter record id");

        String record = scanner.nextLine();

        System.out.println("Enter patient id");

        String patient = scanner.nextLine();

        System.out.println("Enter Doctor Id");

        String Id = scanner.nextLine();

        System.out.println("Enter list notes");

        String list = scanner.nextLine();

        System.out.println("Enter diagnosis");

        String diagnosis = scanner.nextLine();

        System.out.println("Enter bloodType");

        String blood = scanner.nextLine();

        System.out.println("Enter next Appointment");

        String Appointment = scanner.nextLine();

        System.out.println("Enter visitDate");

        String date = scanner.nextLine();

        MedicalRecord M = new MedicalRecord(Id, diagnosis, blood, Appointment, list, patient, record);

        medicalRecords.add(M);

        System.out.println("medical record added successfully");

        return medicalRecords;
    }


    public void removeMedicalRecord(String recordId) {

        boolean found = false;

        for (MedicalRecord record : medicalRecords) {

            if (record.getRecordId().equals(recordId)) {

                medicalRecords.remove(record);

                found = true;

                System.out.println("medical record removed successfully");

                break;
            }
        }

        if (!found) {

            System.out.println("medical record not found");
        }
    }


    public void editMedicalRecord(String recordId) {

        for (MedicalRecord record : medicalRecords) {

            if (record.getRecordId().equals(recordId)) {

                System.out.println("Enter updated diagnosis");

                record.setDiagnosis(scanner.nextLine());

                System.out.println("Enter updated blood type");

                record.setNotes(scanner.nextLine());

                System.out.println("Enter updated next appointment");

                record.setNotes(scanner.nextLine());

                System.out.println("Enter updated notes");

                record.setNotes(scanner.nextLine());

                System.out.println("medical record updated successfully");

                return;
            }
        }

        System.out.println("medical record not found");
    }


    public MedicalRecord getRecordById(String recordId) {

        for (MedicalRecord record : medicalRecords) {

            if (record.getRecordId().equals(recordId)) {

                return record;
            }
        }
        return null;
    }



    public void displayAllMedicalRecords() {

        for (MedicalRecord record : medicalRecords) {

            record.displayInfo();
        }
    }


    public List<MedicalRecord>getRecordsByPatientId(String patientId) {

        List<MedicalRecord> patientRecords = new ArrayList<>();

        for (MedicalRecord record : medicalRecords) {

            if (record.getpatientId().equals(patientId)) {

                patientRecords.add(record);
            }
        }

        return patientRecords;
    }


    public List<MedicalRecord> getRecordsByDoctorId(String doctorId) {

        List<MedicalRecord> doctorRecords = new ArrayList<>();

        for (MedicalRecord record : medicalRecords) {

            if (record.getDoctorId().equals(doctorId)) {

                doctorRecords.add(record);
            }
        }

        return doctorRecords;
    }


    public void displayPatientHistory(String patientId) {

        List<MedicalRecord> patientRecords =
                getRecordsByPatientId(patientId);

        if (patientRecords.isEmpty()) {

            System.out.println("No records found");

            return;
        }

        for (MedicalRecord record : patientRecords) {

            record.displayInfo();
        }
    }
}
