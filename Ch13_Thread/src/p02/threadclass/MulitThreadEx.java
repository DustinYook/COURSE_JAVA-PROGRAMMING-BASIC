package p02.threadclass;

public class MulitThreadEx 
{
	public static void main(String[] args) // main thread�� 1�� ���� 
	{
		Thread t1 = new DigitThread(); // ������: �θ��� ������ �ڽ��� �� 
		Thread t2 = new DigitThread(); 
		Thread t3 = new AlphabetThread(); 
		
		// main thread 1�� + �۾� thread 3�� (�� 4���� thread ����)
		t1.start(); // �θ� Ŭ�����κ��� ��ӹ��� �޼ҵ�
		t2.start();
		t3.start();
		// ����) ���������� ����Ǵ� ���� �ƴ϶� ���ÿ� ���� (mulit_tread�� ����) => ���α׷� ��Ȳ�� ���� ��������� �޶��� �� ����
		// ���� �帧�� ���õ����� �Ѵٴ� ���� �߿�!
	}
}