package visitor;

public class Parc implements Lieu {

    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParc(this);
    }
}
