// 프로그램 설명: 실수형 간의 형변환 예제
package p52.casting;

public class CastingEx3 
{
	public static void main(String[] args) 
	{
		float f = 9.1234567f; // 저장범위를 초과한 부분은 버려짐
		double d1 = 9.1234567d;
		double d2 = (double)f;
		
		System.out.printf("f = %f\n", f);
		System.out.printf("f = %20.18f\n", f);
		System.out.printf("d1 = %20.18f\n", d1);
		System.out.printf("d2 = %20.18f\n", d2); // 저장시 f에 저장된 값이 그대로 표시됨
	}
}