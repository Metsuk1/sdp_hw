package Factory.creators.concrete_creators;

import Factory.creators.Logistics;
import Factory.products.Transport;
import Factory.products.concrete_products.Truck;

// Concrete Creator
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
