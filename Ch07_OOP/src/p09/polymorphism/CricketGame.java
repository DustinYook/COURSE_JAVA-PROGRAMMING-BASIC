package p09.polymorphism;

public class CricketGame extends Game // Game���κ��� ��ӹ޴� Ŭ����
{
	// �Ϲ� �޼ҵ忴�� ������ ������ ���� ����
	@Override // �θ� ���� �Ϲݸ޼ҵ带 ���������� �������ؼ� �� �� ���� (��, �߻� �޼ҵ��� ��� ������ �ʼ�)
	public void type() 
	{
		System.out.println("������ ������ type()");
	}
	
	public void write()
	{
		System.out.println("CricketGame.write()");
	}
	
	public void over() // ������ �� ��� �θ��� ������ �Ǳ� �� �޼ҵ带 ����ϴ� ��� (������ ȣ����)
	{
		super.type();
	}
}