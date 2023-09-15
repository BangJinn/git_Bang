package customers;

public class VIPCustomer extends Customer {
	private int agentId;		//전문 상담원
	double saleRatio;			//구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";	
		saleRatio = 0.1;		//10%
		bonusRatio = 0.05;		//5%
	} 
	
	
	//구매가격 = 가격 - (가격*구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
		
	}
	@Override
	public String showCsutomerInfo() {
		return super.showCsutomerInfo() + "\n전문 상담원 ID는 " + agentId +
				"입니다.";
	}
	
	
}
