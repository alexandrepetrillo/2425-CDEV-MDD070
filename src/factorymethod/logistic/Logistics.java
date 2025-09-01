package factorymethod.logistic;


public abstract class Logistics {

    public void planDelivery() {
        //....
        Transport transport = createTransport();
    }

    public abstract Transport createTransport();
}
