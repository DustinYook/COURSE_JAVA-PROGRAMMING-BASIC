package p07.Enumeration;

public class OldEx 
{
	public static void main(String[] args) 
	{
		ClothingInfo2 c = new ClothingInfo2("3233", "Short Sleeves", "Cotton 100%", ClothingInfo2.SUMMER);
		System.out.println("상품코드: " + c.code);
		System.out.println("계절구분: " + c.season); // 숫자가 나옴
	}
}