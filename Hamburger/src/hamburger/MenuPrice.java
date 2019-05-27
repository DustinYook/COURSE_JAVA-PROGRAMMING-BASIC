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
				System.out.println("ì¹˜í‚¨ë²„ê±°ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+a1+"?›)");
				setA1(a1);
			}
			if (menu == 2) {
				int a1 = 3500;
				System.out.println("ë¶ˆê³ ê¸°ë²„ê±°ë?? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+a1+"?›)");
				setA1(a1);
			}
			if (menu == 3) {
				int a1 = 2500;
				System.out.println("?ƒˆ?š°ë²„ê±°ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+a1+"?›)");
				setA1(a1);
			}
			if (menu == 4) {
				int a1 = 6500;
				System.out.println("ë¹„í”„ë²„ê±°ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+a1+"?›)");
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
				System.out.println("ê°ìì·¨ê??„ ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+s1+"?›)");
				setS1(s1);
				
			}
			if (menu1 == 2) {
				int s1 = 3500;
				System.out.println("?–´?‹ˆ?–¸ë§ë?? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+s1+"?›)");
				setS1(s1);
			}
			if (menu1 == 3) {
				int s1 = 2500;
				System.out.println("ì¹˜ì¦ˆ?Š¤?‹±ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+s1+"?›)");
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
				System.out.println("ì½œë¼?„ ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+bv1+"?›)");
				setBv1(bv1);				
			}
			if (menu2 == 2) {
				int bv1 = 3500;
				System.out.println("?‚¬?´?‹¤ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+bv1+"?›)");
				setBv1(bv1);
			}
			if (menu2 == 3) {
				int bv1 = 2500;
				System.out.println("?™˜??ë¥? ì£¼ë¬¸?•˜?…¨?Šµ?‹ˆ?‹¤(ê¸ˆì•¡"+bv1+"?›)" );
				setBv1(bv1);
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

	public int sumOrder(int a1,int s1, int bv1){
		int sum = a1+s1+bv1;
		System.out.println("?˜…ì£¼ë¬¸?•˜?‹  ì´? ?•©ê³„ëŠ” " + sum+ "?› ?…?‹ˆ?‹¤.");
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