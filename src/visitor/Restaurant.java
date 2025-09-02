package visitor;

public class Restaurant implements Lieu {
    public String getHoraires() {
        return null;
    }

    public double getPrixMoyen() {
        return 0;
    }

    @Override
    public void accept(Visitor v) {
        v.visitRestaurant(this);
    }
}
