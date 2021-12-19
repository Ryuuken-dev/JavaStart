package Exercises.DiscountApp;

public class DiscountService {

    public double calculateDiscount(Client client, double price){
        if (client.isPremium()){
            return calculatePremiumDiscount(price);
        }
        return calculateStandardDiscount(price);
    }

    private static double calculateStandardDiscount(double price){
        if (price > 1000){
            return applyDiscount(price, 0.1);
        }
        return price;
    }

    private static double calculatePremiumDiscount(double price){
        if (price > 1000){
            return applyDiscount(price, 0.15);
        }
        return applyDiscount(price, 0.05);
    }

    private static double applyDiscount(double price, double discount){
        return price * (1 - discount);
    }

}
