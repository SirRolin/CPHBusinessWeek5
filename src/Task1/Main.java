package Task1;

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        String[] names = {"Nicolai Theis Rolin", "Kristian Høj", "Patrik", "Nicklas", "Signe Kongsgaard", "Tess La"}; //:P
        String[] usernames = {"NicolaiR20", "KristianH13", "Patrik9510", "Nicklas0001", "Kong Signe", "La Tesla"};
        for (int i = 0; i < 6; ++i) {
            customers.add(new Customer(names[i], usernames[i]));
        }
        printCustomers();
    }

    static void printCustomers() {
        for (int i = 0; i < customers.size(); ++i) {
            System.out.println(customers.get(i));
        }
    }

}
