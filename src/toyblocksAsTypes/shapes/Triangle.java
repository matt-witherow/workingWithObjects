package toyblocksAsTypes.shapes;

import toyblocksAsTypes.Colour;

public class Triangle implements Shape {

  private final Colour colour;

  // delete contents - lets do together. Compiler Magic!
  public Triangle(Colour c){
    this.colour = c;
  }

  @Override
  public int getSides() {
    return 3;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  @Override
  public String toString() {
    return String.format("%-6s %s",getColour(), "\uD83D\uDD3C️️");
  }
}
