package p03.array.ex;

public class ArraySum 
{
	int a; // Ŭ���� �ȿ� �ִ� ����: �������� (field) => �ʱ�ȭ�� ���־ �ǰ� ���ص� �� (�ʱ�ȭ ���� �� 0�� ��)
	public static void main(String[] args) 
	{
		int scores[] = null; 
		scores = new int[]{83, 90, 97, 99}; // �����迭����
		
		int scores2[] = new int[3]; // ��ü���� 
		scores2[0] = 83;
		scores2[1] = 90;
		scores2[2] = 97;
		//System.out.println("scores1[0]: " + scores1[0]);
		
		// 1) �հ踦 ���ϴ� ó��
		int sum = 0; // ��������: �޼ҵ� �ȿ� �ִ� ����, Ư�� ��� �ȿ� ����ִ� ����  => �ݵ�� �ʱ�ȭ�ؾ� ��
		for(int i = 0; i<scores.length; i++)
		{
			// int sum += scores[i];�� �� ������ ���� ���� => ���������� �ݵ�� �ʱⰪ�� �־�� �� 
			// �ȿ��� ������ �ϸ� �������� �߻�
			sum += scores[i];
		}System.out.println("�հ�: " + sum + "��");
		
		// 2) ����� ���ϴ� ó��
		double avg1 = sum/scores.length; // ��������: sum�� scores.length�� intŸ���̹Ƿ� �� ����� intŸ���� ��
		// �� ���� double�� ������ �� ��ȯ�� ���� double�� ����� ���� �Ҽ��� ���� �ڸ��� �߷� �׻� .0�� ������ �Ǵ� �������� ����
		System.out.println("���: " + avg1 + "��");
		
		// �ذ�� #1
		double avg2 = sum/4.; 
		System.out.println("���: " + avg2 + "��");
		// �ذ�� #2
		double average = (double)sum/(double)scores.length;
		System.out.println("���: " + average + "��");
	}
}