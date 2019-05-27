package calculator;

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
		Parent root1 = FXMLLoader.load(getClass().getResource("root1.fxml"));
		Scene s = new Scene(root1);
		arg0.setTitle("Calculator");
		arg0.setScene(s);
		arg0.show();
		System.out.println("        <��Ģ���� ���� _by������>      ");
		System.out.println("=====================================");
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}