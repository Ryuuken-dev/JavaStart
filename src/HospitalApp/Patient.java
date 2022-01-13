package HospitalApp;

public class Patient {

    private final String name;
    private final String surname;
    private final String peselNumber;

    public Patient(String name, String surname, String peselNumber){

        this.name = name;
        this.surname = surname;
        this.peselNumber = peselNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    @Override
    public String toString(){
        return "Imię: " + name + '\n' +
                "Nazwisko: " + surname + '\n' +
                "PESEL: " + peselNumber;
    }
}
