package p04.array_class; 

public class ArrayMain  
{ // ��ä�迭?
	public static void main(String[] args) // ����Ǵ� �κ� (main�޼ҵ�)
	{ 
		// Ŭ������ ��ä�� �迭�� ����
		// 1) ��ü����
		Dog d[] = new Dog[3]; // d�� ��������, Dog�� Ÿ��  => DogŸ���� �迭�� 3ĭ ������ �ǹ�
		// String str[] = new String[3]; // String�� �����ϰ� ���Ǵ� ���̶�� �ν��ϸ� ��
		// int a[] = new int[3]; // int�� ������ ������� ��� ����
		
		// 2) ��ü���� �� �ʱ�ȭ 
		d[0] = new Dog("����", "�ҵ�"); // ��ü������ ���� �����ڸ� ���ؼ� ���� 
		d[1] = new Dog("����", "������");
		d[2] = new Dog("ǳ��", "ǳ�갳"); 
		
		for(int i = 0; i < d.length; i++) // length�� ĭ�� ������
		{
			System.out.println(d[i].name + " " + d[i].kind);
			System.out.println(d[i]); // @overide�� ���� ������ ���� ������ �ּҰ��� ����
			System.out.println(d[i].toString()); // d[i]��ü�� ���ǵ� toString�޼ҵ忡 �����Ͽ� ���� ��ȯ�޾� �ܼ�â�� ���
		} System.out.println();
	}
}
// Ŭ������ ��ä�� �޸𸮿� �ö���� �ϴ� ���: ��ü ���� or static���� ����