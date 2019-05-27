package p02.generic.type;

public class BoxEx 
{
	public static void main(String[] args) 
	{
		// Generic�� C++�� ���ø��� ������ ������ �ϴ� �� ����.
		Box<String> b1 = new Box<>(); // String�� Box<T>�� T�� ��
		b1.set("Hello");
		String str = b1.get();
		System.out.println(str);
		
		Box<Integer> b2 = new Box<>();
		b2.set(6); // �ڵ� Boxing (int->Integer)
		int value = b2.get(); // �ڵ� UnBoxing (Integer->int)
		System.out.println(value);
	}
}