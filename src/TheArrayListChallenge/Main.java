package TheArrayListChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public Main(){

        boolean flag = true;
        List<String> groceries = new ArrayList<>();

        while(flag){
            printAction();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);

        }

    }

    public static void addItems(List<String> groceries){
        System.out.println("Add items, seperate by a comma (,)"); 
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }

    }
    public static void removeItems(List<String> groceries){
        System.out.println("Remove items, seperate by a comma (,)");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
                groceries.remove(trimmed);
        }

    }

    public static void main(String[] args) {
        new Main();
    }

    public static void printAction(){
        String text = """ 
                0 - TO SHUTDOWN
                1 - TO  ADD ITEM(S)
                2 - TO REMOVE ITEM(S)
                ENTER A NUMBER FOR WHICH ACTION YOU WANT TO DO:
                """;
        System.out.println(text + " ");

    }
}
