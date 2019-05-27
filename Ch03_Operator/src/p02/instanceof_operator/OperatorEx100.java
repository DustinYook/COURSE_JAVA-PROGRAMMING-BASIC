package p02.instanceof_operator;

public class OperatorEx100 
{
	public static void main(String[] args) 
	{
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b); // ��AND����(����): �ӵ��� ���� => ���� ���� false�̸� ���� ���� skip�ϰ� false����� ��ȯ
		System.out.println(a||b); // ��OR����(����): �ӵ��� ���� => ���� ���� true�̸� ���� ���� skip�ϰ� true����� ��ȯ
		System.out.println("!a: " + !a + ", !b: " + !b + "\n"); // ��NOT����(������)
		
		System.out.println(a&b); // ��ƮAND����: �ӵ��� ���� => ��� ��Ʈ�ڸ����� ���ؼ� ��� ���ϱ� ����
		System.out.println(a|b); // ��ƮOR����: �ӵ��� ���� => ��� ��Ʈ�ڸ����� ���ؼ� ��� ���ϱ� ����
		System.out.println();
		
		// ���ǻ��׿����ڸ� �̿��� �ִ��� ��ȯ�ϴ� �˰��� ����
		// ���ǻ��׿�����: �ǿ����ڰ� 3�� ���� => (���ǽ�) ? ���϶� ��ȯ�� : �����϶� ��ȯ��;
		int a1 = 12, b1 = 4, c1 = 19; 
		int max = (a1 > b1) ? a1 : b1; // max = 12
		max = (max > c1) ? max : c1; // max = 19
		System.out.printf("�ִ���  %d�Դϴ�.", max);
		// ������ �غ���: �ּڰ� ���ϴ� �˰��� ����
	}
}