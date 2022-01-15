package StaticComponents;

public class Student {

    private String name;
    private String surname;
    private int idNumber;
    private static int studentsQuantity;

    public Student(String name, String surname, int idNumber) {
        studentsQuantity++;
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public static int getStudentsQuantity() {
        return studentsQuantity;
    }
}
