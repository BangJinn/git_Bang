package transport;

public class Subway {

	String lineNumber;
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	
	}
	
	public void take(int fee) {
		this.money += fee;
		passenger++;
		
	}
	public void showSubwayInfo() {
		System.out.printf("지하철 %s의 수입은 %d원이고, 승객수는 %d명 입니다. \n",
			lineNumber, money, passenger);
		
		
	}
	
	
	
	
	
}