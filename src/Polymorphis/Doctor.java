package Polymorphis;

public class Doctor extends Person{

    private double bonus;

    public Doctor(String name, String surname, double payment, double bonus) {
        super(name, surname, payment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo(){
        return super.getInfo() + " Premia: " + bonus;
    }
}
