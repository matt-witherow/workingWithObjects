package airport;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     *   static keyword.
     *      Static fields.
     *      Static Methods.
     *      Be very careful! Why is use of static often :(
     *
     */

    public static void main(String[] args) {

        List<Passenger> peeps = Arrays.asList(
                new Passenger("Fiona"),
                new Passenger("Bianca"),
                new Passenger("Emily"),
                new Passenger("Anton"),
                new Passenger("Iris"),
                new Passenger("Renae"),
                new Passenger("Vanessa"));

        ArrayDeque<Passenger> queue = new ArrayDeque<Passenger>(peeps);

        Clerk tom   = new Clerk("Tom");

        // Leave this commented for now.
        // Clerk susan = new Clerk("Bec");
        // susan.makeBooking(queue.removeFirst());

        for(Passenger p : queue){
            Passenger next = queue.removeFirst();
            tom.makeBooking(next);
        }
    }
}
