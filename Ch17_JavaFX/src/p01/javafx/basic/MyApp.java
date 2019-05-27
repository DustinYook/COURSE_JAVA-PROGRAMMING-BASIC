package p01.javafx.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyApp extends Application 
{
	@Override // Stage: "윈도우 창"과 같은 의미 => Title + Scene 
	public void start(Stage arg0) throws Exception  // Stage만 빼고 모든 클래스는 객체를 생성해서 사용해야 함
	{
		// 주의) 항상 javafx를 찾아야 함
		Circle c = new Circle(40,40,30); // (원의 x좌표,원의 y좌표,반지름의 길이)
		Group root = new Group(c); // 그룹에 Circle을 넣음
		Scene s = new Scene(root,300,200); // 가로가 300, 세로가 200
		arg0.setTitle("JavaFX...."); // 창의 이름표시줄에 표현할 내용 설정
		arg0.setScene(s); // Scene을 보이게 하라
		arg0.show(); // Stage내용을 화면에 보이게 해라
	}

	public static void main(String[] args) 
	{
		launch(args); // start를 찾아서 감 => 시작점
	}
}