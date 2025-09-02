package visitor;

public class TouristeVisitor extends EmptyVisitor {

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Horaire " + restaurant.getHoraires() + ", prix=" + restaurant.getPrixMoyen());
    }

    @Override
    public void visitMusee(Musee musee) {
        System.out.println("Horaire " + musee.getHoraires() + ", public=" + musee.getPublicVise());
    }
}
