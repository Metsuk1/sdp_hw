package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Engine;

//Concrete Product(luxury)
public class LuxuryEngine implements Engine {
    @Override
    public String getType() {
        return "V8,S63 Engine";
    }
}
