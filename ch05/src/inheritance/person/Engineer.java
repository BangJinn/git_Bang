package inheritance.person;

//Engineer가 person한테 상속 받음
public class Engineer extends Person{
	int companyId;
	

	//매개변수 있는 생성자를 상속받을때 super() 사용
	public Engineer(String name, int age, int companyId) {
		super(name, age, companyId);
		this.companyId = companyId;
		
		
	}
	
	public int getCompanyId() {
		return companyId;
		
	}
	
}