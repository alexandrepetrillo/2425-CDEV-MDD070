package factorymethod.logistic;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new TruckLogistics();
        logistics.planDelivery();
    }
}
