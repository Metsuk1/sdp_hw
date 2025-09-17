package Factory.creators.concrete_creators;

import Factory.creators.Logistics;
import Factory.products.Transport;
import Factory.products.concrete_products.Ship;

// Concrete Creator
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
