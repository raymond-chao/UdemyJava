package TheArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = randomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] { 7, 30, 25});
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] randomArray(int length){

        Random random = new Random();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;

    }

    private static int[] sortIntegers(int[] intArray){

        System.out.println(Arrays.toString(intArray));
        int[] sortedArray = Arrays.copyOf(intArray, intArray.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

}
