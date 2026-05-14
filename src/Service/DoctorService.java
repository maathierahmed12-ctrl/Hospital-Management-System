package Service;

import Entity.Doctor;
import Interface.Manageable;
import Utils.InputHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorService  implements Manageable {

    Scanner scanner = new Scanner(System.in);

    static List<Doctor> doctors = new ArrayList<>();
    private List<String> availableSlots;
    private List<String> assignedPatients;


    public Doctor addDoctor() {

        System.out.println("Enter Doctor id :");
        String id = scanner.nextLine();

        System.out.println("Enter Doctor first name :");
        String doctorFName = scanner.nextLine();

        System.out.println("Enter Doctor last name :");
        String doctorLName = scanner.nextLine();

        System.out.println("Enter Doctor DOB: ");
        String dateOfBirth = scanner.nextLine();
        LocalDate DOB = LocalDate.parse(dateOfBirth);

        System.out.println("Enter Doctor gender :");
        String gender = scanner.nextLine();

        System.out.println("Enter Doctor phone number :");
        String phone = scanner.nextLine();

        System.out.println("Enter Doctor email :");
        String email = scanner.nextLine();

        System.out.println("Enter Doctor address :");
        String address = scanner.nextLine();

        System.out.println("Enter Doctor ID :");
        String doctorId = scanner.nextLine();

        System.out.println("Enter Doctor specialization :");
        String specialization = scanner.nextLine();

        System.out.println("Enter Doctor qualification :");
        String qualification = scanner.nextLine();

        System.out.println("Enter Doctor experienceYears :");
        int experienceYears = scanner.nextInt();

        System.out.println("Enter Doctor departmentId :");
        String departmentId = scanner.nextLine();

        System.out.println("Enter Doctor consultationFee :");
        double consultationFee = scanner.nextDouble();

        Doctor doctor = new Doctor(id, doctorFName, doctorLName);
        return doctor;
    }

    public List<Doctor> addDoctors() {

        Boolean continueFlag = true;
        while (continueFlag) {

            doctors.add(addDoctor());
            System.out.println("Doctor add successfully");

            System.out.println("Enter c to add more , and q to exit");
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return doctors;

    }

    public void editDoctor(String doctorId) {

        for (Doctor doctor : doctors) {

            if (doctor.getDoctorId().equals(doctorId)) {
                System.out.println("Enter updated Doctor id :");
                doctor.setId(scanner.nextLine());

                System.out.println("Enter updated Doctor first name :");
                doctor.setFirstname(scanner.nextLine());

                System.out.println("Enter updated Doctor last name :");
                doctor.setLastname(scanner.nextLine());

                System.out.println("Enter updated Doctor DOB: ");
                String dateOfBirth = scanner.nextLine();
                LocalDate DOB = LocalDate.parse(dateOfBirth);
                doctor.setDateofBrith(DOB);

                System.out.println("Enter updated Doctor gender :");
                doctor.setgender(scanner.nextLine());

                System.out.println("Enter updated Doctor phone number :");
                doctor.setphoneNumber(scanner.nextLine());

                System.out.println("Enter updated Doctor email :");
                doctor.setemail(scanner.nextLine());

                System.out.println("Enter updated Doctor address :");
                String address = scanner.nextLine();

                System.out.println("Enter updated Doctor ID :");
                doctor.setdoctorId(scanner.nextLine());

                System.out.println("Enter updated Doctor specialization :");
                doctor.setSpecialization(scanner.nextLine());

                System.out.println("Enter updated Doctor qualification :");
                doctor.setQualification(scanner.nextLine());

                System.out.println("Enter updated Doctor experienceYears :");

                doctor.setexperienceYears(scanner.nextInt());

                System.out.println("Enter updated Doctor departmentId :");

                doctor.setdepartmentId(scanner.nextLine());

                System.out.println("Enter updated Doctor consultationFee :");

                doctor.setConsultationFee(scanner.nextDouble());

                System.out.println("patient updated successfully");

            }
        }

    }

    public void removeDoctor(String doctorId) {

        for (Doctor d :doctors) {
            doctors.remove(d);
        }
        System.out.println("patient removed successfully");

        System.out.println("patient not found");

    }

    public Doctor getDoctorById(String doctorId) {

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return doctor;
            }

        }
        System.out.println("doctor not found");
        return null;
    }


    public void displayAllDoctors() {

        for (Doctor doctor : doctors) {
            doctor.displayInfo();
        }

    }

    public List<Doctor> getDoctorsBySpecialization(String specialization) {

        List<Doctor> specializationDoctors = new ArrayList<>();

        for (Doctor doctor : doctors) {

            if (doctor.getSpecialization().equals(specialization)) {
                specializationDoctors.add(doctor);
            }
        }
        return specializationDoctors;
    }

    public List<Doctor> getAvailableDoctors() {

        List<Doctor> availableDoctors = new ArrayList<>();

        for (Doctor doctor : doctors) {

            if (doctor.getAvailableSlots() != null &&
                    !doctor.getAvailableSlots().isEmpty()) {

                availableDoctors.add(doctor);
            }
        }

        return availableDoctors;
    }
    public void addDoctor(String name, String specialization, String phone) {

        Doctor doctor = new Doctor(name, specialization, phone);

        doctors.add(doctor);

        System.out.println("Doctor added successfully");
    }

    public void assDoctor(String name, String specialization, String phone, double consultationFee) {

        Doctor doctor = new Doctor(name, specialization, phone);

        doctors.add(doctor);

        System.out.println("Doctor added successfully");

    }

    public void addDoctor(Doctor doctor) {

        doctors.add(doctor);
        System.out.println("Doctor object added successfully");
    }

    public void assignPatient(String doctorId, String patientId) {

        for (Doctor doctor : doctors) {

            if (doctor.getDoctorId().equals(doctorId)) {

                doctor.setaddress(patientId);

                System.out.println("Doctor assigned successfully");
            }
        }
    }

    public void assignPatient(String doctorId, List<String> patientIds) {

        for (Doctor doctor : doctors) {

            if (doctorId.equals(doctor.getDoctorId())) {

                for (String patientId : patientIds) {

                    doctor.assignPatient(patientId);

                    System.out.println("patients assigned successfully");

                }
            }

        }
    }

    public void displayDoctors() {


        for (Doctor doctor : doctors) {

            doctor.displayInfo();
        }
    }

    public void displayDoctors(String specialization) {

        for (Doctor doctor : doctors) {

            if (doctor.getSpecialization().equals(specialization)) {

                doctor.displayInfo();
            }
        }

    }

    public void displayDoctors(String departmentId, boolean showAvailableOnly) {

        for (Doctor doctor : doctors) {

            if (doctor.getdepartmentId().equals(departmentId)) {

                if (showAvailableOnly) {

                    if (doctor.getAvailableSlots() != null &&
                            !doctor.getAvailableSlots().isEmpty()) {

                        doctor.displayInfo();
                    }

                } else {
                    doctor.displayInfo();
                }
            }
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

    public class doctor {


        public void add(Object entity) {
            System.out.println("added  Doctor id :");

            System.out.println("added  Doctor first name :");

            System.out.println("added  Doctor last name :");

            System.out.println("added  Doctor DOB: ");


            System.out.println("added  Doctor gender :");

            System.out.println("added  Doctor phone number :");

            System.out.println("added  Doctor email :");

            System.out.println("added  Doctor address :");

            System.out.println("added  Doctor ID :");

            System.out.println("added  Doctor specialization :");

            System.out.println("added  Doctor qualification :");

            System.out.println("added  Doctor experienceYears :");


            System.out.println("added  Doctor departmentId :");


            System.out.println("added  Doctor consultationFee :");


        }

        public void handleDoctorMenu() {

            Boolean patientExit = true;

            while (patientExit) {

                System.out.println(MenuMessage.PatientManagementMenu);

                int option = InputHandler.getIntInput(Constants.ENTER_OPTION, 0, 9);

                switch (option) {

                    case 1 -> {
                        AddDoctor();
                    }

                    case 2 -> {

                        AddSurgeon();
                    }

                    case 3 -> {
                        AddConsultant();
                    }

                    case 4 -> {
                        AddGeneralPractitioner();
                    }

                    case 5 -> {
                        SearchDoctorbySpecialization();                    }

                    case 6 -> {

                        ViewAvailableDoctors();

                        String key = InputHandler.getStringInput("Search keyword: ");
                        search(key);
                    }

                    case 7 -> {
                        AssignPatienttoDoctor();
                    }

                    case 8-> {

                        UpdateDoctorInformation();

                    }

                    case 9-> {
                        RemoveDoctor();

                    }

                    case 10 -> {

                        String patientId = InputHandler.getStringInput("Enter patient Id: ");
                        remove(patientId);
                    }

                    case 11 -> {

                        String patientId = InputHandler.getStringInput("Enter patient Id: ");
                        displayPatientHistory(patientId);
                    }

                    }
            }
        }
    }

}






