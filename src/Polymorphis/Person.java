package Polymorphis;

public class Person {

    private String name;
    private String surname;
    private double payment;

    public Person(String name, String surname, double payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
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

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getInfo(){
        return "Imię: " + name + ", Nazwisko: " + surname + ", Wynagrodzenie: " + payment;
    }
}
