package observator.stock;

import java.util.ArrayList;
import java.util.List;

public class Magasin {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void recevoirNoueauModele() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
