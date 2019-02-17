package airport;

public class Passenger {

  private final String name;


  /**
   *  A method with a special purpose/name.
   *  Do you see anything odd about it's signature?
   */

  public Passenger(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
