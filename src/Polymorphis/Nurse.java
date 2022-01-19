package Polymorphis;

public class Nurse extends Person{

    private int overtime;

    public Nurse(String name, String surname, double payment, int overtime){
        super(name, surname, payment);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public String getInfo(){
        return super.getInfo() + " Nadgodziny: " + overtime;
    }
}
