package toyblocksAsTypes;

/**
 *  Lets not spend too much time here on the day.
 *  Keep it as reference material.
 *  Enums are just for working with 'ordinal values'.
 *      ie: values that mean something based on their relative order or sequence.
 *      You can get creative - I've represented a Compass (NESW) as an Enum before.
 *      You could absolutely convince me Colours is a _poor use_ of an enum.
 */

public enum Colour {
  RED("red"),
  BLUE("blue"),
  YELLOW("yellow");


  private final String token;

  Colour(String s){
    this.token = s;
  }

  public String getToken(){
    return token;
  }

  @Override
  public String toString() {
    return this.getToken();
  }

  public static Colour fromString(String s) {
    for(Colour v : values())
      if(v.getToken().equalsIgnoreCase(s)) return v;
    throw new IllegalArgumentException();
  }
}
