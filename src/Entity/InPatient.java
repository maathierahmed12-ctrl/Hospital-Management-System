package Entity;

import java.time.LocalDate;

public class InPatient extends patient {

    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String roomNumber;
    private String bedNumber;
    private String admittingDoctorId;
    private double dailyCharges;

    public InPatient(String patientId, String firstname,
                     double dailyCharges) {

        super(patientId, firstname);

        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.dailyCharges = dailyCharges;
        this.admissionDate = null;
        this.dischargeDate = null;
        this.admittingDoctorId = null;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public String getAdmittingDoctorId() {
        return admittingDoctorId;
    }

    public void setAdmittingDoctorId(String admittingDoctorId) {
        this.admittingDoctorId = admittingDoctorId;
    }

    public double getDailyCharges() {
        return dailyCharges;
    }

    public void setDailyCharges(double dailyCharges) {
        this.dailyCharges = dailyCharges;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("roomNumber: " + roomNumber);
        System.out.println("bedNumber: " + bedNumber);
        System.out.println("dailyCharges: " + dailyCharges);
        System.out.println("admissionDate: " + admissionDate);
        System.out.println("dischargeDate: " + dischargeDate);
        System.out.println("admittingDoctorId: " + admittingDoctorId);
    }

    public long calculateStayDuration() {

        if (admissionDate != null && dischargeDate != null) {
            return java.time.temporal.ChronoUnit.DAYS.between(admissionDate, dischargeDate);
        }
        return 0;
    }

    public double calculateTotalCharges() {

        long days = calculateStayDuration();
        return days * dailyCharges;
    }
}