package toyblocksAsTypes;

import toyblocksAsTypes.shapes.Shape;
import toyblocksAsTypes.shapes.Triangle;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /**
     *   Hello Friends! Welcome.
     *   Let's work with meaningful Types and not 'sandy' Strings!
     *
     *   This workshop is very similiar to last week's Block File Reader example!
     *   Compare them together later if it helps.
     */

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run(){
            BlockFileReader reader = new BlockFileReader("resources/fixture-blocks.csv");
            List<Shape> orders = reader.read();

      /**
       *  This time, say im a Painter who only cares about orders for BLUE shapes.
       *  If you try to implement this feature in your previous workshop, you may find it difficult.
       *  You have to constantly crack open the String to see what's inside. Are you "blue"?
       *
       */

      List<Shape> blueOrders = orders.stream()
        .filter(shape -> shape.getColour() == Colour.BLUE)
        .collect(Collectors.toList());

      System.out.println("\nHere are all your Blue Orders boss!");
      for(Shape shape : blueOrders){
        System.out.println(shape);
      }

      List<Triangle> triangleOrders = orders.stream()
              .filter(shape -> shape.getSides() == 3 )
              .map(shape -> (Triangle)shape)                   // Lets talk about "Down Casting"
              .collect(Collectors.toList());


      System.out.println("\nHere are all your Triangle Orders boss!");
      for(Shape shape : triangleOrders){                       // wait, but how?
        System.out.println(shape);
      }
    }
}
