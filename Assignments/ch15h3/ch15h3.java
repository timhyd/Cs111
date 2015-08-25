import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class ch15h3 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.BOTTOM_CENTER);
    //Create Movable Cirlce
    Circle pacMan = new Circle();
    pacMan.setCenterX(200);
    pacMan.setCenterY(100);
    pacMan.setRadius(36);
    pacMan.setFill(Color.WHITE);
    pacMan.setStroke(Color.BLACK);
    pane.getChildren().addAll(pacMan);


    Button btLeft = new Button("Left");
    btLeft.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterX(pacMan.getCenterX() - 7);
           }
      });
    Button btRight = new Button("Right");
    btRight.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterX(pacMan.getCenterX() + 7);
           }
      });

    Button btUp = new Button("Up");
    btUp.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterY(pacMan.getCenterY() - 7);
           }
      });
    Button btDown = new Button("Down");
    btDown.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterY(pacMan.getCenterY() - 7);
           }
      });
   pane.getChildren().addAll(btLeft, btRight, btUp, btDown);


    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 200);
    primaryStage.setTitle("Exercise15_03"); // Set the stage title
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
