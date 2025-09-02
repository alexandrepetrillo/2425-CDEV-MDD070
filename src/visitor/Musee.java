package visitor;

public class Musee implements Lieu {
    public String getPublicVise() {
        return "enfant";
    }

    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitMusee(this);
    }
}
