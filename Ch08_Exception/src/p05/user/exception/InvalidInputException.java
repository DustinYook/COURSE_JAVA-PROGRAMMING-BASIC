package p05.user.exception;

public class InvalidInputException extends Exception // �����ڰ� ���� Exception�� ��ӹ��� 
{
//	public InvalidInputException() // �⺻ ������ 
//	{
//		super("�߸��� ����Դϴ�."); // �θ�Ŭ������ ������ ȣ���ؼ� �ʱⰪ ���� // �θ� Ŭ������ �⺻ �����ڿ� �� ������ ����
//	}

	public InvalidInputException(String string) 
	{
		super(string);
	}
}