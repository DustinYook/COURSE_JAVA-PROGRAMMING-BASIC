package p04.math_random;
import java.util.Random;

public class RandomEx1 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		// Random ���� ������ 0.0<=r<1.0
		System.out.println(r.nextInt(100)); // 100�� ������ 
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100));
	}
}