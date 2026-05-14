package Entity;

import Interface.Displayable;
import Utils.InputHandler;

import javax.swing.event.MenuDragMouseEvent;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

class appointment implements Displayable {

    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private String reason;
    private String notes;

    public appointment(String appointmentId, String patientId, LocalDate appointmentDate) {

        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentId;
        this.status = status;
        this.reason = reason;
        this.notes = notes;
    }

    public appointment(String patientId, String doctorId, LocalDate date, String time) {
    }


    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId() {

        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String ScheduledCompletedCancelledRescheduled) {

        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void displayInfo() {

        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Status: " + status);
        System.out.println("Reason: " + reason);
        System.out.println("Notes: " + notes);
    }

    @Override
    public void displaySummary() {

    }

    public void reschedule(LocalDate newDate, String newTime) {

        this.appointmentDate = newDate;
        this.appointmentTime = appointmentTime;
        this.status = "Rescheduled";
    }

    public void cancel() {

        this.status = "canceled";

    }

    public void complete() {

        this.status = "complete";

    }

    public void add(Appointment appointment) {
    }

    public void setAppointmentId(Date date) {
    }
    public void handleAppointmentMenu() {

        Boolean patientExit = true;

        while (patientExit) {

            System.out.println(MenuMessage.PatientManagementMenu);

            int option = InputHandler.getIntInput(Constants.ENTER_OPTION, 0, 9);

            switch (option) {

                case 1 -> {

                    ScheduleNewAppointment();
                }

                case 2 -> {

                    ViewAllAppointments();
                }

                case 3 -> {
                    ViewAppointmentsbyPatient();
                }

                case 4 -> {
                    ViewAppointmentsbyDoctor();
                }

                case 5 -> {
                    ViewAppointmentsbyDate();                    }

                case 6 -> {

                    RescheduleAppointment();

                    String key = InputHandler.getStringInput("Search keyword: ");
                    search(key);
                }

                case 7 -> {
                     CancelAppointment();
                }

                case 8->{

                    CompleteAppointment();
                }

                case 9->{

                    ViewUpcomingAppointments();
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




