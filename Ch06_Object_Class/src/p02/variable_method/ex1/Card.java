// ���α׷� ����: Card�� Ŭ���� ���Ǻ�
package p02.variable_method.ex1;

public class Card  
{
	// 1.�ν��Ͻ� ����
	String kind;
	int num;
	
	// 2.Ŭ���� ���� 
	static int width = 100;
	static int height = 250;

	// 3.get�޼ҵ�� set�޼ҵ�: �� ���� �׻� ������ �پ�ٴ�
	// �ڵ��������: source(alt + shift + s) - generate getters and setters
	public String getKind() // get �޼ҵ�: ���� �����͸� �о� �ܺη� �����ϴ� �޼ҵ�
	{
		return kind; 
	}
	public void setKind(String k) // set �޼ҵ�: �����͸� �ܺηκ��� �޾� �����ϴ� �޼ҵ�
	{
		this.kind = k; // this ������: �� �ν��Ͻ����� �ν��Ͻ� ������ �����ϵ��� ���� ��  #�߰��н�
	}
	
	public int getNum() 
	{
		return num;
	}
	public void setNum(int n) 
	{
		this.num = n; 
	}
	
	public static int getWidth() 
	{
		return width;
	}
	public static void setWidth(int width) 
	{
		Card.width = width; // Ŭ���������� this�����Ͱ� �ʿ����
	}
	
	public static int getHeight() 
	{
		return height;
	}
	public static void setHeight(int height) 
	{
		Card.height = height;
	}
}