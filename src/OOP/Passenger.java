package OOP;

public class Passenger {

    private String name;
    private String surname;
    private String gender;
    private int age;

    public Passenger(String name, String surname, String gender, int age){

        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger:\n" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age + '\n';
    }
}
