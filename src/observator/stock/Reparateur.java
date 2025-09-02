package observator.stock;

public class Reparateur implements Subscriber {

    @Override
    public void update() {
        System.out.println("Un nouveau telephone est disponible");
    }
}
