package p04.binary.homework;

public class OperatorEx14 
{
	public static void main(String[] args) 
	{
		char c = 'a';
		for(int i = 0; i < 26; i++)
			System.out.print(c++); // a���� z������ ���ĺ� ���
		System.out.println(); 
		
		c = 'A';
		for(int i = 0; i < 26; i++)
			System.out.print((char)(c+i)); // A���� Z������ ���ĺ� ���
		System.out.println(); 
		
		c = '0'; // ���⼭ '0'�� ���ڻ�� 0���� ������������ ���ͷ� 0���� �ٸ���
		int zero = c;
		System.out.println("'0'�� ASCII�ڵ尪:" + zero); // '0'�� ASCII�ڵ尪�� 48��
		for(int i = 0; i < 10; i++)
			System.out.print(c++);
	}
}