package AbstractClassChallenge;

public class Furniture extends ProductsForSale{
    public Furniture(String type, int price, String des) {
        super(type, price, des);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in Sweden");
        System.out.printf("The price of the piece is %6.2f kr %n", price);
        System.out.println(des);

    }
}
