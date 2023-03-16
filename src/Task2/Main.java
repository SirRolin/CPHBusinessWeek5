package Task2;

import Task1.Customer;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        for(String choice: cafe.coffeeMenu){
            System.out.println(choice);
        }
    }
}
