/*Modified ShowPolygon.java
Trayce Martineau
MON Dec 2, 2019*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class Exercise14_15 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		
		//STOP text
		Text stop = new Text(200 / 1.5, 200 + 20, "STOP");
		stop.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
		stop.setFill(Color.WHITE);
		
		pane.getChildren().add(new MyPolygon());
		pane.getChildren().add(stop);
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Show stop sign"); // Set the stage title
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

class MyPolygon extends Pane {
	private void paint() {
		
		// Create a polygon
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.WHITE);
		
		ObservableList<Double> list = polygon.getPoints();
		
		//Rotate the Octagon to be like a stop sign
		polygon.setRotate(22.5);
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;
		
		
		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}    
		getChildren().add(polygon);
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}
