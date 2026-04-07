package AbstractClassChallenge;

public class ArtObject extends ProductsForSale{
    public ArtObject(String type, int price, String des) {
        super(type, price, des);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is beautiful");
        System.out.printf("The price of the piece is %6.2f kr %n", price);
        System.out.println(des);

    }
}
