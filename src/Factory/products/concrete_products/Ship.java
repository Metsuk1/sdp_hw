package Factory.products.concrete_products;

import Factory.products.Transport;

//Concrete product
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container");
    }
}
