package main;

import java.util.Vector;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Item;
import model.Transaction;
import model.User;
import model.Wishlist;
import util.Connect;

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Scene scene;
	BorderPane borderContainer;
	GridPane gridContainer;
	
	
	
	private void getUser() {
		
	}
	
	public void init() {
		borderContainer = new BorderPane();
		gridContainer = new GridPane();
	}
	
	public static void main(String []args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("FP_OOAD");
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
