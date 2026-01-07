package PrimeNumberChallenge;

public class Main {

    public static void main(String[] args) {

        int countNumbers = 0;

        for (int i = 10; i <= 1000; i++) {
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                countNumbers++;
                if (countNumbers == 3) {
                    System.out.println("Found 3 numbers");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int i = 2; i <= wholeNumber/2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
            
        }
        return true;
    }
}
