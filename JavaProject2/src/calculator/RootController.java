package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class RootController implements Initializable 
{
	int num;
	int operand1, operand2;
	int result;
	int count = 0;
	int operator;
	
	@FXML private GridPane gridPane;
	@FXML private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, 
	                     btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		btn1.setOnAction(event -> handleBtn1Action(event)); 
		btn2.setOnAction(event -> handleBtn2Action(event)); 
		btn3.setOnAction(event -> handleBtn3Action(event));
		btn4.setOnAction(event -> handleBtn4Action(event)); 
		btn5.setOnAction(event -> handleBtn5Action(event));
		btn6.setOnAction(event -> handleBtn6Action(event)); 
		btn7.setOnAction(event -> handleBtn7Action(event));
		btn8.setOnAction(event -> handleBtn8Action(event)); 
		btn9.setOnAction(event -> handleBtn9Action(event));
		btn10.setOnAction(event -> handleBtn10Action(event)); 
		btn11.setOnAction(event -> handleBtn11Action(event));
		btn12.setOnAction(event -> handleBtn12Action(event)); 
		btn13.setOnAction(event -> handleBtn13Action(event)); 
		btn14.setOnAction(event -> handleBtn14Action(event)); 
		btn15.setOnAction(event -> handleBtn15Action(event)); 
	}
	
	public void handleBtn1Action(ActionEvent event) 
	{
		count++;
		System.out.print("9");
		num = 9;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn2Action(ActionEvent event)
	{
		count++;
		System.out.print("8");
		num = 8;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn3Action(ActionEvent event)
	{
		count++;
		System.out.print("7");
		num = 7;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn4Action(ActionEvent event)
	{
		count++;
		System.out.print("6");
		num = 6;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn5Action(ActionEvent event)
	{
		count++;
		System.out.print("5");
		num = 5;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn6Action(ActionEvent event)
	{
		count++;
		System.out.print("4");
		num = 4;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn7Action(ActionEvent event) 
	{
		count++;
		System.out.print("3");
		num = 3;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn8Action(ActionEvent event)
	{
		count++;
		System.out.print("2");
		num = 2;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn9Action(ActionEvent event) 
	{
		count++;
		System.out.print("1");
		num = 1;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn10Action(ActionEvent event)
	{
		System.out.print(" + ");
		operator = 1;
	}
	
	public void handleBtn11Action(ActionEvent event)
	{
		count++;
		System.out.print("0");
		num = 0;
		if(count == 1)
			operand1 = num;
		else if(count == 2)
			operand2 = num;
		else
			System.out.println("\n명령을 처리할 수 없습니다.");
	}
	
	public void handleBtn12Action(ActionEvent event)
	{
		System.out.print(" - ");
		operator = 2;
	}
	
	public void handleBtn13Action(ActionEvent event)
	{
		System.out.print(" x ");
		operator = 3;
	}
	
	public void handleBtn14Action(ActionEvent event) 
	{
		System.out.print(" = ");
		switch(operator)
		{
		case 1: result = operand1 + operand2;
				break;
		case 2: result = operand1 - operand2;
				break;
		case 3: result = operand1 * operand2;
				break;
		case 4: result = operand1 / operand2;
				break;
		}
		System.out.print(result+ "\n");
	}
	
	public void handleBtn15Action(ActionEvent event) 
	{
		System.out.print(" ÷ ");
		operator = 4;
	}
}
