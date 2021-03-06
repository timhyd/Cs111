import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.applet.Applet;

public class ch15h3 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
      //BorderPane pane = new BorderPane();
      BorderPane pane = new BorderPane();
      HBox buttonPane = new HBox();
      buttonPane.setAlignment(Pos.CENTER);

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
           public void handle (ActionEvent event){
               pacMan.setCenterX(pacMan.getCenterX() - 10);

               if(pacMan.getCenterX()<0){
                  pacMan.setCenterX(pacMan.getCenterX() + 10);
               }
               pane.getChildren().removeAll(pacMan);
               pane.getChildren().addAll(pacMan);
           }
      });
    Button btRight = new Button("Right");
    btRight.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterX(pacMan.getCenterX() + 10);

               if(pacMan.getCenterX()>pane.getWidth()){
                  pacMan.setCenterX(pacMan.getCenterX() - 10);
               }
               pane.getChildren().removeAll(pacMan);
               pane.getChildren().addAll(pacMan);
           }
      });

    Button btUp = new Button("Up");
    btUp.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterY(pacMan.getCenterY() - 7);

               if(pacMan.getCenterY()<0){
                  pacMan.setCenterY(pacMan.getCenterY() + 7);
               }
               pane.getChildren().removeAll(pacMan);
               pane.getChildren().addAll(pacMan);
           }
      });
    Button btDown = new Button("Down");
    btDown.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               pacMan.setCenterY(pacMan.getCenterY() + 7);

               if(pacMan.getCenterY()>(pane.getHeight() - (60))){
                  pacMan.setCenterY(pacMan.getCenterY() - 7);
               }
               pane.getChildren().removeAll(pacMan);
               pane.getChildren().addAll(pacMan);
           }
      });
   buttonPane.getChildren().addAll(btLeft, btRight, btUp, btDown);
   pane.setBottom(buttonPane);
   /*
   btLeft.setAlignment(Pos.CENTER);
   btRight.setAlignment(Pos.CENTER);
   btUp.setAlignment(Pos.CENTER);
   btDown.setAlignment(Pos.CENTER);
*/
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
