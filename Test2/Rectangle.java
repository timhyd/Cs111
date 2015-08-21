public class Rectangle extends GeometricObject {
  private double width = 1;
  private double height = 1;

  public Rectangle() {
  }
//Part C test2
/*
  public Rectangle(double width, double height) throws IllegalRectangleException {
    if (width<0 || height < 0){
      throw new IllegalRectangleException("Invalid side");
   }else{
    this.width = width;
    this.height = height;
  }
  }
*/
  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Return area */
  public double getArea() {
    return width * height;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }
  //Edit for part B
  public boolean equals(Rectangle obj1){
    if (this.getArea() == obj1.getArea() && this.getHeight() == obj1.getHeight() && this.getWidth() == obj1.getWidth() && this.filled == obj1.filled && this.color == obj1.color){
      return true;
    }
    else return false;
}
}
