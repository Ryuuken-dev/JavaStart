package Exercises.DiscountApp;

public class Client {

    private String name;
    private String surname;
    private boolean premium;

    public Client(String name, String surname, boolean premium) {
        this.name = name;
        this.surname = surname;
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
