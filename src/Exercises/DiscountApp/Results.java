package Exercises.DiscountApp;

public class Results {

    private static String clientValidate(Client client){
        if (client.getName() == null && client.getSurname() == null){
            return "Witaj nieznajomy";
        } else if (client.getName() == null){
            return "Dzień dobry panie/pani " + client.getSurname();
        } else if (client.getSurname() == null){
            return "Witaj " + client.getName();
        }
        return "Witaj " + client.getName() + " " + client.getSurname();
    }

    private static String priceMsg(double price){
        return "Do zapłaty: " + price;
    }

    private static String priceWithDiscountMsg(double price, Client client, DiscountService service){
        return "Do zapłaty (po rabacie): " + service.calculateDiscount(client, price);
    }

    public String getResults(DiscountService service, Client client, double price){
        return clientValidate(client) + '\n' + priceMsg(price) + '\n' + priceWithDiscountMsg(price, client, service);
    }
}
