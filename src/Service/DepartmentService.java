package Service;

import Entity.Department;
import Interface.Manageable;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService implements Manageable {

    Scanner scanner = new Scanner(System.in);

    static List<Department> departments = new ArrayList<>();

    public void addDepartment() {

        System.out.println("Cardiology Department");

        String Cardiology = scanner.nextLine();

        System.out.println("Neurology Department");

        String Neurology = scanner.nextLine();

        System.out.println("Orthopedics Department");

        String Orthopedics = scanner.nextLine();

        System.out.println("Pediatrics Department");

        String Pediatrics = scanner.nextLine();

        System.out.println("Emergency Department");

        String Emergency = scanner.nextLine();

        System.out.println("Surgery Department");

        String Surgery = scanner.nextLine();

        System.out.println("Dermatology Department");

        String Dermatology = scanner.nextLine();

        System.out.println("Radiology Department");

        String Radiology = scanner.nextLine();

        System.out.println("Internal Medicine Department");

        String Internal = scanner.nextLine();

        System.out.println("ICU Department");

        String ICU = scanner.nextLine();

    }

    public void removeDepartment() {

        boolean found = false;

        for (Department department : departments) {

            if (departments.getFirst().equals(department)) {

                departments.remove(department);

                found = true;

                System.out.println("Department removed successfully");

                break;
            }
        }
        if (!found) {

            System.out.println("Department not found");

        }

    }

    public void editDepartment(String DepartmentId) {

        for (Department department : departments) {

            if (departments.getLast().equals(DepartmentId)) {

                System.out.println("Enter update Cardiology");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Neurology ");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Orthopedics");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Pediatrics");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Emergency");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Surgery");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Dermatology");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Radiology ");

                department.setDepartmentName(scanner.nextLine());

                System.out.println("Enter update Internal");

                department.setDepartmentName(scanner.nextLine());
            }
            System.out.println("Department not found");
        }
    }

    public Department getDepartmentById(String DepartmentId) {

        for (Department department : departments) {

            if (departments.getFirst().equals(department)) {

                return department;
            }
        }

        return null;
    }

    public void displayAllDepartment() {

        for (Department department : departments) {

            department.displayInfo();
        }
    }


    public void assignDoctorToDepartment(String doctorId, String departmentId) {

        for (Department department : departments) {

            if (department.getDepartmentId().equals(departmentId)) {

                department.assignDoctor(doctorId);

                System.out.println("Doctor assigned successfully");

                return;
            }
        }

        System.out.println("Department not found");
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

    public void handleDepartmentMenu() {

        Boolean patientExit = true;

        while (patientExit) {

            System.out.println(MenuMessage.PatientManagementMenu);

            int option = InputHandler.getIntInput(Constants.ENTER_OPTION, 0, 9);

            switch (option) {

                case 1 -> {

                    AddDepartment();
                }

                case 2 -> {

                    ViewAllDepartments();
                }

                case 3 -> {
                    ViewDepartmentDetails();
                }

                case 4 -> {
                    AssignDoctortoDepartment();
                }

                case 5 -> {
                    AssignNursetoDepartment();                    }

                case 6 -> {

                    UpdateDepartmentInformation();

                    String key = InputHandler.getStringInput("Search keyword: ");
                    search(key);
                }

                case 7 -> {
                    ViewDepartmentStatistics();

                }

                case 10 -> {

                    String patientId = InputHandler.getStringInput("Enter patient Id: ");
                    remove(patientId);
                }

                case 12 -> {

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





