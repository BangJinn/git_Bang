package overriding.shop;

public class MainShop2 {

	public static void main(String[] args) {
		
		HeadShop shop1 = new Shop1();
		
		shop1.비빔밥();
		
		HeadShop shop2 = new Shop2();
		
		shop2.비빔밥();
		
		int iNum = 10;
		double dNum;
		
		dNum = iNum;
		System.out.println(dNum);
		
		iNum = (int)dNum;
		System.out.println(iNum);
	}
}
