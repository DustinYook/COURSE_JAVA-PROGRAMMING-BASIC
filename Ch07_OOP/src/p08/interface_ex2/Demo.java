package p08.interface_ex2;

public interface Demo 
{
	public static final double PI = 3.141592; // 고정상수
	public int a = 10;  // 변수
	
	public abstract void print(); // 인터페이스에서는 abstract 생략가능 <-> 추상클래스에서는 abstract 생략불가
}