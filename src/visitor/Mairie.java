package visitor;

public class Mairie implements Lieu {
    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitMairie(this);
    }
}
