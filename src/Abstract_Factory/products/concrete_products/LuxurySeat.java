package Abstract_Factory.products.concrete_products;

import Abstract_Factory.products.Seat;

//Concrete Product(luxury)
public class LuxurySeat implements Seat {
    @Override
    public String getSeatName() {
        return "Leather Heated Seats";
    }
}
