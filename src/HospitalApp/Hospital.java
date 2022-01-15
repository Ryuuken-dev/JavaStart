package HospitalApp;

public class Hospital {

    private int position = 0;
    private int places = 10;
    private final Object[] patients = new Object[places];


    public int getPlaces() {
        return places;
    }

    public Object[] getPatients() {
        return patients;
    }

    public void decreasePlacesNumber(){--this.places;}

    public void setPlaces(int quantity) {
        this.places = quantity;
    }

    public void setPosition() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
