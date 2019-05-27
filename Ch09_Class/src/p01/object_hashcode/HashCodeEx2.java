package p01.object_hashcode;
// hashCode(): key값을 수치화 한 것
// 1단계: hashCode()를 재정의
// 2단계: equals()까지 재정의
public class HashCodeEx2 
{
	public static void main(String[] args) 
	{
		Name n1 = new Name("홍", "길동"); // 객체생성 #1 (인스턴스화)
		Name n2 = new Name("홍", "길동"); // 객체생성 #2 (인스턴스화)
		
		System.out.println(n1); // 첫번째 객체의 주소
		System.out.println(n1.hashCode());
		System.out.println(n2);
		System.out.println(n2.hashCode());
	}
}