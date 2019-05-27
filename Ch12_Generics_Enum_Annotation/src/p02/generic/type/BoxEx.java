package p02.generic.type;

public class BoxEx 
{
	public static void main(String[] args) 
	{
		// Generic은 C++의 템플릿과 동일한 역할을 하는 것 같다.
		Box<String> b1 = new Box<>(); // String이 Box<T>의 T로 감
		b1.set("Hello");
		String str = b1.get();
		System.out.println(str);
		
		Box<Integer> b2 = new Box<>();
		b2.set(6); // 자동 Boxing (int->Integer)
		int value = b2.get(); // 자동 UnBoxing (Integer->int)
		System.out.println(value);
	}
}