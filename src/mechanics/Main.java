package mechanics;

import mechanics.fleet.Boat;
import mechanics.fleet.Car;
import mechanics.fleet.Jet;
import mechanics.garage.Garage;
import mechanics.garage.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      Garage garage = new Garage(new ArrayList<Vehicle>());

      Vehicle ford   = new Car(100);
      Vehicle holden = new Car(100);
      Vehicle speedBoat = new Boat(225);
      Vehicle privateJet = new Jet(12000);

      // All different objects but i can drive all of them?
      ford.drive(25);
      holden.drive(30);
      speedBoat.drive(12);
      privateJet.drive(50);

      garage.store(ford);
      garage.store(holden);
      garage.store(speedBoat);
      garage.store(privateJet);


      double bill = garage.repairAll();

      System.out.println(String.format("The Total cost of running the fleet was $%.2f", bill));
    }
}
