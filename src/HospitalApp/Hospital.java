package HospitalApp;

public class Hospital {

    private int position = 0;
    private int places = 2;
    private final Object[] patients = new Object[places];


    public int getPlaces() {
        return places;
    }

    public Object[] getPatients() {
        return patients;
    }

    public void setPlaces() {
        this.places++;
    }

    public void setPosition() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
