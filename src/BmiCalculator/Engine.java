package BmiCalculator;

public class Engine {

    Person person;

    public Engine(Person person){

        this.person = person;
    }

    public String getResult(){
        double bmi = person.calculateBMI();
        if (bmi < 16.0){
            return "Jesteś wygłodzony!";
        } else if (bmi >= 16.0 && bmi <= 16.9){
            return "Jesteś wychudzony";
        } else if (bmi >= 17.0 && bmi <= 18.5){
            return "Masz niedowagę";
        } else if (bmi >= 18.5 && bmi <= 24.9){
            return "Waga prawidłowa";
        } else if (bmi >= 25 && bmi <= 29.9){
            return "Masz nadwagę";
        } else if (bmi >= 30.0 && bmi <= 34.9){
            return "Otyłość I stopnia";
        } else if (bmi >= 35.0 && bmi <= 39.9){
            return "Otyłość II stopnia";
        } else {
            return "Otyłość III stopnia";
        }
    }
}
