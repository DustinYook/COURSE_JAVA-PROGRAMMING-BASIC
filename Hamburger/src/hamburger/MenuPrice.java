package hamburger;

import java.util.InputMismatchException;

public class MenuPrice  {

	public int a1;
	public int s1;
	public int bv1;
	public int sum;
	
	public int getA1() {
		return a1;
	}

	 	
	public void setA1(int a1) {
		this.a1 = a1;
	}
	
	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getBv1() {
		return bv1;
	}

	public void setBv1(int bv1) {
		this.bv1 = bv1;
	
}

	public void selectB(int menu) {

		try {
			if (menu == 1) {
				int a1 = 5000;
				System.out.println("치킨버거�? 주문?��?��?��?��?��(금액"+a1+"?��)");
				setA1(a1);
			}
			if (menu == 2) {
				int a1 = 3500;
				System.out.println("불고기버거�?? 주문?��?��?��?��?��(금액"+a1+"?��)");
				setA1(a1);
			}
			if (menu == 3) {
				int a1 = 2500;
				System.out.println("?��?��버거�? 주문?��?��?��?��?��(금액"+a1+"?��)");
				setA1(a1);
			}
			if (menu == 4) {
				int a1 = 6500;
				System.out.println("비프버거�? 주문?��?��?��?��?��(금액"+a1+"?��)");
				setA1(a1);
			}
		
			
		} catch (InputMismatchException e) {
		System.out.println(e.getMessage());
		}		
	}	
	
	public void selectS(int menu1) {

		try {
			if (menu1 == 1) {
				int s1 = 5000;
				System.out.println("감자취�??�� 주문?��?��?��?��?��(금액"+s1+"?��)");
				setS1(s1);
				
			}
			if (menu1 == 2) {
				int s1 = 3500;
				System.out.println("?��?��?��링�?? 주문?��?��?��?��?��(금액"+s1+"?��)");
				setS1(s1);
			}
			if (menu1 == 3) {
				int s1 = 2500;
				System.out.println("치즈?��?���? 주문?��?��?��?��?��(금액"+s1+"?��)");
				setS1(s1);
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void selectBV(int menu2) {

		try {
			if (menu2 == 1) {
				int bv1 = 5000;
				System.out.println("콜라?�� 주문?��?��?��?��?��(금액"+bv1+"?��)");
				setBv1(bv1);				
			}
			if (menu2 == 2) {
				int bv1 = 3500;
				System.out.println("?��?��?���? 주문?��?��?��?��?��(금액"+bv1+"?��)");
				setBv1(bv1);
			}
			if (menu2 == 3) {
				int bv1 = 2500;
				System.out.println("?��??�? 주문?��?��?��?��?��(금액"+bv1+"?��)" );
				setBv1(bv1);
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

	public int sumOrder(int a1,int s1, int bv1){
		int sum = a1+s1+bv1;
		System.out.println("?��주문?��?�� �? ?��계는 " + sum+ "?�� ?��?��?��.");
		setSum(sum);
		return sum;
	}
	
	public void selectPr(int menu3){
		if(menu3 == 1){
			Promotion p = new Promotion();
			p.agePromotion();
		}
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}