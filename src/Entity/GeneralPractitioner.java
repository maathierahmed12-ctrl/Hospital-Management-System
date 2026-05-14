package Entity;

import Interface.Displayable;

public class GeneralPractitioner extends Doctor {

    private boolean walkinAvailable;
    private boolean homeVisitAvailable;
    private boolean vaccinationCertified;

    public GeneralPractitioner(String id, String firstname, String lastname,boolean walkinAvailable, boolean homeVisitAvailable, boolean vaccinationCertified) {

        super(id , firstname,lastname);

        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public boolean getWalkinAvailable() {
        return walkinAvailable;
    }

    public void setWalkinAvailable(boolean walkinAvailable) {
        this.walkinAvailable = walkinAvailable;
    }

    public boolean getHomeVisitAvailable() {
        return homeVisitAvailable;
    }

    public void setHomeVisitAvailable(boolean homeVisitAvailable) {
        this.homeVisitAvailable = homeVisitAvailable;
    }

    public boolean getVaccinationCertified() {
        return vaccinationCertified;
    }

    public void setVaccinationCertified(boolean vaccinationCertified) {
        this.vaccinationCertified = vaccinationCertified;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("walkinAvailable: " + walkinAvailable);
        System.out.println("homeVisitAvailable: " + homeVisitAvailable);
        System.out.println("vaccinationCertified: " + vaccinationCertified);
    }

    public void addScheduleHomeVisit() {

        if (homeVisitAvailable) {
            System.out.println("Home visit scheduled successfully");
        } else {
            System.out.println("Home visit not available");
        }
    }

    public void addAdministerVaccine() {

        if (vaccinationCertified) {
            System.out.println("Vaccine administered successfully");
        } else {
            System.out.println("Doctor not certified for vaccination");
        }
    }
}