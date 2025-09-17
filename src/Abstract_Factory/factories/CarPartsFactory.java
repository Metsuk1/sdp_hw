package Abstract_Factory.factories;

import Abstract_Factory.products.Engine;
import Abstract_Factory.products.Seat;
import Abstract_Factory.products.Tire;

//Abstract Factory
public interface CarPartsFactory {
    Engine createEngine();
    Tire createTire();
    Seat createSeat();
}
