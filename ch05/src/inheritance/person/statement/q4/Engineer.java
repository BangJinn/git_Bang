package inheritance.person.statement.q4;

public class Engineer extends Employee{	
	public Engineer(String name) {
		super(name);
		
	}
	private String skillset;
	public String getSkillSet() {
		return skillset;
		
	}
	public void setSkillSet(String Skillset) {
		this.skillset = skillset;

	}
}
	
	


