package airport;

public class Clerk {

  private static int seatsAvailable = 50;   // what happens if we delete the static word?

  private final String name;

  public Clerk(String name) {
    this.name = name;
    System.out.println(name + " ready for work!");
  }

  public void makeBooking(Passenger p) {
    if(seatsAvailable > 0){
      seatsAvailable--;
      System.out.println(String.format("%s : Flight booked for %-8s There are %d Seats remaining.",
              name,
              p.getName(),
              seatsAvailable));
    } else {
      System.out.println(String.format("Sorry %s. The flight is full", p.getName()));
    }
  }
}
