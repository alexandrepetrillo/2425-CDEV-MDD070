package observator.stock;

public class Client implements Subscriber {

    @Override
    public void update() {
        System.out.println("Du stock de dispo");
    }
}
