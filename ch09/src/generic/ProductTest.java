package generic;

public class ProductTest {

	public static void main(String[] args) {

		Product<TV, String> prod1 = new Product<>();
		
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델명 : " + prod1.getModel());
		
		//자동차를 생성해서 모델명 출력해보세요.
		Product<Car, String> prod2 = new Product<>();
		
		Car car = new Car();
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		
		car.making1();
		System.out.println("모델명 : " + prod2.getModel());
		
	}

}
