package visitor;

public interface Visitor {

    void visitMairie(Mairie mairie);

    void visitRestaurant(Restaurant restaurant);

    void visitMusee(Musee musee);

    void visitPoste(Poste poste);

    void visitParc(Parc parc);

}
