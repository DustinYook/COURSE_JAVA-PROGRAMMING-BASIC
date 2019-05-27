package p03.javafx.fxml.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable // ����) �������̽� (jre�ƴ�)
{
	@FXML private Button btn1; // SceneBuilder���� ���� Ʋ�� �����ϴ� �۾�
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		// setOnAction(): ��ư�� �����ϱ� ����
		btn1.setOnAction(new EventHandler<ActionEvent>() // �͸�����ü
		{
			@Override
			public void handle(ActionEvent event) 
			{
				handleBtn1Action(event); // ȣ���ϴ� �޼ҵ�
			}
		}); 
		
		btn2.setOnAction(event -> handleBtn2Action(event)); // ���ٽ� ǥ��
		btn3.setOnAction(event -> handleBtn3Action(event)); 
	}
	
	public void handleBtn1Action(ActionEvent event) // ��ư1�� ���� �� ������ ���� ���
	{
		System.out.println("��ư 1�� ���Ƚ��ϴ�.");
	}
	
	public void handleBtn2Action(ActionEvent event) // ��ư2�� ���� �� ������ ���� ���
	{
		System.out.println("��ư 2�� ���Ƚ��ϴ�.");
	}
	
	public void handleBtn3Action(ActionEvent event) // ��ư3�� ���� �� ������ ���� ���
	{
		System.out.println("��ư 3�� ���Ƚ��ϴ�.");
	}
}
// root.fxml���� ���ǵ� ������ ����(Action)�ϴ� ���� ���/�����ϴ� �� 