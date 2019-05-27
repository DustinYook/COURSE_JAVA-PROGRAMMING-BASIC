package p03.javafx.fxml.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable // 주의) 인터페이스 (jre아님)
{
	@FXML private Button btn1; // SceneBuilder에서 만든 틀과 연결하는 작업
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		// setOnAction(): 버튼이 동작하기 위함
		btn1.setOnAction(new EventHandler<ActionEvent>() // 익명구현객체
		{
			@Override
			public void handle(ActionEvent event) 
			{
				handleBtn1Action(event); // 호출하는 메소드
			}
		}); 
		
		btn2.setOnAction(event -> handleBtn2Action(event)); // 람다식 표현
		btn3.setOnAction(event -> handleBtn3Action(event)); 
	}
	
	public void handleBtn1Action(ActionEvent event) // 버튼1이 눌릴 때 수행할 동작 기술
	{
		System.out.println("버튼 1이 눌렸습니다.");
	}
	
	public void handleBtn2Action(ActionEvent event) // 버튼2이 눌릴 때 수행할 동작 기술
	{
		System.out.println("버튼 2이 눌렸습니다.");
	}
	
	public void handleBtn3Action(ActionEvent event) // 버튼3이 눌릴 때 수행할 동작 기술
	{
		System.out.println("버튼 3이 눌렸습니다.");
	}
}
// root.fxml에서 정의된 내용이 동작(Action)하는 것을 기술/설정하는 것 