package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Seat;

//Concrete Product(sport)
public class SportsSeat implements Seat {
    @Override
    public String getSeatName() {
        return "Carbon Fiber Racing Seats";
    }
}
