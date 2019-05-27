// 프로그램 목적: 배열의 복사
package p02.array_2demension;

public class ArrayCopyEx 
{
	public static void main(String[] args) 
	{
		String src[] = {"java", "array", "copy"}; // 배열선언과 동시에 초기화
		String dest1[] = new String[src.length];
		String dest2[] = new String[src.length];
		
		// 1. arraycopy()메소드를 이용한 배열복사
		System.arraycopy(src, 0, dest1, 0, src.length); 
		for(String str : dest1) // 향상된 for문
			System.out.printf("%s ", str);
		System.out.println();
		
		// 2. for문을 이용한 배열복사
		for(int i = 0; i < dest2.length; i++) // 고전적 for문
		{
			dest2[i] = src[i];
			System.out.printf("%s ", dest2[i]);
		}
			
	}
}