// ���α׷� ����: �����迭�� �����迭�� ����
package p01.basic_array;
public class ArrayEx03 
{
	public static void main(String[] args) 
	{
		String names1[] = new String[3]; // �����迭: 3���� ������ ĭ
		for(int i = 0; i < names1.length; i++) // �������� for�� => ���ǽĿ� length ���� ���� ����
		{
			names1[i] = "���İ�";
			System.out.println(names1[i]);
		} System.out.println();
		
		String names2[] = new String[] {"ȫ�浿", "���İ�", "��Ÿ��", "�̼���"}; // �����迭
		for(String str : names2) // ���� for��: �迭���� Ư�� ���� �̿�!
			System.out.println(str);
	}
}