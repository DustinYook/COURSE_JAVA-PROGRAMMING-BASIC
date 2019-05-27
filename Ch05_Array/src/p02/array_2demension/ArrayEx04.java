// 프로그램 설명: 1차원 배열과 2차원 배열
package p02.array_2demension;

public class ArrayEx04 
{
	public static void main(String[] args) 
	{
		// 1.1차원 배열 (가장 많이 사용)
		int arr[] = {0,1,2,3};
		System.out.printf("1차원 배열의 길이: %d\n", arr.length);
		for(int i : arr) // 배열출력시에는 향상된 for문
			System.out.printf("%d ", i);
		System.out.println();
	
		// 2.2차원 배열             0번 인덱스        1번 인덱스          2번 인덱스
		int table[][] = {{0,0,0,1}, {0,0,1,1}, {0,1,1,1}}; // 2차원 배열의 구성: 배열변수명[행][열]
		System.out.printf("2차원 배열의 길이: %d\n", table.length); // length는 칸의 갯수를 반환
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
				System.out.printf("a[%d][%d] = %d\n",i,j,table[i][j]);
			System.out.println();
		}
	}
}