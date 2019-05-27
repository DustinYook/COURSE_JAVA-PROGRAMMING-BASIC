package p04.array_class_ex;

public class ArrayMain 
{
	public static void main(String[] args) 
	{
		Cat mypet[] = new Cat[3]; // 객체선언 및 메모리할당(객체생성)
		mypet[0] = new Cat("야옹이", "샴");
		mypet[1] = new Cat("냥냥이", "러시안블루");
		mypet[2] = new Cat("개냥이", "코리안숏헤어");
		
		for(int i = 0; i < 3; i++)
			System.out.println(mypet[i].toString());
	}
}