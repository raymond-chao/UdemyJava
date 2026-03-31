package LinkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    record Place(String name, int distance) {

        @Override
        public String toString() {
            return String.format("%s, (%d)", name, distance);
        }
    }
    public static void addPlace(LinkedList<Place> list , Place place) {
        if (list.contains(place)) {
            System.out.println(place.name() + " is already in the list");
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println(p.name + " is already in the list");
                return;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (place.distance() < list.get(i).distance()) {
                list.add(i, place);
                return;
            }
        }

        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """);

    }

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));


        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.hasNext());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.hasPrevious());
                forward = false;
            }

            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());

                    }
                    break;
                case "B":
                    System.out.println("User wants to go back");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());

                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;

                default: quitLoop = true;
                break;
            }
        }

    }
}