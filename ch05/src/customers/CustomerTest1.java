package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 일반 고객 1명, vip 1명의 객체 생성
		Customer lee = new Customer();
		// 입력
		lee.setCustomerId(1001);
		lee.setCustomerName("이순신");
		
		int price = 10000;
		lee.calcPrice(price);
		
		//출력
		System.out.println(lee.showCsutomerInfo());
		System.out.println("=========================");
		
		
		
		
		VIPCustomer woo = new VIPCustomer();
		
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgentId(7777);
		
		price = 20000;
		woo.calcPrice(price);
		
		System.out.print(woo.showCsutomerInfo());
		
		
	}
	
}
