package p01.object_hashcode;

public class HashCodeEx1 
{
	public static void main(String[] args) 
	{
		// 자바 개발자가 만든 클래스의 경우 값이 똑같게 나오게 해 놓았음
		// 사용자 정의 클래스의 경우 다름
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}
}