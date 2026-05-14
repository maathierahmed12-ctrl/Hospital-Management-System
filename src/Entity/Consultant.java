package Entity;


import Interface.Displayable;

import java.util.ArrayList;
import java.util.List;

public class Consultant extends Doctor implements Displayable{

        private List<String>consultationTypes;
        private boolean onlineConsultationAvailable ;
        private int consultationDuration;
        private String consultationType;

    public Consultant(List<String> consultationTypes, boolean onlineConsultationAvailable, int consultationDuration) {

            super(consultationDuration, consultationTypes, onlineConsultationAvailable);

            this.consultationTypes=consultationTypes;
            this.consultationDuration=consultationDuration;
            this.onlineConsultationAvailable=onlineConsultationAvailable;


        }
        public List<String>getconsultationTypes(){

            return consultationTypes;
        }
        public void setConsultationTypes(List<String>consultationTypes){

            this.consultationTypes=consultationTypes;
        }

        public boolean getOnlineConsultationAvailable(){

            return onlineConsultationAvailable;
        }
        public void setOnlineConsultationAvailable(boolean onlineConsultationAvailable){

            this.onlineConsultationAvailable=onlineConsultationAvailable;

        }
          public int getConsultationDuration(){

            return consultationDuration;

          }
          public void setConsultationDuration(int consultationDuration){

            this.consultationDuration=consultationDuration;
          }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void displaySummary() {

    }

    public void addscheduleConsultation() {

        if (consultationTypes == null) {

            consultationTypes = new ArrayList<>();

            consultationTypes.add(consultationType);

            System.out.println("consultation scheduled successfully ");
        }
    }

    public void provideSecondOpinion() {

        System.out.println("Second opinion provided");
    }
public class consultant {

    private List<String> consultationTypes;
    private boolean onlineConsultationAvailable;
    private int consultationDuration;
    private String consultationType;

    public consultant(List<String> consultationTypes, boolean onlineConsultationAvailable, int consultationDuration) {


        this.consultationTypes = consultationTypes;
        this.consultationDuration = consultationDuration;
        this.onlineConsultationAvailable = onlineConsultationAvailable;


    }

}
}





