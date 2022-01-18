package Inheritance;

public class Tire extends Part{

    private int size;
    private double width;

    public Tire(int idNumber, String producerName, String model, String productSeries, int size, double width){

        this.size = size;
        this.width = width;
        setIdNumber(idNumber);
        setProducerName(producerName);
        setModel(model);
        setProductSeries(productSeries);

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printInfo(){
        System.out.println(getIdNumber() + " " + getProducerName() + " " + getModel() + " " + getProductSeries() +
                " " + size + " " + width);
    }
}
