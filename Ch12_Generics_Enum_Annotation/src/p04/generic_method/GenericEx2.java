package p04.generic_method;

import java.util.ArrayList;

import p01.generic.basic.Product;

public class GenericEx2 
{
	public static void main(String[] args) // main Ŭ���� �޼ҵ�
	{
		ArrayList<Vcr> vcrlist = new ArrayList<>();
		printAll(vcrlist); // Ŭ���� �޼ҵ� ȣ��
	}
	
	public static <T extends Product> void printAll(ArrayList<T> list) // printAll Ŭ���� �޼ҵ�
	{ 
		for(Product p: list)
		{
			System.out.println(p);
		}
	}
}
// <T extends Product>: Type Parameter (���⼭ T�� ����)
// => �޼ҵ� �Ű�����(Method Parameter)�� T�� Ÿ���� "Product"��  Product�� ��ӹ��� "Vcr"�� �ΰ��� Ÿ������ ������Ű�� ����
// Generic�� Ư�� Ÿ������ ������Ű�� ��� => ���� ���� ������ Ÿ���� ����� �� �ְ� ���� (����� �̿�)