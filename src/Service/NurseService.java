package Service;

import Entity.Nurse;
import Interface.Manageable;
import Utils.InputHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NurseService {

    Scanner scanner = new Scanner(System.in);

    static List<Nurse> nurses = new ArrayList<>();

    public Nurse addNurse() {

        System.out.println("Enter nurse first name:");
        String firstname = scanner.nextLine();

        System.out.println("Enter nurse last name:");
        String lastname = scanner.nextLine();

        System.out.println("Enter nurse ID:");
        String nurseId = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter date of birth (yyyy-mm-dd):");
        LocalDate dob = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter qualification:");
        String qualification = scanner.nextLine();

        System.out.println("Enter experience years:");
        int experienceYears = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter department ID:");
        String departmentId = scanner.nextLine();

        System.out.println("Enter shift:");
        String shift = scanner.nextLine();

        Nurse nurse = new Nurse(firstname, lastname, nurseId, phone, email, dob, gender, qualification, experienceYears, departmentId, shift);

        nurses.add(nurse);

        System.out.println("Nurse added successfully");

        return nurse;
    }

    public void removeNurse(String nurseId) {

        boolean found = false;

        for (Nurse nurse : nurses) {

            if (nurse.getnurseId().equals(nurseId)) {

                nurses.remove(nurse);

                found = true;

                System.out.println("Nurse removed successfully");

                break;
            }
        }

        if (!found) {
            System.out.println("Nurse not found");
        }
    }

    public void editNurse(String nurseId) {

        for (Nurse nurse : nurses) {

            if (nurse.getnurseId().equals(nurseId)) {

                System.out.println("Enter updated first name:");
                nurse.setFirstname(scanner.nextLine());

                System.out.println("Enter updated last name:");
                nurse.setLastname(scanner.nextLine());

                System.out.println("Enter updated phone:");
                nurse.setphoneNumber(scanner.nextLine());

                System.out.println("Enter updated email:");
                nurse.setemail(scanner.nextLine());

                System.out.println("Enter updated qualification:");

                nurse.setnurseId(scanner.nextLine());

                System.out.println("Enter updated experience years:");

                nurse.setphoneNumber(String.valueOf(Integer.parseInt(scanner.nextLine())));

                System.out.println("Enter updated department ID:");
                nurse.setdepartmentId(scanner.nextLine());

                System.out.println("Enter updated shift:");
                nurse.setShift(scanner.nextLine());

                System.out.println("Nurse updated successfully");

                return;
            }
        }

        System.out.println("Nurse not found");
    }

    public Nurse getNurseById(String nurseId) {

        for (Nurse nurse : nurses) {

            if (nurse.getnurseId().equals(nurseId)) {
                return nurse;
            }
        }

        return null;
    }

    public void displayAllNurses() {

        for (Nurse nurse : nurses) {
            nurse.displayInfo();
        }
    }

    public List<Nurse> getNursesByDepartment(String departmentId) {

        List<Nurse> departmentNurses = new ArrayList<>();

        for (Nurse nurse : nurses) {

            if (nurse.getdepartmentId().equals(departmentId)) {

                departmentNurses.add(nurse);
            }
        }

        return departmentNurses;
    }

    public List<Nurse> getNursesByShift(String shift) {

        List<Nurse> shiftNurses = new ArrayList<>();

        for (Nurse nurse : nurses) {

            if (nurse.getshift().equalsIgnoreCase(shift)) {

                shiftNurses.add(nurse);
            }
        }

        return shiftNurses;
    }

    public class nurse implements Manageable {


        @Override
        public void add(Object entity) {

            System.out.println("added updated first name:");

            System.out.println("added updated last name:");

            System.out.println("added updated phone:");

            System.out.println("added updated email:");

            System.out.println("added updated qualification:");

            System.out.println("added updated experience years:");

            System.out.println("added updated department ID:");

            System.out.println("added updated shift:");

            System.out.println("added updated successfully");

        }

        @Override
        public void remove(String id) {

            System.out.println("remove  first name:");

            System.out.println("remove  last name:");

            System.out.println("remove phone:");

            System.out.println("remove  email:");

            System.out.println("remove  qualification:");

            System.out.println("remove  experience years:");

            System.out.println("remove department ID:");

            System.out.println("remove  shift:");

            System.out.println("remove  successfully");

        }

        @Override
        public void getAll() {


        }

        public void handleNurseMenu() {

            Boolean patientExit = true;

            while (patientExit) {

                System.out.println(MenuMessage.PatientManagementMenu);

                int option = InputHandler.getIntInput(Constants.ENTER_OPTION, 0, 9);

                switch (option) {

                    case 1 -> {
                        AddNurseAddNurse();
                    }

                    case 2 -> {

                        ViewAllNurses();
                    }

                    case 3 -> {
                        ViewNursesbyDepartment();
                    }

                    case 4 -> {
                        ViewNursesbyShift();
                    }

                    case 5 -> {
                        AssignNursetoPatien();                    }

                    case 6 -> {

                        UpdateNurseInformation();

                        String key = InputHandler.getStringInput("Search keyword: ");
                        search(key);
                    }

                    case 7 -> {
                        RemoveNurse();
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
    }

}