package OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Flight {

    private String cityOfDeparture;
    private String destinationCity;
    private int price;
    private int numberOfPlaces;
    private String date;
    private Object[] passengers = new Object[numberOfPlaces];



    public Flight(String cityOfDeparture, String destinationCity, int price, int numberOfPlaces,
                  String date){

        this.cityOfDeparture = cityOfDeparture;
        this.destinationCity = destinationCity;
        this.price = price;
        this.numberOfPlaces = numberOfPlaces;
        this.date = date;
    }


    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public String getDate() {
        return date;
    }

    public CharSequence getPassengers() {
        if (passengers.length != 0) {
            StringBuilder result = new StringBuilder();
            for (Object el :
                    passengers) {
                result.append(el);
            }
            return result;
        }
        return "Brak pasażerów";
    }

    public void addPassenger(Object passenger){
        if (passengers.length != numberOfPlaces){
            ArrayList<Object> newList = new ArrayList<Object>(Arrays.asList(passengers));
            newList.add(passenger);
            passengers = newList.toArray(passengers);
        }
    }

}
