package transport;

public class Bus {
	//필드
	
	int busNumber; 
	int passenger;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}

	public void take(int fee) {	//요금을 받음
		this.money += fee;	//요금을 더해서 수입이 증가
		passenger++;	//승객수 1명 증가, passenger = passenger
	}

	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원 이고, 승객 수는" + passenger + "명 입니다.");
		
	}
	
}
