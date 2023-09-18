package customers;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {

		//일반 고객 - 2명, 골드 1명, vip 1명
		// Customer[] customers = new Customer[5];
		ArrayList<Customer> customerList = new ArrayList<>();
		
		
		
		
		
		//고객 객체 생성
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer you1 = new GoldCustomer(10040, "이율곡");
		Customer king = new VIPCustomer(10050, "세종대왕", 1004);
		
		//고객 객체 저장
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(you1);
		customerList.add(king);
		
		int price = 10000;
		
		
		//고객 정보 출력
		for(int i=0; i<customerList.size(); i++) {
			Customer customer = customerList.get(i);
			//보너스 적립금 계산
			int cost = customer.calcPrice(price);
			System.out.printf("%s님이 지불할 비용은 %d원입니다.",
					customer.getcustomerName(), cost);
			System.out.println(customer.showCsutomerInfo());
			
		}
		
	}

}
