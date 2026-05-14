package Meun;

import java.util.Scanner;

public class MedicalRecordsManagement {

    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Medical  Records   Management=========");

        System.out.println("5.1 Create Medical Record");
        System.out.println("5.2 View All Records");
        System.out.println("5.3 View Records by Patient");
        System.out.println("5.4 View Records by Doctor");
        System.out.println("5.5 Update Medical Record");
        System.out.println("5.6 Delete Medical Record");
        System.out.println("5.7 Generate Patient History Report");
        System.out.println("5.50 Exit");

        System.out.println("Enter your choice");

        choice = Integer.parseInt(input.nextLine());

        switch (choice){

            case 1:

                System.out.println("Add Nurse");

                break;

            case 2:

                System.out.println("View All Nurses");
                break;

            case 3:
                System.out.println("View Nurses by Department");

                break;

            case 4:

                System.out.println("View Nurses by Shift");

                break;

            case 5:

                System.out.println("Assign Nurse to Patient");

                break;

            case 6:

                System.out.println(" Update Nurse Information");

                break;

            case 7:

                System.out.println("Remove Nurse");
                break;

        }
        while (choice != 10);
    }
}






