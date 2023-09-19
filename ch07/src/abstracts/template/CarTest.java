package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		//추상클래스는 객체 생성이 안된다.
		//Car car = new Car();
		Car hisCar = new ManualCar();
		hisCar.run();
	
		System.out.println("===================");
		
		Car myCar = new AICar();
		myCar.run();
	}

}
