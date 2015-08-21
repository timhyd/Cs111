public class TestGeometricObject {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects
    GeometricObject geoObject1 = new Circle(5);
    GeometricObject geoObject3 = new Circle(6);
    GeometricObject geoObject2 = new Rectangle(5,3);
    GeometricObject geoObject4 = new Rectangle(1,1);
    //Part C test2
    /*
    try{ geoObject2.Rectangle(5,3);}
    catch(IllegalRectangleException errorMessage){
      geoObject2.Rectangle();
   }
   try{
      geoObject4.Rectangle(-1,2);
   }
   catch(IllegalRectangleException errorMessage){
      geoObject4.Rectangle();
   }*/


    System.out.println("The Two Circles have the same area?" + geoObject1.equals(geoObject3));
    System.out.println("The Two Rectangles have the same area?" + geoObject2.equals(geoObject4));
    //System.out.println("The two objects have the same area? " +
      //equalArea(geoObject1, geoObject2));
   System.out.println("Which is older? the circle geoObject1 or the rect geoObject 2?");
   result = geoObject1.oldest(geoObject2);
   if (result == geoObject1){
      System.out.println("The circle is older");
   }
   else{
      System.out.println("The Rectangle is older!");
   }
    // Display circle
    displayGeometricObject(geoObject1);
    displayGeometricObject(geoObject3);

    // Display rectangle
    displayGeometricObject(geoObject2);
    displayGeometricObject(geoObject4);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1,
      GeometricObject object2) {
    return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
    System.out.println(object);
    //System.out.println();
    //System.out.println("The area is " + object.getArea());
    //System.out.println("The perimeter is " + object.getPerimeter());
  }
}
