package Exercises.DiscountApp;

public class DiscountApp {

    public static void main(String[] args) {

        double price = 1100;
        Client client = new Client("Jan", "Kowalski", false);
        DiscountService discountService = new DiscountService();
        Results results = new Results();
        System.out.println(results.getResults(discountService, client, price));
    }
}
