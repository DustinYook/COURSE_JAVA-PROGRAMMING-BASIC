package p04.array_class_ex;

public class ArrayMain 
{
	public static void main(String[] args) 
	{
		Cat mypet[] = new Cat[3]; // ��ü���� �� �޸��Ҵ�(��ü����)
		mypet[0] = new Cat("�߿���", "��");
		mypet[1] = new Cat("�ɳ���", "���þȺ��");
		mypet[2] = new Cat("������", "�ڸ��ȼ����");
		
		for(int i = 0; i < 3; i++)
			System.out.println(mypet[i].toString());
	}
}