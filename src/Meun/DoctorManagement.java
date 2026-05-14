package Meun;

import java.util.Scanner;

public class DoctorManagement {

    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Doctor Management=========");

        System.out.println("2.1 Add Doctor");
        System.out.println("2.2 Add Surgeon");
        System.out.println("2.3 Add Consultant");
        System.out.println("2.4 Add General Practitioner");
        System.out.println("2.5 View All Doctors");
        System.out.println("2.6 Search Doctor by Specialization");
        System.out.println("2.7 View Available Doctors");
        System.out.println("2.8 Assign Patient to Doctor");
        System.out.println("2.9 Update Doctor Information");
        System.out.println("2.10 Remove Doctor");
        System.out.println("2.20 Exit");

        System.out.println("Enter your choice");

        choice = Integer.parseInt(input.nextLine());

        switch (choice){

            case 1:

                System.out.println("Add Doctor");

                break;

            case 2:

                System.out.println("Add Surgeon");
                break;

            case 3:
                System.out.println("Add Consultant");

                break;

            case 4:

                System.out.println("Add General Practitioner");

                break;

            case 5:

                System.out.println("View All Doctors");

                break;

            case 6:

                System.out.println("Search Doctor by Specialization");

                break;

            case 7:

                System.out.println("View Available Doctors");

                break;

            case 8:

                System.out.println("Assign Patient to Doctor");

                break;

            case 9:

                System.out.println("Update Doctor Information");

                break;

            case 10:

                System.out.println("Remove Doctor");

        }
        while (choice != 20);
    }
}
