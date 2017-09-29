package shapes;

public class Rectangle extends Quadralateral implements Measurable {

  public Rectangle(double length, double width) {
    super(length, width);
  }

  @Override
  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double getPerimeter() {
    return 2 * this.length + 2 * this.width;
  }

  @Override
  public double getArea() {
    return this.length * this.width;
  }
}

/*
  Change your existing Rectangle class to inherit from Quadralateral and implement Measurable.

        Intellij can automatically create the skeleton of all the methods that need to be implemented.
        */
