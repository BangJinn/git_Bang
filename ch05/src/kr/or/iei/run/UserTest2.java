package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		
	/*	
	User user1 = new User("sky789", "12345", "고병진");
			
			System.out.println("아이디 : " + user1.getId());
			System.out.println("비밀번호 : " + user1.getPwd());
			System.out.println("이름 : " + user1.getName());
		*/	
		
		//크키가 3인 배열 생성  순서 1
		User[] users = new User[3];
		
		// user 객체 생성 순서 2
		User user1 = new User("sky789", "12345", "고병진");
		User user2 = new User("sky567", "23456", "김병진");
		User user3 = new User("sky123", "234567", "임병진");
		
		// 배열에 객체를 저장[입력] 순서 3
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		System.out.println(users[0].getId() + ", " + users[0].getPwd() + ", " + 
				users[0].getName());
		
		System.out.println("=================================");
		
		
		
		//전체 출력 순서 4
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].getId() + ", " + users[i].getPwd() + ", " + 
						users[i].getName());
			
		}
		
	}

}
