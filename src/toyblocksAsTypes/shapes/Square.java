package toyblocksAsTypes.shapes;

import toyblocksAsTypes.Colour;

public class Square implements Shape {

  private final Colour colour;

  public Square(Colour c){
    this.colour = c;
  }

  @Override
  public int getSides() {
    return 4;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  @Override
  public String toString() {
    return String.format("%-6s %s",getColour(), "\u23F9️️");
  }
}
