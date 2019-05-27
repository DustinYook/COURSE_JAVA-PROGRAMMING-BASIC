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
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); // 파일명 작성
		Scene s = new Scene(root); // 활성창의 내용
		arg0.setTitle("JavaFX FXML");
		arg0.setScene(s);
		arg0.show();
		arg0.setResizable(false); // 창 크기 조정 불가능하도록 설정
	}

	public static void main(String[] args) 
	{
		launch(args); 
	}
}