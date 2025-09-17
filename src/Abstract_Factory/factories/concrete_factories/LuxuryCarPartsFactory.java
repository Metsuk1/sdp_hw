package Abstract_Factory.factories.concrete_factories;

import Abstract_Factory.factories.CarPartsFactory;
import Abstract_Factory.products.Engine;
import Abstract_Factory.products.Seat;
import Abstract_Factory.products.Tire;
import Abstract_Factory.products.concrete_products.LuxuryEngine;
import Abstract_Factory.products.concrete_products.LuxurySeat;
import Abstract_Factory.products.concrete_products.LuxuryTire;

//Concrete Factory
public class LuxuryCarPartsFactory implements CarPartsFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Tire createTire() {
        return new LuxuryTire();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }
}
