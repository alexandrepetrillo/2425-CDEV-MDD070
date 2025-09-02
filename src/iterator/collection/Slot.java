package iterator.collection;

public class Slot {

    private String valeur;
    private Slot nextSlot;

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Slot getNextSlot() {
        return nextSlot;
    }

    public void setNextSlot(Slot nextSlot) {
        this.nextSlot = nextSlot;
    }

    public Slot(String valeur, Slot nextSlot) {
        this.valeur = valeur;
        this.nextSlot = nextSlot;
    }
}
