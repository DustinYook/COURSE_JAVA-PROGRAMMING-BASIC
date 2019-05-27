package p01.javafx.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application 
{
	@Override
	public void start(Stage st) throws Exception 
	{
		st.setTitle("Hello World!");
		///////////////////버튼에 대한 설계////////////////////
		Button btn = new Button();
		btn.setText("버튼"); // 버튼 위의 글자
		// setOnAction(): 버튼이 눌려졌을 때 동작할 내용에 대해 기술
		btn.setOnAction(new EventHandler<ActionEvent>() // 버튼 누를 때 (event) 실행할 내용 => 익명구현 객체 생성
		{ // 버튼이 눌려지면 수행할 내용 기술
			@Override 
			public void handle(ActionEvent event)
			{
				System.out.println("버튼이 눌렸습니다."); // 콘솔창에 나오게 함
			}
		}); 
		/////////////////////////////////////////////////
		
		StackPane root = new StackPane(); // StackPane: 컨트롤(버튼)을 겹쳐서 배치하는 레이아웃
		root.getChildren().add(btn); // StackPane에 자식격에 해당되는 버튼을 추가함
		Scene s = new Scene(root, 300, 250); // Scence의 가로 300, 세로 250으로 설정
		st.setScene(s); // Scene을 Stage위에 올림
		st.show(); // 해당 결과를 보여줌
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}