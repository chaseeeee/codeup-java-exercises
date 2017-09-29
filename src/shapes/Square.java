package shapes;

public abstract class Square extends Quadralateral implements Measurable {

  public Square(double length, double width) {
    super(length, width);
  }

  @Override
  protected void setLength(double length) {
    this.length = length;
  }

  @Override
  protected void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double getArea() {
    return this.length * this.width;
  }

  @Override
  public double getPerimeter()
  {
    return this.length * 2 + this.width * 2;
  }

  // End of the class body.
}



