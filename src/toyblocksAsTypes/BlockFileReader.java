package toyblocksAsTypes;

import toyblocksAsTypes.shapes.Circle;
import toyblocksAsTypes.shapes.Shape;
import toyblocksAsTypes.shapes.Square;
import toyblocksAsTypes.shapes.Triangle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlockFileReader {

  private final String _path;

  public BlockFileReader(String path) {
    _path = path;
  }

  public List<Shape> read() {

    try (Stream<String> lines = Files.lines(Paths.get(_path))) {
      return lines
              .map(this::parse)
              .collect(Collectors.toList());
    } catch (IOException e) {
        e.printStackTrace();
        return Collections.emptyList();
    }
  }

  public Shape parse(String s){

    String[] values = s.split(",");
    String type = values[0].toLowerCase();
    Colour colour = Colour.fromString(values[1]);

    switch(type){
      case "square"   : return new Square(colour);
      case "circle"   : return new Circle(colour);
      case "triangle" : return new Triangle(colour);
      default: return new Square(colour);
    }
  }
}

