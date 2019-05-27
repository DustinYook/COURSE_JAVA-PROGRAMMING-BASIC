// 프로그램 설명: 배열의 사용법 기초 #2
package p01.basic_array;
public class ArrayEx02 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[3]; // 배열 선언 + 메모리 할당 (arr:배열변수) 
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) // 배열원소의 초기화 
		{
			arr[i] = num++;
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}