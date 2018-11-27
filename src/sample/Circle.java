package sample;

public class Circle {

  private double radius;

  public Circle() {
    radius = 1.0;
  }
//practical changes
  public Circle(double radius) {
    setRadius(radius);
  }
//testt
  public double getRadius() {
    return radius;
  }
//hi how are you im vincent
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

}
