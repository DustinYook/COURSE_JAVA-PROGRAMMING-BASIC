// ���α׷� ����: �������ڿ� ���� �⺻���� ����
package p04.binary.homework;

public class OperatorEx24 
{
	public static void main(String[] args) 
	{
		int x = 0; // ���� �ʱ�ȭ
		char ch = ' '; // ���� �ʱ�ȭ
		boolean decide = false; // ���� ���� ����
		
		x = 15;
		decide = (10 < x) && (x < 20); // 10 �ʰ� 20�̸����� �Ǵ�
		System.out.printf("x = %2d, (10 < x) && (x < 20) = %b\n", x, decide);
		
		x = 6;
		decide = (x%2==0)||(x%3==0)&&(x%6!=0); // x�� 2�� ��� �Ǵ� 3�� ����̸鼭 6�� ����� �ƴ��� �Ǵ�
		System.out.printf("x = %2d, (x%%2==0) || (x%%3==0) && (x%%6!=0) = %b\n", x, decide);
		decide = (x%2==0||x%3==0)&&(x%6!=0);
		System.out.printf("x = %2d, (x%%2==0 || x%%3==0) && (x%%6!=0) = %b\n", x, decide);
		
		ch = '1';
		decide = ('0'<=ch)&&(ch<='9');  // '1'�� ASCII�ڵ尪�� '0'�� '9'���̿� �ִ��� �Ǵ�
		System.out.printf("ch = '%c', ('0'<=ch) && (ch<='9') = %b\n", ch, decide);
		
		ch = 'a';
		decide = ('a'<=ch)&&(ch<='z'); // 'a'�� ASCII�ڵ尪�� 'a'�� 'z'���̿� �ִ��� �Ǵ�
		System.out.printf("ch = '%c', ('a'<=ch) && (ch<='z') = %b\n", ch, decide);
		
		ch = 'A';
		decide = ('A'<=ch)&&(ch<='Z'); // 'A'�� ASCII�ڵ尪�� 'A'�� 'Z'���̿� �ִ��� �Ǵ�
		System.out.printf("ch = '%c', ('A'<=ch) && (ch<='Z') = %b\n", ch, decide);
		
		ch = 'q';
		decide = (ch=='q')||(ch=='Q'); // ch�� ���尪�� 'q' �Ǵ�  'Q'�� ������ �Ǵ�
		System.out.printf("ch = '%c', (ch=='q') || (ch=='Q') = %b\n", ch, decide);
	}
}