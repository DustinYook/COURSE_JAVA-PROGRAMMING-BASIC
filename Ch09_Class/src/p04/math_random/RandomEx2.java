package p04.math_random;
import java.util.Random;

public class RandomEx2 
{
	// Random(long seed): Creates a new random number generator using a single long seed.
	
	public static void main(String[] args) 
	{
		Random r = new Random(3333L); // 3333L: Long Ÿ�� => seed ���� Long (���� ����)
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100));
	}
}