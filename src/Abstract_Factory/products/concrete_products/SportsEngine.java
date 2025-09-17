package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Engine;

//Concrete Product(sport)
public class SportsEngine implements Engine {
    @Override
    public String getType() {
        return "V12,N74 Engine";
    }
}
