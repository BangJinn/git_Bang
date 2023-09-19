package inheritance.transport;

//사람 클래스(자료형)
public class Person {
	
	//필드
	String name;	//이름
	int money;		//가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		
	}

	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
		
	}
	
	
	
	
	
	public void showPersonInfo() {
		System.out.println(name + "님의 남은 돈은 " + 
				money + "원 입니다.");
		
		
	}
	
	
}
