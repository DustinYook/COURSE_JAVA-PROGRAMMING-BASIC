package p01.object_tostring;

public class ToStringEx2 
{
	public static void main(String[] args) 
	{ // toString(): ���ڿ��� ����� �� �������� ��
      // ����ڰ� Ŭ������ ���� ���, �ݵ�� �� �����ؼ� ����ؾ� �� => �׷��� ���ϴ� ����� ���
		GoodStock g = new GoodStock("1111", 100);
		System.out.println(g); // g = g.toString() => toString�� ����
		System.out.println(g.toString()); // �ּҰ��� ��� (toString �������̵� �� �� ���)
		System.out.println("\n[�������]: " + g);
	}
}