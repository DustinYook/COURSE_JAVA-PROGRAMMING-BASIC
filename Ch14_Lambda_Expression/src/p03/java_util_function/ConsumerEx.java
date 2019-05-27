package p03.java_util_function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx 
{
	public static void main(String[] args) 
	{
		// 1.익명구현객체
		Consumer<String> c = new Consumer<String>() // 익명구현객체 방법
		{
			@Override
			public void accept(String str) 
			{
				System.out.println("입력문자열의 길이: " + str.length());
			}
		};
		c.accept("java 8.0 based programming");
		
		// 2.람다식 표현
		Consumer<String> cl = str -> System.out.println("입력문자열의 길이: " + str.length());
		cl.accept("java 8.0 based programming");
		// 괄호를 없앨 수도 있음 (매개변수가 1개인 경우)
		
		// 3.BiConsumer 익명구현객체
		BiConsumer<String, String> bi = new BiConsumer<String, String>() 
		{
			@Override
			public void accept(String t, String u) 
			{
				System.out.println(t + u);
			}
		};
		bi.accept("java", " 8.0");
		
		// 4.BiConsumer 람다 표현식
		BiConsumer<String, String> b2 = (t,u) -> System.out.println(t + u);
		b2.accept("java", " String Framework");
		
		
		// 5.DoubleConsumer: 익명구현객체
		DoubleConsumer dc = new DoubleConsumer() 
		{
			@Override
			public void accept(double value) 
			{
				System.out.println("Java " + value);
			}
		};
		dc.accept(8.0);
		
		// 6.DoubleConsumer: 람다식 표현
		DoubleConsumer dc2 = value -> System.out.println("Java " + value);
		dc.accept(8.0);
		
		// 7.ObjIntConsumer: 익명구현객체
		ObjIntConsumer<String> oic = new ObjIntConsumer<String>() 
		{
			@Override
			public void accept(String t, int value) 
			{
				System.out.println(t + value);
			}
		};
		oic.accept("Java ", 8);
		
		// 8.ObjIntConsumer: 람다식 표현
		ObjIntConsumer<String> oic2 = (t,value) -> System.out.println(t + value);
		oic.accept("Java ", 8);
	}
}