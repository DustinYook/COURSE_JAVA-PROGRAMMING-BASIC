package p02.string.stringbuffer.stringbuilder;

public class StringEx2 
{
	public static void main(String[] args) 
	{
		// 1. equals() ���: ��ü�� ���ڿ� ���� �� ���
		String str1 = "Spring"; // ���� ���� �������
		String str2 = "Spring"; 
		if(str1.equals(str2)) // str1�� str2�� �ּҰ� ��
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		// ������ ���� ��ü�����ؼ� ��
		String str3 = new String("Spring"); // �� ������ ������ ������� (���� ��ġ�� �������)
		String str4 = new String("Spring");
		if(str3.equals(str4)) 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		// 2. �񱳿�����(==) ���
		String str5 = "Spring";
		String str6 = "Spring";
		if(str5 == str6) 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		String str7 = new String("Spring");
		String str8 = new String("Spring");
		if(str7 == str8) // ���ڿ� ��ü���� ��� �ݵ�� �񱳿����� ��� equals()�� ����� 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
	}
}
// String(): ������