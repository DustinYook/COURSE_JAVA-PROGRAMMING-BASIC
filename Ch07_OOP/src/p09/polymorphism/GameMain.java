package p09.polymorphism;

public class GameMain 
{
	public static void main(String[] args)
	{
		// 1.��ü����
		Game g = new Game(); // �θ� -> �θ�
		g.type(); 
//		g.write(); // �θ�Ŭ�������� ���� �ڽ�Ŭ������ �ִ� �޼ҵ��� ��� ���������ȯ�� ���־�� ��
		System.out.println();
		
		// 2.���
		CricketGame c = new CricketGame(); // �ڽ� -> �ڽ�
		c.type(); // Cricket���� �������� �޼ҵ� => �θ��� ���� �Ⱥ���
		c.over(); // �θ��� ���� ���̰� �ϴ� ��, �θ�(Game)Ŭ������ �޼ҵ�(type())�� ȣ��
		c.write();
		System.out.println();
		
		// 3.������: �θ� -> �ڽ�
		Game ga = new CricketGame(); // �θ��� ������ �ڽ��� ����Ű�� ����
		ga.type(); // ������ �� �ڽ� ���� ���� => ����: �������� ���� �켱
		((CricketGame) ga).write(); // �θ� �ڽ��� �����̷� ���� ���� �ڽ��� �Ȱ�(���������ȯ)�� ������ �ڽ��� �޼ҵ尡 ���̰Բ� �� 
		// �̰ͺ��� 4���� ����� �� �����Ҹ� ��
		System.out.println();
		
		// 4.�����ϴ� ����� (3���� ������ �����ؼ� �н��ؾ� ��) => ���� �߿��� ����!
		CricketGame cr1 = (CricketGame) ga; // �ڽ� #1
		cr1.type(); 
		cr1.write();
		CricketGame cr2 = (CricketGame) ga; // �ڽ� #2
		cr2.type(); // 
		cr2.write();
		System.out.println();
	
		// �̷� ���´� �Ұ���
//		CricketGame c1 = (CricketGame) new Game(); // �ڽ��� ������ �θ� �ٶ�
//		c1.type(); 
	}
}