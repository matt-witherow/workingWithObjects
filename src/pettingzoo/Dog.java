package pettingzoo;

public class Dog extends Animal {

  private final String name;

  public Dog(String name) {
    super();                      // what is 'super'? (It's _crazy_ in your previous languages js/rb.)
    this.name = name;
  }

  @Override                       // what is @Override? Can we delete it?
  String speak() {
    return "WOOF!";
  }
}
