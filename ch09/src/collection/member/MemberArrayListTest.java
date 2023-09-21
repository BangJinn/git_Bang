package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();
		
		//Member 객체 생성
		Member mem1 = new Member(1001, "이순신");
		Member mem2 = new Member(1002, "양만춘");
		Member mem3 = new Member(1003, "강감찬");
		Member mem4 = new Member(1002, "양만춘");
		
		
		//회원 추가 메서드 호출
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);
		
		//회원 삭제
		memberList.removeMember(1002);
		memberList.removeMember(1004);
		
		//총 객체 수

		System.out.println("총 객체 수 : " + memberList.getSize());
		
		
		//회원 목록 조회
		memberList.showAllMember();
	}

}
