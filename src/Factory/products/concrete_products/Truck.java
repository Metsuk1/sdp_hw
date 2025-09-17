package Factory.products.concrete_products;

import Factory.products.Transport;

//Concrete product
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box");
    }
}
