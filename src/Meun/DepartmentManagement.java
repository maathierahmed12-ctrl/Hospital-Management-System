package Meun;

import java.util.Scanner;

public class DepartmentManagement {

    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Department Management=========");

        System.out.println("6.1 Add Department");
        System.out.println("6.2 View All Departments");
        System.out.println("6.3 View Department Details");
        System.out.println("6.4 Assign Doctor to Department");
        System.out.println("6.5 Assign Nurse to Department");
        System.out.println("6.6 Update Department Information");
        System.out.println("6.7 View Department Statistics");
        System.out.println("6.60 Exit");

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
        while (choice != 60);
    }
}








