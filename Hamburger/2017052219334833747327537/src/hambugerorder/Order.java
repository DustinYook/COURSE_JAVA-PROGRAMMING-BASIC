package hambugerorder;

public class Order {

	public void PrpmotionInfo() {
		System.out.println("◈프로모션안내◈");
		System.out.println("① 19세이하 학생할인 30%");
		System.out.println("② 쿠폰할인 10% ");
		System.out.println("-->쿠폰코드 : C12092r51 ");
	}

	public void orderHambuger() {
		System.out.println("▶햄버거를 고르세요");
		System.out.println("1.치킨버거 : 5000원");
		System.out.println("2.불고기버거: 3500원");
		System.out.println("3.쉬림프버거: 2500원");
		System.out.println("4.비프버거 : 6500원");
		System.out.println("번호입력 -->");
	}

	public static void orderSide() {
		System.out.println("▶사이드를 고르세요");
		System.out.println("1.감자튀김 : 5000원");
		System.out.println("2.어니언링: 3500원");
		System.out.println("3.치즈스틱: 2500원");
		System.out.println("번호입력 -->");
	}

	public static void orderBeverage() {
		System.out.println("▶음료를 고르세요");
		System.out.println("1.콜라 : 5000원");
		System.out.println("2.사이다: 3500원");
		System.out.println("3.환타: 2500원");
		System.out.println("번호입력 -->");
		System.out.println();
	}

	public static void selectPromotion() {
		System.out.println("▶할인을 선택하세요");
		System.out.println("1. 학생할인  2. 쿠폰할인");
		System.out.println("번호입력 -->");
	}
}
