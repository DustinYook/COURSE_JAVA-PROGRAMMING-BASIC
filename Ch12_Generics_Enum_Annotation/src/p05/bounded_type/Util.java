package p05.bounded_type;

public class Util 
{
	// Number클래스를 상속받은 클래스: Byte, Short, Integer, Long, Float, Double (Wrapper Class)
	// 1.제한된 매개변수 타입
	public static <T extends Number> int compare(T t1, T t2) // 매개변수의 타입을 위의 6가지 타입으로 한정시킴 (여러 종류 사용가능)
	{
		double v1 = t1.doubleValue(); // doubleValue(): Double의 변수로 받아서 double로 반환
		double v2 = t2.doubleValue(); 
		return Double.compare(v1, v2); // 두 값을 내부적으로 비교 (v1>v2: 1, v1==v2:0, v1<v2:-1)
		// 비교해서 정렬하는데 이용함!
	}
}