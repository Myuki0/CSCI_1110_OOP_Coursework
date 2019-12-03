import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.util.Random;
import javafx.scene.layout.Pane;

public class Exercise14_28 extends Application{
	@Override
	public void start(Stage primaryStage){
		//random minute out of 0 or 30
		int a = 0;
		int b = 30;
		int minute = new Random().nextBoolean() ? a : b;
		//create clock with randomized hour and minute
		ClockPane clock = new ClockPane((0 + (int)(Math.random() * 11)), minute, 30);
		//make the second hand invisible
		clock.setSecondHandVisible(false);
		//put the clock in the borderpane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		
		//set the scene
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Show clock");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}