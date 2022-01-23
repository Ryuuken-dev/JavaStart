package Enum;

public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true),
    PROSCIUTTO(true, true, true, false);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean ham;
    private final boolean mushrooms;

    Pizza(boolean tomatoSauce, boolean cheese, boolean ham, boolean mushrooms){

        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    public String toString(){
        String result = name() + " (";
        if (tomatoSauce){
            result += "sos pomidorowy";
        }
        if (cheese){
            result += ", ser";
        }
        if (ham){
            result += ", szynka";
        }
        if (mushrooms){
            result += ", pieczarki";
        }
        result += ")";
        return result;
    }


}
