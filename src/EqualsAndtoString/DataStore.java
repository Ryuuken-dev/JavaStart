package EqualsAndtoString;

public class DataStore {

    private static final int AVAILABLE_SPACE = 100;
    Computer[] devicesInShop = new Computer[AVAILABLE_SPACE];
    private int devicePosition = 0;

    public void add(Computer computer){
        devicesInShop[devicePosition] = computer;
        devicePosition++;
    }

    public StringBuilder getInfo(){
        StringBuilder result = new StringBuilder();
        for (Computer computer : devicesInShop) {
            if (computer != null){
                result.append(computer).append('\n');
            }
        }
        return result;
    }

    public int checkAvailability(Computer computer){
        if (computer == null){
            return 0;
        }
        int quantity = 0;
        for (Computer computer1: devicesInShop) {
            if (computer.equals(computer1)){
                quantity++;
            }
        }
        return quantity;
    }
}
