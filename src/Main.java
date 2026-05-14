import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("========== Hospital Management System ==========");

            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Nurse Management");
            System.out.println("4. Appointment Management");
            System.out.println("5. Department Management");
            System.out.println("6. Medical Record Management");
            System.out.println("7. Billing Management");
            System.out.println("8. Exit");


            System.out.print(" Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    patientManagementMenu();
                    break;

                case 2:
                    doctorManagementMenu();
                    break;

                case 3:
                    nurseManagementMenu();
                    break;

                case 4:
                    appointmentManagementMenu();
                    break;

                case 5:
                    departmentManagementMenu();
                    break;

                case 6:
                    medicalRecordManagementMenu();
                    break;

                case 7:
                    billingManagementMenu();
                    break;

                case 8:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);
    }

    public static void patientManagementMenu() {

        System.out.println("Patient Management Menu");
    }

    public static void doctorManagementMenu() {

        System.out.println("Doctor Management Menu");
    }

    public static void nurseManagementMenu() {

        System.out.println("Nurse Management Menu");
    }

    public static void appointmentManagementMenu() {

        System.out.println("Appointment Management Menu");
    }

    public static void departmentManagementMenu() {

        System.out.println("Department Management Menu");
    }

    public static void medicalRecordManagementMenu() {

        System.out.println("Medical Record Management Menu");
    }

    public static void billingManagementMenu() {

        System.out.println("Billing Management Menu");
    }
}

