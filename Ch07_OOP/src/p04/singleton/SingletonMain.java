package p04.singleton;
// Singleton Pattern: ��ü ������ �����ؼ� Singleton Ŭ���������� ��ü���� 1ȸ ����ϰ�
// �������ʹ� getInstance()�� ȣ���ؼ� ����ϴ� �����
public class SingletonMain 
{
	public static void main(String[] args) 
	{
		// Singleton s = new Singleton(); // �̷������� ��ü������ �Ұ�: private�� �پ��� ����
		Singleton s = Singleton.getInstance(); // Ŭ���� �޼ҵ带 ȣ��
	}
}