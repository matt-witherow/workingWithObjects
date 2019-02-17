package pettingzoo;

public class Bird extends Animal {

  private final String name;

  public Bird(String name) {
    super();
    this.name = name;
  }

  @Override
  String speak() {
    return "Tweet Tweet";
  }
}
