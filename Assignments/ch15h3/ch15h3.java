import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ch15h3 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);

    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    Button btUp = new Button("Up");
    Button btDown = new Button("Down");

    LEFTHandlerClass handlerLeft = new LEFTHandlerClass();
    btLeft.setOnAction(handlerLeft);
    RIGHTHandlerClass handlerRight = new RIGHTHandlerClass();
    btRight.setOnAction(handlerRight);
    
    UPHandlerClass handlerUp = new UPHandlerClass();
    btLeft.setOnAction(handlerUp);
    DOWNHandlerClass handlerDown = new DOWNHandlerClass();
    btRight.setOnAction(handlerDown);
    pane.getChildren().addAll(btLeft, btRight, btUp, btDown);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
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
class LEFTHandlerClass implements EventHandler<ActionEvent> {
   @Override
   public void handle(ActionEvent e) {
      System.out.println("Left Buttton clicked");
   }
}
class RIGHTHandlerClass implements EventHandler<ActionEvent> {
   @Override
   public void handle(ActionEvent e) {
      System.out.println("Right Buttton clicked");
   }
}
class UPHandlerClass implements EventHandler<ActionEvent> {
   @Override
   public void handle(ActionEvent e) {
      System.out.println("Up Buttton clicked");
   }
}
class DOWNHandlerClass implements EventHandler<ActionEvent> {
   @Override
   public void handle(ActionEvent e) {
      System.out.println("Down Buttton clicked");
   }
}
/*
class OKHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked");
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}
*/
