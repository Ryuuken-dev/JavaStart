package Inheritance;

public class Muffler extends ExhaustPart{

    private String type;
    private String materialType;

    public Muffler(int idNumber, String producerName, String model, String productSeries,
                   boolean isCompatibleWithEEES, String type, String materialType){

        setIdNumber(idNumber);
        setProducerName(producerName);
        setModel(model);
        setProductSeries(productSeries);
        this.type = type;
        this.materialType = materialType;
        setCompatibleWithEEES(isCompatibleWithEEES);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public void printInfo(){
        System.out.println(getIdNumber() + " " + getProducerName() + " " + getModel() + " " + getProductSeries() +
                " " + isCompatibleWithEEES());
    }
}
