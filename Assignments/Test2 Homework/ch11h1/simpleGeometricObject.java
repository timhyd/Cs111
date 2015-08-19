public class simpleGeometricObject {
   Double side1;
   Double side2;
   Double side3;
   String color = "white";
   boolean filled;
   java.util.Date dateCreated;

   /** Construct a default geometric object */
   public simpleGeometricObject myTriangleBuilder(){
      dateCreated = new java.util.Date();
      this.side1 = 1.0;
      this.side2 = 1.0;
      this.side3 = 1.0;
      return this;
   }// End default myTriangleBuilder

   public simpleGeometricObject myTriangleBuilder(Double newSide1,Double newSide2, Double newSide3, String color, boolean filled){
      dateCreated = new java.util.Date();
      this.side1 = newSide1;
      this.side2 = newSide2;
      this.side3 = newSide3;
      this.filled = filled;
      this.color = color;
      return this;
   }//End myTriangleBuilder Method

   public Double getPerimeter(){
      Double perimeter;
      perimeter = this.side1 + this.side2 + this.side3;
      return perimeter;
   }// end getPerimeter

   public Double getArea(){
      Double area;
      Double p = ( (this.side1 + this.side2 + this.side3) / 2 );
      area = Math.pow( ( p * ( p-this.side1) ) , 0.5 );
      return area;
   }// end getArea

   public simpleGeometricObject() {
      dateCreated  = new java.util.Date();

   }
   //Construc a geometric object with the specified color and filled value
   public simpleGeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
   }

   //Return color
   public String getColor(){
      return color;
   }

   //Set a new color
   public void setColor(String color){
      this.color = color;
   }
   //return filled. Since filled is bolean. its getter method is named isFilled
   public boolean isFilled(){
      return filled;
   }

   //Set new filled
   public void setFilled(boolean filled){
      this.filled = filled;
   }

   //get the date created
   public java.util.Date getDate() {
      return dateCreated;
   }

   //Return string representation of this object
   public String toString() {
      return "created on " + dateCreated + "\ncolr: " + color + " and filled: " + filled;
   }
}
