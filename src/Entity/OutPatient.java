package Entity;

import Interface.Displayable;

import java.time.LocalDate;

public class OutPatient extends patient {

    private int visitCount;
    private LocalDate lastVisitDate;
    private String preferredDoctorId;

    public OutPatient(int visitCount, LocalDate lastVisitDate,String preferredDoctorId){

        super(visitCount , lastVisitDate ,preferredDoctorId);

        this.visitCount=visitCount;
        this.lastVisitDate=lastVisitDate;
        this.preferredDoctorId=preferredDoctorId;

    }
    public int getVisitCount(){

        return visitCount;
    }
    public void setVisitCount(int visitCount){

        this.visitCount=visitCount;
    }
    public LocalDate getLastVisitDate(){
        return lastVisitDate;
    }
    public void setLastVisitDate(LocalDate lastVisitDate){

        this.lastVisitDate=lastVisitDate;
    }
    public  String getPreferredDoctorId(){

        return preferredDoctorId;
    }

    public void setPreferredDoctorId(String preferredDoctorId){
        this.preferredDoctorId=preferredDoctorId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
    public void addscheduleFollowUp(){

    }
    public void updateVisitCount(){

    }
    public class outpatient implements Displayable{

        private int visitCount;
        private LocalDate lastVisitDate;
        private String preferredDoctorId;

        public outpatient(int visitCount, LocalDate lastVisitDate,String preferredDoctorId){

            this.visitCount=visitCount;
            this.lastVisitDate=lastVisitDate;
            this.preferredDoctorId=preferredDoctorId;

        }

        @Override
        public void displayInfo() {

            System.out.println("visitCount");
            System.out.println("lastVisitDate");
            System.out.println("preferredDoctorId");

        }

        @Override
        public void displaySummary() {

            System.out.println("visitCount,lastVisitDate,preferredDoctorId");

        }
    }
}
