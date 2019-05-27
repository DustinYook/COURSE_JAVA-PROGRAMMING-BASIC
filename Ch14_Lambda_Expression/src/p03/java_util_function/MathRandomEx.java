package p03.java_util_function;

public class MathRandomEx 
{
	public static void main(String[] args) 
	{
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위 눈의 값: " + num);
	}
}