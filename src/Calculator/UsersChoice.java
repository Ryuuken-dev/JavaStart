package Calculator;

public class UsersChoice {

    double firstNumber;
    double secondNumber;
    byte operationType;

    public UsersChoice(double firstNumber, double secondNumber, byte operationType){

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operationType = operationType;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public char getOperationType() {
        char type = '+';
        switch (operationType){
            case 2:
                type = '-';
                break;
            case 3:
                type = '*';
                break;
            case 4:
                type = '/';
        }
        return type;
    }

}
