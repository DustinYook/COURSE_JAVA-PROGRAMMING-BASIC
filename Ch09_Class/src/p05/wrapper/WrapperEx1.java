package p05.wrapper;
// 기본형 타입: int,long,char,boolean,float,double,byte,short
// 참조형 타입: Integer, Long, Character, Byte, Boolean, Float, Double => 참조형 타입을 합해서 wrapper클래스라 함
// Wrapper Class: 참조형 타입을 전체적으로 표현하는 용어 => Wrapper Class란 클래스는 API에 존재하지 않음 (이들을 합해서 부르는 용어)
// 기본형 타입을 더욱 잘 활용하기 위해 존재하는 클래스가 wrapper class임
// 기본형 -> 참조형: Boxing, 참조형 -> 기본형: UnBoxing
public class WrapperEx1 
{
	public static void main(String[] args) 
	{
		int i = 10; // 기본형타입
		Integer intg = (Integer)i; // (Integer) => 형변환 생략가능
		// Integer: 클래스, intg: 참조변수(객체) => 참조형변수
		Object obj = (Object) i; // (Object) => 형변환 생략가능
		Long l = (Long) 1000L; // (Long) => 형변환 생략가능
		// Long과 같이 대문자로 쓰면 클래스, long은 기본형타입  // R_Value는 기본형 타입인 L임을 알 수 있음
		
		int i2 = intg+10; // 참조형과 기본형과의 연산이 가능함
		long l2 = intg+l; // 참조형 간의 연산가능
		Integer intg2 = new Integer(20); 
		int i3 = (int)intg2; // 묵시적형변환이 일어나나 명시적형변환 해주어도 됨
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(intg);
		System.out.println(intg2);
		System.out.println(l);
		System.out.println(l2);
	}
}