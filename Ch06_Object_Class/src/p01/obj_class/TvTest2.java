// 프로그램 설명: Television의 객체생성 및 사용방법 #2 (객체 인스턴스화 & 초기화)
package p01.obj_class;

public class TvTest2 
{
	public static void main(String[] args) 
	{
		// 1.객체생성 (인스턴스화)
		Television tv2_1 = new Television(); 
		Television tv2_2 = new Television(); 
		// 참조변수 tv2_1, tv2_2는 복사된 클래스의 시작주소를 저장
		
		// 2.멤버변수에 접근
		System.out.printf("tv2_1.channel: %d\n", tv2_1.channel);
		System.out.printf("tv2_2.channel: %d\n\n", tv2_1.channel);
		
		// 3.멤버변수 초기화
		tv2_1.channel = 7; 
		tv2_2.channel = 8;
		System.out.printf("tv2_1.channel: %d\n", tv2_1.channel);
		System.out.printf("tv2_2.channel: %d\n\n", tv2_1.channel);
	
		tv2_1.color = "red";
		tv2_2.color = "blue";
		System.out.printf("tv2_1.color: %s\n", tv2_1.color);
		System.out.printf("tv2_2.color: %s\n\n", tv2_2.color);
		
		tv2_1.power = true;
		tv2_2.power = false;
		System.out.printf("tv2_1.power: %b\n", tv2_1.power);
		System.out.printf("tv2_2.power: %b\n\n", tv2_2.power);
	}
}