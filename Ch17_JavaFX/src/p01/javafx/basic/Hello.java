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
		///////////////////��ư�� ���� ����////////////////////
		Button btn = new Button();
		btn.setText("��ư"); // ��ư ���� ����
		// setOnAction(): ��ư�� �������� �� ������ ���뿡 ���� ���
		btn.setOnAction(new EventHandler<ActionEvent>() // ��ư ���� �� (event) ������ ���� => �͸��� ��ü ����
		{ // ��ư�� �������� ������ ���� ���
			@Override 
			public void handle(ActionEvent event)
			{
				System.out.println("��ư�� ���Ƚ��ϴ�."); // �ܼ�â�� ������ ��
			}
		}); 
		/////////////////////////////////////////////////
		
		StackPane root = new StackPane(); // StackPane: ��Ʈ��(��ư)�� ���ļ� ��ġ�ϴ� ���̾ƿ�
		root.getChildren().add(btn); // StackPane�� �ڽİݿ� �ش�Ǵ� ��ư�� �߰���
		Scene s = new Scene(root, 300, 250); // Scence�� ���� 300, ���� 250���� ����
		st.setScene(s); // Scene�� Stage���� �ø�
		st.show(); // �ش� ����� ������
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}