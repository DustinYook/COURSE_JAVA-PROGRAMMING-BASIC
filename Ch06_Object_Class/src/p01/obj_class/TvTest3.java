// 프로그램 설명: Television의 객체생성 및 사용방법 #3 (객체복사)
package p01.obj_class;

public class TvTest3 
{
	public static void main(String[] args) 
	{
		// 1.객체생성 (인스턴스화)
		Television tv3_1 = new Television();
		tv3_1.channel = 7;
		tv3_1.color = "green";
		tv3_1.power = false;
		// 자동완성기능(ctrl + space)을 사용하면 오타로 인한 오류방지가능
		
		Television tv3_2 = new Television();		
		tv3_2 = tv3_1; // 객체복사: 배열의 복사와 동일한 원리
		
		System.out.printf("tv3_1.channel: %d\n", tv3_1.channel);
		System.out.printf("tv3_2.channel: %d\n\n", tv3_2.channel);
		
		System.out.printf("tv3_1.color: %s\n", tv3_1.color);
		System.out.printf("tv3_2.color: %s\n\n", tv3_2.color);
		
		System.out.printf("tv3_1.power: %b\n", tv3_1.power);
		System.out.printf("tv3_2.power: %b\n\n", tv3_2.power);
	}
}