package TheReverseArrayChallenge;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        System.out.println("" + Arrays.toString(arr));
    }
}
