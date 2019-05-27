// ���α׷� ����: ������ ArrayList �����
package p01.list.arraylist;

import java.util.ArrayList;

public class ArrayList_New 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>(); 
//		ArrayList<Object> list = new ArrayList<>(); // Object �������� 
		// <Object>: Object�� ��� Ŭ������ �����̹Ƿ� ��� �ڷ����� ����� �� �ִٴ� �ǹ� 
		
		// 1.add()�� �̿��� �ڷ�����: 0������ ������� �ڷ�����
		list.add("����"); // 0�� �ε���
		list.add("����"); // 1�� �ε���
		list.add("����"); // 2�� �ε���
		int max = list.size();
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 2.add(arg1,arg2) => arg1:�ε���, arg2:���尪
		list.add(0,"Ű��"); // 0�� �ε����� ���尪�� "Ű��"�� ���� 
		list.add(1,"���"); // 1�� �ε����� ���尪�� "���"�� ����
		list.add(2,"���"); // 2�� �ε����� ���尪�� "�뱫"�� ����
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 3.set(arg1,arg2) => arg1:�ε���, arg2:���尪 (2���� ����)
		list.set(0,"����"); // 0�� �ε����� ���尪�� "����"�� ����  
		list.set(1,"����"); // 1�� �ε����� ���尪�� "����"�� ����  
		list.set(2,"����"); // 2�� �ε����� ���尪�� "����"�� ���� 
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 4.remove()�� �̿��� �ڷ�����: remove(index) or remove(���嵥����)�� �������� ���
		list.remove(0); // 0�� �ε����� ���尪�� ����
		list.remove("����"); // "����"��� ���尪 ����
		max = list.size();
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
	}
}