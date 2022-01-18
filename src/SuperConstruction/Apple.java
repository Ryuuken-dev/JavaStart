package SuperConstruction;

public class Apple extends Fruit{

    public static final String TYPE = "jabłkowaty";
    private String variety;

    public Apple(double weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + '\n' +
                "Odmiana: " + getVariety();
    }
}
