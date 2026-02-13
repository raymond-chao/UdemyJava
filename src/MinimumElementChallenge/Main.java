package MinimumElementChallenge;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] findInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1, 2, 3, 5");
        String text = scanner.nextLine();

        String[] split = text.split(",");
        int[] values = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] returnedArray = findInteger();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min  =" + returnedMin);

    }
}