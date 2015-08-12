package geometricobject;

public abstract class GeometricObject implements Comparable {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;

protected GeometricObject(){
    dateCreated = new java.util.Date();
}

protected GeometricObject(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
}

public String getColor(){
    return color;
}

public void setColor(String color){
    this.color = color;
}

public boolean isFilled(){
    return filled;
}

public void setFilled(boolean filled){
    this.filled = filled;
}

public java.util.Date getDateCreated() {
    return dateCreated;
}

public String toString() {
    return "Created on " + dateCreated + "\ncolor: " + color +
            "and filled: " + filled;
}

public static void main(String[] args) {
    GeometricObject circle1 = new Circle(1, "Red", true);
    GeometricObject circle2 = new Circle(2, "Blue", false);
    GeometricObject maxCircle = new Circle();
    GeometricObject rect1 = new Rectangle(1, 1, "Red", true);
    GeometricObject rect2 = new Rectangle(2, 2, "Blue", false);
    GeometricObject maxRect = new Rectangle();

    maxCircle = GeometricObject.max(circle1, circle2);
    maxRect = GeometricObject.max(rect1, rect2);

    System.out.println(maxCircle.toString());
    System.out.println(maxRect.toString());

}

public static GeometricObject max (GeometricObject o1, GeometricObject o2){
    if (((Comparable)o1).compareTo(o2) > 0 )
         return o1;
    else
         return o2;
}

public interface Comparable {
        public int compareTo(GeometricObject o);
    }

public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public abstract double getArea();

}

The CIRCLE class

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
            " and the radius is " + radius);
    }

}

The Rectangle Class

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double Width, double Height){
        this.width = Width;
        this.height = Height;
    }

    public Rectangle(double Width, double Height, String Color, boolean Filled){
        this.width = Width;
        this.height = Height;
        setColor(Color);
        setFilled(Filled);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double Height){
        this.height = Height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}

So I have tried to do this separate clapackage geometricobject;

public abstract class GeometricObject implements Comparable {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;

protected GeometricObject(){
    dateCreated = new java.util.Date();
}

protected GeometricObject(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
}

public String getColor(){
    return color;
}

public void setColor(String color){
    this.color = color;
}

public boolean isFilled(){
    return filled;
}

public void setFilled(boolean filled){
    this.filled = filled;
}

public java.util.Date getDateCreated() {
    return dateCreated;
}

public String toString() {
    return "Created on " + dateCreated + "\ncolor: " + color +
            "and filled: " + filled;
}

public static void main(String[] args) {
    GeometricObject circle1 = new Circle(1, "Red", true);
    GeometricObject circle2 = new Circle(2, "Blue", false);
    GeometricObject maxCircle = new Circle();
    GeometricObject rect1 = new Rectangle(1, 1, "Red", true);
    GeometricObject rect2 = new Rectangle(2, 2, "Blue", false);
    GeometricObject maxRect = new Rectangle();

    maxCircle = GeometricObject.max(circle1, circle2);
    maxRect = GeometricObject.max(rect1, rect2);

    System.out.println(maxCircle.toString());
    System.out.println(maxRect.toString());

}

public static GeometricObject max (GeometricObject o1, GeometricObject o2){
    if (((Comparable)o1).compareTo(o2) > 0 )
         return o1;
    else
         return o2;
}

public interface Comparable {
        public int compareTo(GeometricObject o);
    }

public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public abstract double getArea();

}

The CIRCLE class

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
            " and the radius is " + radius);
    }

}

The Rectangle Class

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double Width, double Height){
        this.width = Width;
        this.height = Height;
    }

    public Rectangle(double Width, double Height, String Color, boolean Filled){
        this.width = Width;
        this.height = Height;
        setColor(Color);
        setFilled(Filled);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double Height){
        this.height = Height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
