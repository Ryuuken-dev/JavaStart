package OOP;

public class Author {

    private final String name;
    private final String surname;
    private final String gender;

    public Author(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
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


}
