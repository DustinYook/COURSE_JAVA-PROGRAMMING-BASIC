package p07.Enumeration;

public class NewEx 
{
	public static void main(String[] args) 
	{
		ClothingInfo c = new ClothingInfo("3222", "long Sleeves", "wool 100%", Season.WINTER);
		System.out.println("��ǰ�ڵ�: " + c.code);
		System.out.println("��ǰ��: " + c.name);
		System.out.println("��ǰ����: " + c.material);
		System.out.println("��������: " + c.season); // ���ڰ� �ƴ� ���ϴ� ���� ����
	}
}