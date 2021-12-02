package BmiCalculator;

public class General {

    public static void main(String[] args) {

        Person person = new Person((short) 67, (short) 185);
        Engine engine = new Engine(person);
        System.out.println(engine.getResult());
    }
}
