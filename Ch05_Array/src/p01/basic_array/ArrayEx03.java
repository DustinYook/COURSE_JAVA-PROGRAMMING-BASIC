// 프로그램 목적: 고정배열과 가변배열의 선언
package p01.basic_array;
public class ArrayEx03 
{
	public static void main(String[] args) 
	{
		String names1[] = new String[3]; // 고정배열: 3개의 한정적 칸
		for(int i = 0; i < names1.length; i++) // 고전적인 for문 => 조건식에 length 쓰는 것이 좋음
		{
			names1[i] = "알파고";
			System.out.println(names1[i]);
		} System.out.println();
		
		String names2[] = new String[] {"홍길동", "알파고", "베타고", "이순신"}; // 가변배열
		for(String str : names2) // 향상된 for문: 배열에서 특히 많이 이용!
			System.out.println(str);
	}
}