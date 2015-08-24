import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class ch14h11 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the circle
    Pane pane = new Pane();

    // Create a circle and set its properties
    Circle head = new Circle();
    //Ellipse eye1 = new Ellipse();
   // Ellipse eye2 = new Ellipse();
    Circle pupil1 = new Circle();
    Circle pupil2 = new Circle();
    //Arc mouth = new Arc();

    head.centerXProperty().bind(pane.widthProperty().divide(2));

    head.centerYProperty().bind(pane.heightProperty().divide(2));

    //Establish head
    head.setRadius(100);
    head.setStroke(Color.BLACK);
    head.setFill(Color.WHITE);
    pane.getChildren().add(head); // Add circle to the pane

    //Create and add eyes without pupils
    Ellipse eye1 = new Ellipse(0,0,17,14);
    eye1.setStroke(Color.BLACK);
    eye1.setFill(Color.WHITE);

    eye1.centerXProperty().bind(head.centerXProperty().subtract(35));
    eye1.centerYProperty().bind(head.centerYProperty().subtract(25));
    pane.getChildren().add(eye1);

    Ellipse eye2 = new Ellipse(0, 0, 17, 14);
    eye2.setStroke(Color.BLACK);
    eye2.setFill(Color.WHITE);

    eye2.centerXProperty().bind(head.centerXProperty().add(35));
    eye2.centerYProperty().bind(head.centerYProperty().subtract(25));
    pane.getChildren().add(eye2);

    pupil1.setRadius(8);
    pupil1.setStroke(Color.BLACK);
    pupil1.setFill(Color.BLACK);

    pupil1.centerXProperty().bind(head.centerXProperty().add(35));
    pupil1.centerYProperty().bind(head.centerYProperty().subtract(25));
    pane.getChildren().add(pupil1);

    pupil2.setRadius(8);
    pupil2.setStroke(Color.BLACK);
    pupil2.setFill(Color.BLACK);

    pupil2.centerXProperty().bind(head.centerXProperty().subtract(35));
    pupil2.centerYProperty().bind(head.centerYProperty().subtract(25));
    pane.getChildren().add(pupil2);

    Arc mouth1 = new Arc(0, 0, 50, 20, 0, -180);
    mouth1.centerXProperty().bind(head.centerXProperty());
    mouth1.centerYProperty().bind(head.centerYProperty().add(35));
    mouth1.setStroke(Color.BLACK);
    mouth1.setType(ArcType.OPEN);
    mouth1.setFill(Color.WHITE);
    pane.getChildren().add(mouth1);

    Polygon nose1 = new Polygon();
    nose1.setFill(Color.WHITE);
    nose1.setStroke(Color.BLACK);

    nose1.getPoints().addAll(new Double[]{
    20.0, 10.0,
    10.0, 30.0,
    30.0, 30.0});


    pane.getChildren().add(nose1);


    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
}
