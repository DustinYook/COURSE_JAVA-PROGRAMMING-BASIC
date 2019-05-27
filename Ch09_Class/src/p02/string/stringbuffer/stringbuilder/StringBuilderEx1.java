package p02.string.stringbuffer.stringbuilder;

public class StringBuilderEx1 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder(100); // '100'은 버퍼의 크기를 나타냄
		sb.append("java"); // append(): 맨 뒤에 추가하는 형태 => 삽일할 때 (insert는 중간에 삽입)
		System.out.println(sb + " : " + sb.capacity()); // 버퍼의 크기를 출력
		
		sb.trimToSize(); // 버퍼안에 비어있는 공간을 제거 (100바이트 중 4바이트를 뺀 96바이트 분량 제거)
		System.out.println(sb + " : " + sb.capacity()); // 버퍼의 크기를 출력
	}
}