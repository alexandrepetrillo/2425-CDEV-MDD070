package visitor;

public class Poste implements Lieu {
    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitPoste(this);
    }
}
