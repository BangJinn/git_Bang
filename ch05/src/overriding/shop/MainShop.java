package overriding.shop;

public class MainShop {

	public static void main(String[] args) {
		Shop1 shop1 = new Shop1();
		
		shop1.김치찌개();
		shop1.된장찌개();
		shop1.비빔밥();
		
		Shop2 shop2 = new Shop2();
		
		shop2.김치찌개();
		shop2.된장찌개();
		shop2.비빔밥();
		
		
	}
}