package p01.javafx.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyApp extends Application 
{
	@Override // Stage: "������ â"�� ���� �ǹ� => Title + Scene 
	public void start(Stage arg0) throws Exception  // Stage�� ���� ��� Ŭ������ ��ü�� �����ؼ� ����ؾ� ��
	{
		// ����) �׻� javafx�� ã�ƾ� ��
		Circle c = new Circle(40,40,30); // (���� x��ǥ,���� y��ǥ,�������� ����)
		Group root = new Group(c); // �׷쿡 Circle�� ����
		Scene s = new Scene(root,300,200); // ���ΰ� 300, ���ΰ� 200
		arg0.setTitle("JavaFX...."); // â�� �̸�ǥ���ٿ� ǥ���� ���� ����
		arg0.setScene(s); // Scene�� ���̰� �϶�
		arg0.show(); // Stage������ ȭ�鿡 ���̰� �ض�
	}

	public static void main(String[] args) 
	{
		launch(args); // start�� ã�Ƽ� �� => ������
	}
}