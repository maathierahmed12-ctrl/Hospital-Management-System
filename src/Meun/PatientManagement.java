package Meun;

import java.util.Scanner;


public class PatientManagement {

    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Patient  Management=========");

        System.out.println("1.1 Register New Patient");
        System.out.println("1.2 Register InPatient");
        System.out.println("1.3 Register OutPatient");
        System.out.println("1.4 Register Emergency Patient");
        System.out.println("1.5 View All Patients");
        System.out.println("1.6 Search Patient");
        System.out.println("1.7 Update Patient Information");
        System.out.println("1.8 Remove Patient");
        System.out.println("1.9 View Patient Medical History");
        System.out.println("1.10 Exit");

        System.out.println("Enter your choice");

        choice = Integer.parseInt(input.nextLine());

        switch (choice){

            case 1:

                System.out.println("Register New Patient");

                break;

            case 2:

                System.out.println("Register InPatient");
                break;

            case 3:
                System.out.println("Register OutPatient");

                break;

            case 4:

                System.out.println("Register Emergency Patient");

                break;

            case 5:

                System.out.println("View All Patients");

                break;

            case 6:

                System.out.println("Search Patient");

                break;

            case 7:

                System.out.println("Update Patient Information");

                break;

            case 8:

                System.out.println("Remove Patient");

                break;

            case 9:

                System.out.println("View Patient Medical History");

                break;

        }
        while (choice != 10);
    }
}
