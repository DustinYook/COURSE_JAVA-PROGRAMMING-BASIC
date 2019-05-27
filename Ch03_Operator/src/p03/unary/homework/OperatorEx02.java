package p03.unary.homework;

public class OperatorEx02 
{
	public static void main(String[] args) 
	{
		int i = 5, j = 0;
		j = i++; // j에 i의 후치증감연산한 값을 저장: j = i; -> i = i + 1;
		System.out.println("j = i++; 실행 후, i: " + i + ", j: " + j);
		
		i = 5;
		j = 0;
		j = ++i; // j에 i의 전치증감연산한 값을 저장: i = i + 1; -> j = i; -> i = i;
		System.out.println("j = ++i; 실행 후, i: " + i + ", j: " + j);
	}
}