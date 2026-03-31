package TheLambdaChallenge;

import java.util.function.Consumer;

public class Main {
    Consumer<String> printTheParts = new Consumer<String>() {
        @Override
        public void accept(String sentence) {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    };
    public void acceptL(String sentence){
    }
}
