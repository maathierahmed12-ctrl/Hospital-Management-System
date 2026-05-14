package Meun;

import java.util.Scanner;

public class ReportsandStatistics {
    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Reports and Statistics=========");

        System.out.println("7.1 Daily Appointments Report");
        System.out.println("7.2 Doctor Performance Report");
        System.out.println("7.3 Department Occupancy Report");
        System.out.println("7.4 Patient Statistics");
        System.out.println("7.5 Emergency Cases Report");
        System.out.println("7.70 Exit");

        System.out.println("Enter your choice");

        choice = Integer.parseInt(input.nextLine());

        switch (choice){

            case 1:

                System.out.println("Add Department");

                break;

            case 2:

                System.out.println("View All Departments");
                break;

            case 3:
                System.out.println("View Department Details");

                break;

            case 4:

                System.out.println("Assign Doctor to Department");

                break;

            case 5:

                System.out.println("Assign Nurse to Department");

                break;

            case 6:

                System.out.println(" Update Department Information");

                break;

            case 7:

                System.out.println("View Department Statistics");
                break;

        }
        while (choice != 70);
    }
}









