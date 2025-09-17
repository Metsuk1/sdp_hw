package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Tire;

//Concrete Product(sport)
public class SportsTire implements Tire {
    @Override
    public String getTire() {
        return "Racing Slick Tires";
    }
}
