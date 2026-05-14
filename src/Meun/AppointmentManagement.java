package Meun;

import java.util.Scanner;

public class AppointmentManagement {


    Scanner input = new Scanner(System.in);

    int choice;

    {

        System.out.println("========Appointment  Management=========");

        System.out.println("4.1 Schedule New Appointment");
        System.out.println("4.2 View All Appointments");
        System.out.println("4.3 View Appointments by Patient");
        System.out.println("4.4 View Appointments by Doctor");
        System.out.println("4.5 View Appointments by Date");
        System.out.println("4.6 Reschedule Appointment");
        System.out.println("4.7 Cancel Appointment");
        System.out.println("4.8 Complete Appointment");
        System.out.println("4.9 View Upcoming Appointments");
        System.out.println("4.40 Exit");

        System.out.println("Enter your choice");

        choice = Integer.parseInt(input.nextLine());

        switch (choice){

            case 1:

                System.out.println(" Schedule New Appointment");

                break;

            case 2:

                System.out.println("View All Appointments");
                break;

            case 3:
                System.out.println("View Appointments by Patient");

                break;

            case 4:

                System.out.println("View Appointments by Doctor");

                break;

            case 5:

                System.out.println("View Appointments by Date");

                break;

            case 6:

                System.out.println("Reschedule Appointment");

                break;

            case 7:

                System.out.println("Cancel Appointment");
                break;

            case 8:

                System.out.println(" Complete Appointment");

                break;

            case 9:

                System.out.println("View Upcoming Appointments");

                break;

        }
        while (choice != 40);
    }
}


