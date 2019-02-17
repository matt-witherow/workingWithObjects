package mechanics.fleet;

import mechanics.garage.Vehicle;

public class Car implements Vehicle {

  private static final double FUEL_CONSUMPTION_RATE = 0.4;
  private static final double WEAR_AND_TEAR_RATE = 0.2;
  private static final double REPAIR_COST = 10.00;

  private final double _maxHealth;
  private double _health;

  public Car(double maxHealth){
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
    return cost;                                  // PLUS A RUBBER TAX?
  }

  private double costOfTravel(double distance) {
    return FUEL_CONSUMPTION_RATE * distance;
  }

  private double wearAndTear(double distance) {
    double wear = WEAR_AND_TEAR_RATE * distance;
    return Math.abs(_health - wear);
  }
}