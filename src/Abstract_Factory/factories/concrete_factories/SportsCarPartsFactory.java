package Abstract_Factory.factories.concrete_factories;

import Abstract_Factory.factories.CarPartsFactory;
import Abstract_Factory.products.Engine;
import Abstract_Factory.products.Seat;
import Abstract_Factory.products.Tire;
import Abstract_Factory.products.concrete_products.SportsEngine;
import Abstract_Factory.products.concrete_products.SportsSeat;
import Abstract_Factory.products.concrete_products.SportsTire;

//Concrete Factory
public class SportsCarPartsFactory implements CarPartsFactory {
    @Override
    public Engine createEngine() {
        return new SportsEngine();
    }

    @Override
    public Tire createTire() {
        return new SportsTire();
    }

    @Override
    public Seat createSeat() {
        return new SportsSeat();
    }
}
