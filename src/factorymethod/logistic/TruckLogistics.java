package factorymethod.logistic;

public class TruckLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
