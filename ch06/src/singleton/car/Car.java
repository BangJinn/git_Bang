package singleton.car;

public class Car {

	private static int serialNum = 1000;
	private int carNum;	//차량 번호
	
	public Car() {
		serialNum++;
		carNum = serialNum;
		
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	
}
