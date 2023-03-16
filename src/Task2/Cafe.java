package Task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu;
    public void loadMenuData(){
        coffeeMenu = new ArrayList<>();
        File file = new File("src/Task2/coffees.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()){
                coffeeMenu.add(sc.nextLine());
            }
        } catch (IOException e){
            System.out.print(file.getAbsoluteFile() + " - not found.");
        }

    }
}
