package shapes;

public abstract class Quadralateral extends Shape {

  protected double length;
  protected double width;

  public Quadralateral(double length, double width) {

    this.length = length;
    this.width = width;

  }

  public double getLength() {
    return this.length;
  }

public abstract void setLength(double length);

  public double getWidth() {
    return this.width;
  }

  public abstract void setWidth(double width);

}
