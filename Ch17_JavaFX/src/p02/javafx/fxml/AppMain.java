package p02.javafx.fxml;

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
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); // ���ϸ� �ۼ�
		Scene s = new Scene(root); // Ȱ��â�� ����
		arg0.setTitle("JavaFX FXML");
		arg0.setScene(s);
		arg0.show();
		arg0.setResizable(false); // â ũ�� ���� �Ұ����ϵ��� ����
	}

	public static void main(String[] args) 
	{
		launch(args); 
	}
}