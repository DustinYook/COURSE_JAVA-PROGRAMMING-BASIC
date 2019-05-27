// ���α׷� ����: �⺻�ڷ����� char(������)�� ���� ��¿���
package p42.primitive_type;

public class CharToCode 
{
	public static void main(String[] args) 
	{
		char ch = 'A'; // char ch = 65; (A�� ASCII �ڵ尪�� 65)
		int code = (int)ch; // ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� ����
		System.out.printf("%c = %d (%#X)\n", ch, code, code); // #�� ���λ� ���, %x�� 16�������� ǥ�� 
	
		char hch = '��'; // char hch = 0xAC00; (���� ASCII �ڵ尪�� 16������ 0xAC00)
		System.out.printf("%c = %d (%#X)\n", hch, (int)hch, (int)hch);
	}
}