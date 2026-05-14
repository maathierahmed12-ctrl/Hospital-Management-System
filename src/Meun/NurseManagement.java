package Meun;

import java.util.Scanner;

public class NurseManagement {

    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Nurse   Management=========");

        System.out.println("3.1 Add Nurse");
        System.out.println("3.2 View All Nurses");
        System.out.println("3.3 View Nurses by Department");
        System.out.println("3.4 View Nurses by Shift");
        System.out.println("3.5 Assign Nurse to Patient");
        System.out.println("3.6 Update Nurse Information");
        System.out.println("3.7 Remove Nurse");
        System.out.println("3.30 Exit");

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
        while (choice != 30);
    }
}




