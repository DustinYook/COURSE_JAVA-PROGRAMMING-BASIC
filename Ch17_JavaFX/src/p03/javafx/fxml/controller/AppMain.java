package p03.javafx.fxml.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception 
	{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene s = new Scene(root);
		arg0.setTitle("FXML Controller");
		arg0.setScene(s);
		arg0.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}