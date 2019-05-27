package p03.java_util_function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx 
{
	public static void main(String[] args) 
	{
		// 1.�͸�����ü
		Consumer<String> c = new Consumer<String>() // �͸�����ü ���
		{
			@Override
			public void accept(String str) 
			{
				System.out.println("�Է¹��ڿ��� ����: " + str.length());
			}
		};
		c.accept("java 8.0 based programming");
		
		// 2.���ٽ� ǥ��
		Consumer<String> cl = str -> System.out.println("�Է¹��ڿ��� ����: " + str.length());
		cl.accept("java 8.0 based programming");
		// ��ȣ�� ���� ���� ���� (�Ű������� 1���� ���)
		
		// 3.BiConsumer �͸�����ü
		BiConsumer<String, String> bi = new BiConsumer<String, String>() 
		{
			@Override
			public void accept(String t, String u) 
			{
				System.out.println(t + u);
			}
		};
		bi.accept("java", " 8.0");
		
		// 4.BiConsumer ���� ǥ����
		BiConsumer<String, String> b2 = (t,u) -> System.out.println(t + u);
		b2.accept("java", " String Framework");
		
		
		// 5.DoubleConsumer: �͸�����ü
		DoubleConsumer dc = new DoubleConsumer() 
		{
			@Override
			public void accept(double value) 
			{
				System.out.println("Java " + value);
			}
		};
		dc.accept(8.0);
		
		// 6.DoubleConsumer: ���ٽ� ǥ��
		DoubleConsumer dc2 = value -> System.out.println("Java " + value);
		dc.accept(8.0);
		
		// 7.ObjIntConsumer: �͸�����ü
		ObjIntConsumer<String> oic = new ObjIntConsumer<String>() 
		{
			@Override
			public void accept(String t, int value) 
			{
				System.out.println(t + value);
			}
		};
		oic.accept("Java ", 8);
		
		// 8.ObjIntConsumer: ���ٽ� ǥ��
		ObjIntConsumer<String> oic2 = (t,value) -> System.out.println(t + value);
		oic.accept("Java ", 8);
	}
}