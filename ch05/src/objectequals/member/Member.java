package objectequals.member;

public class Member {

	private String memberId;
	private String name;
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
		
		
	}

	@Override
	public int hashCode() {
		return memberId.hashCode();
	}
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId.equals(member.memberId)){
				return true;
			}
			
		}
		return false;
	}
	
	//객체의 문자열 정보 - toString() 재정의
	@Override
	public String toString() {
		return memberId + ", " + name;
	}
	
	
}
