package p07.instance_static_initialize;

public class StaticBlockTest 
{
	// 동작순서: 클래스 초기화블록 -> 인스턴스 초기화블록 -> 생성자
	// 용도: main메소드보다 먼저 실행
	static int arr[] = new int[10]; // 클래스 배열변수 생성
	static // 클래스 초기화블록
	{
		for(int i = 0; i < arr.length; i++)
		{
			// 1부터 10사이의 임의의 수를 arr의 각 배열공간에 저장
			arr[i] = (int)(Math.random()*10)+1; // 명시적 형변환을 이용하여 double->int로 전환 (반환값 범위: 1~10)
			// Math클래스에 정의된 random()메소드: 반환형은 double형, 0.0 < 반환값 < 1.0
		}
	}
	
	public static void main(String[] args) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}