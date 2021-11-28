package OOP;

public class Employee {

    private String name;
    private String surname;
    private int birthYear;
    private int workExperience;

    public Employee(String name, String surname, int birthYear, int workExperience) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
