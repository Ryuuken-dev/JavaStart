package Inheritance;

public class ExhaustPart extends Part{

    private boolean isCompatibleWithEEES;       //EEES-Europejski Standard Emisji Spalin

    public boolean isCompatibleWithEEES() {
        return isCompatibleWithEEES;
    }

    public void setCompatibleWithEEES(boolean compatibleWithEEES) {
        isCompatibleWithEEES = compatibleWithEEES;
    }
}
