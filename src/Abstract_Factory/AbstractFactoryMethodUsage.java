package Abstract_Factory;

import Abstract_Factory.factories.CarPartsFactory;
import Abstract_Factory.factories.concrete_factories.LuxuryCarPartsFactory;
import Abstract_Factory.factories.concrete_factories.SportsCarPartsFactory;
import Abstract_Factory.products.Engine;
import Abstract_Factory.products.Seat;
import Abstract_Factory.products.Tire;

//Client Usage
public class AbstractFactoryMethodUsage {
    public static void main(String[] args) {
       startAbstractFactoryMethodUsage();
    }

    public static void startAbstractFactoryMethodUsage() {
        // Client choose factory
        //CarPartsFactory factory = new LuxuryCarPartsFactory();
        CarPartsFactory factory = new SportsCarPartsFactory();

        Engine engine = factory.createEngine();
        Tire tire = factory.createTire();
        Seat seat = factory.createSeat();

        System.out.println("Engine: " + engine.getType());
        System.out.println("Tire: " + tire.getTire());
        System.out.println("Seat: " + seat.getSeatName());
    }
}
