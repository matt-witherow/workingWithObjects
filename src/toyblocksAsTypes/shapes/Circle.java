package toyblocksAsTypes.shapes;

import toyblocksAsTypes.Colour;

public class Circle implements Shape {

  private final Colour colour;

  public Circle(Colour c){
    this.colour = c;
  }

  @Override
  public int getSides() {
    return 1;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  @Override
  public String toString() {
    return String.format("%-6s %s",getColour(), "\u23FA️");
  }
}
