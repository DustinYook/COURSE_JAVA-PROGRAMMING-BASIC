package p01.generic.basic;

import java.util.ArrayList;

import p04.generic_method.TV;

public class GenericEx1 
{
	public static void main(String[] args) 
	{
		// 1.<String> Generics�� ����� ���
		ArrayList<String> a = new ArrayList<>(); // Ÿ���� ���� #1
		a.add("�ȳ��ϼ���"); // ���� Ÿ�Ը� �������
		a.add("3"); 
		for(String s: a) // ���� for���� �̿��Ͽ� ���尪 ���
			System.out.println(s);
		System.out.println();
		
		// 2.<Integer> Generics�� ����� ���
		ArrayList<Integer> ai = new ArrayList<>(); // Ÿ���� ���� #2
		ai.add(1);
		ai.add(2);
		for(Integer i: ai)
			System.out.println(i);
		System.out.println();
		
		// 3.<Ŭ������> Generics�� ����� ���
		ArrayList<TV> atv = new ArrayList<>();
		atv.add(new TV()); // ������ ��ü�� �ּҰ��� ��� (������ ���� ���)
		// new TV(): ��ü�� �����ϴ� ���� ����! => ������ TV ��ü �ּҰ��� �Ű������� ����
		atv.add(new TV("New TV")); 
		// ����� ���� Ŭ������ ��� �ݵ�� new�� �޸𸮿� �Ҵ��ϴ� ���� �켱!
		for(TV t: atv)
			System.out.println(t);
	}
}
// Generic: <Type> => *����ȯ�� �ʿ����, ������ �� Ÿ�� üũ => Ÿ���� ������Ȯ��