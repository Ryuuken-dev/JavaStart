package Polymorphis;

public class Hospital {

    private static final int MAX_EMPLOYEES = 3;
    private Person[] hospitalStaff = new Person[3];
    private int employeesNumber = 0;


    public void add(Person person){
        if (employeesNumber < hospitalStaff.length){
            hospitalStaff[employeesNumber] = person;
            employeesNumber++;
        }
    }

    public StringBuilder getInfo(){
        StringBuilder result = new StringBuilder();
        for (Person person : hospitalStaff) {
            result.append(person.getInfo()).append('\n');
        }
        return result;
    }
}
