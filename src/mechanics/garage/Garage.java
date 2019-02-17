package mechanics.garage;

import java.util.List;

public class Garage {

  private final List<Vehicle> _vehicles;

  public Garage(List<Vehicle> vehicles){
    this._vehicles = vehicles;
  }

  public void store(Vehicle v){
    _vehicles.add(v);
  }

  public double repairAll(){
    double totalCost = 0;
    for(Vehicle v : _vehicles){
      totalCost += v.repair();
    }
    return totalCost;
  }
}