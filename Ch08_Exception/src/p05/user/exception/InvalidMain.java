package p05.user.exception;

public class InvalidMain 
{
	public static void main(String[] args) // main �޼ҵ� => �޼ҵ� �ȿ� ����� ������ ���������̰� �ݵ�� �ʱ�ȭ �ؾ� ��
	{
		try // ���ܰ� �߻��� ������ �ִ� ����
		{
			int result = subtract(5,10); // 3�ܰ�
			System.out.println(result); // �� ���忡�� ���ܰ� �߻��߱� ������ �������� ����
		} 
		catch (InvalidInputException e)
		{
			System.out.println(e.getMessage()); 
		}
	}
	
	// �ڵ� �ۼ��� �������� �ͺ��� �ۼ��� �ؾ� �ڵ��ϼ� ����� �̿��� �� ����
	static int subtract(int a, int b) throws InvalidInputException // �޼ҵ� (2�ܰ�)
	{
		if(a<b) // ���ܸ� �����Ͽ� ����� ���� ��!
			throw new InvalidInputException("����"); // ���ܸ� �߻���Ű��� ��ɾ�
		// ���ܸ� ���Ƿ� �߻���Ŵ => �ڽ��� ���� �޼ҵ�� ���� => ȣ���� �κ����� ���� (1�ܰ�)
		return a-b;
	}
}