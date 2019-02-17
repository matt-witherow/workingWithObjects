package mechanics.fleet;

import mechanics.garage.Vehicle;

public class Boat implements Vehicle {

  private static final double FUEL_CONSUMPTION_RATE = 0.6;
  private static final double WEAR_AND_TEAR_RATE = 0.8;
  private static final double REPAIR_COST = 50.00;

  private final double _maxHealth;
  private double _health;

  public Boat(double maxHealth){
    this._maxHealth = maxHealth;
    this._health = _maxHealth;
  }

  @Override
  public double drive(double distance) {
    _health = wearAndTear(distance);
    return costOfTravel(distance);
  }

  @Override
  public double repair() {
    double cost = (_maxHealth - _health) * REPAIR_COST;
    _health = _maxHealth;
    return cost;
  }

  private double costOfTravel(double distance) {
    return FUEL_CONSUMPTION_RATE * distance;
  }

  private double wearAndTear(double distance) {
    double wear = WEAR_AND_TEAR_RATE * distance;
    return Math.abs(_health - wear);
  }
}