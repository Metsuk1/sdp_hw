package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Tire;

//Concrete Product(luxury)
public class LuxuryTire implements Tire {
    @Override
    public String getTire() {
        return "Premium Comfort Tires";
    }
}
