package Factory;

import Factory.creators.Logistics;
import Factory.creators.concrete_creators.RoadLogistics;
import Factory.creators.concrete_creators.SeaLogistics;

//Client Usage
public class FactoryMethodUsage {
    public static void main(String[] args) {
       startFactoryMethodUsage();
    }

    public static  void startFactoryMethodUsage(){
        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}
