// 프로그램 설명: Television의 객체생성 및 사용방법 #4 (객체배열)
package p01.obj_class;

public class TvTest4 
{
	public static void main(String[] args) 
	{
		// 1.객체배열생성
		Television tv[] = new Television[3]; // 칸은 클래스 단위로 생성
		
		// 2.객체배열의 인스턴스화 및 초기화
		for(int i = 0; i < tv.length; i++)
		{
			tv[i] = new Television(); // 인스턴스화
			tv[i].channel = i; // 초기화
			System.out.printf("tv[%d].channel: %d\n", i, tv[i].channel);
		} System.out.println();
		
		// 3.객체배열의 멤버메소드 호출
		for(int j = 0; j < tv.length; j++)
		{
			tv[j].channelUp(); // channel의 저장값을 1 증가시킴
			System.out.printf("tv[%d].channel: %d\n", j, tv[j].channel);
		} System.out.println();
		
		for(int k = 0; k < tv.length; k++)
		{
			tv[k].channelDown(); // channel의 저장값을 1 감소시킴
			System.out.printf("tv[%d].channel: %d\n", k, tv[k].channel);
		} System.out.println();
	}
}