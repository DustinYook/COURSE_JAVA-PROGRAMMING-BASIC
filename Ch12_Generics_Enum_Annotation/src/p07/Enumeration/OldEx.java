package p07.Enumeration;

public class OldEx 
{
	public static void main(String[] args) 
	{
		ClothingInfo2 c = new ClothingInfo2("3233", "Short Sleeves", "Cotton 100%", ClothingInfo2.SUMMER);
		System.out.println("��ǰ�ڵ�: " + c.code);
		System.out.println("��������: " + c.season); // ���ڰ� ����
	}
}