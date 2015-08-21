import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ch14h11 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the circle
    Pane pane = new Pane();

    // Create a circle and set its properties
    Circle head = new Circle();
    Circle eye1 = new Circle();
    Circle eye2 = new Circle();
    Circle pupil1 = new Circle();
    Circle pupil2 = new Circle();

    head.centerXProperty().bind(pane.widthProperty().divide(2));
    //pane.widthProperty().bind(pane.heightProperty());
    head.centerYProperty().bind(pane.heightProperty().divide(2));

    //pane.widthPropertyProperty().bind(pane.heightProperty());







    

    head.setRadius().bind(pane.widthProperty().divide(3.5));









    head.setStroke(Color.BLACK);
    head.setFill(Color.WHITE);
    pane.getChildren().add(head); // Add circle to the pane
    eye1.setRadius(5);
    eye1.setStroke(Color.BLACK);
    eye1.setFill(Color.WHITE);
    pane.getChildren().add(eye1);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
