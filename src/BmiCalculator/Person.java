package BmiCalculator;

public class Person {

    private short weight;
    private short height;

    public Person(short weight, short height){

        this.weight = weight;
        this.height = height;
    }

    public short getWeight() {
        return weight;
    }

    public short getHeight() {
        return height;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public double calculateBMI(){
        return weight/(Math.pow(height, 2));
    }
}
