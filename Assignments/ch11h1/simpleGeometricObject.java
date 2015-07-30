public class simpleGeometricObject {
   private String color = "white";
   private boolean filled;
   private java.util.Date dateCreated;

   /** Construct a default geometric object */
   public simpleGeometricObject myTriangleBuilder(){
      dateCreated = new java.util.Date();
      this.side1 = 1;
      this.side2 = 1;
      this.side3 = 1;
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
      Double p;
      p = ((this.side1 + this.side2 + this.side3) / 2);
      area = math.pow((p(p-this.side1)) , 0.5 );
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
   public java.util.Date getDateCreated() {
      return dateCreated;
   }

   //Return string representation of this object
   public String toString() {
      return "created on " + dateCreated + "\ncolr: " + color + " and filled: " + filled;
   }
}

// my work from before I noticed the adjusted assignment peramaters

/*


 Double side1;
Double side2;
Double side3;

   public myTriangleBuilder myTriangleBuilder(){
      this.side1 = 1;
      this.side2 = 1;
      this.side3 = 1;
      return this;
   }// End default myTriangleBuilder

   public myTriangleBuilder myTriangleBuilder(Double newSide1,Double newSide2, Double newSide3){
      this.side1 = newSide1;
      this.side2 = newSide2;
      this.side3 = newSide3;
      return this;
   }//End myTriangleBuilder Method

   public Double getPerimeter(){
      Double perimeter;
      perimeter = this.side1 + this.side2 + this.side3;
      return perimeter;
   }// end getPerimeter

   public Double getArea(){
      Double area;
      Double p;
      p = ((this.side1 + this.side2 + this.side3) / 2);
      area = math.pow((p(p-this.side1)) , )
   }// end getArea

   public String toString(){
      String side1String = Double.toString(this.side1);
      String side2String = Double.toString(this.side2);
      String side3String = Double.toString(this.side3);
      String result = "Triange: side1 = " + side1String + " side2 = " + side2String +" side3 = "  + side3String;
      return result;

   }// End toString
}//End myTriangleBuilder
*/
