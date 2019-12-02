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
		//create random values for the hands
		Random randomHour = new Random();
		randomHour.nextInt(12);
		Random randomMinute = new Random();
		randomMinute.nextInt(2);
		double m;
		if(randomMinute.nextInt() == 0){
			m = 0;
		}
		else{
			m = 30;
		}
		//create clock with randomized hour and minute
		ClockPane clock = new ClockPane(randomHour.nextInt(), m, 30);
		
		//put the clock in the borderpane
		BorderPane pane = new BorderPane();
		BorderPane.setAlignment(Pos.TOP_CENTER);
		pane.setCenter(clock);
		
		//set the scene
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Show clock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}