package p04.generic_method;

import java.util.ArrayList;

import p01.generic.basic.Product;

public class GenericEx2 
{
	public static void main(String[] args) // main 클래스 메소드
	{
		ArrayList<Vcr> vcrlist = new ArrayList<>();
		printAll(vcrlist); // 클래스 메소드 호출
	}
	
	public static <T extends Product> void printAll(ArrayList<T> list) // printAll 클래스 메소드
	{ 
		for(Product p: list)
		{
			System.out.println(p);
		}
	}
}
// <T extends Product>: Type Parameter (여기서 T는 변수)
// => 메소드 매개변수(Method Parameter)인 T의 타입을 "Product"와  Product를 상속받은 "Vcr"의 두가지 타입으로 한정시키는 역할
// Generic은 특정 타입으로 한정시키는 기능 => 여러 개의 한정된 타입을 사용할 수 있게 해줌 (상속을 이용)