package statics;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 객체 변수, 클래스 객체 변수(static)
		// 클래스 변수는 클래스 이름으로 직접 접근(new를 하지 않음)
		// 클래스 변수는 값이 공유되고, 누적되며 프로그램이 종료되면 소멸한다.
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student s1 = new Student();
		//Student s2 = new Student();
		
		//s1.serialNum++;
		//System.out.println(s1.serialNum);
		s1.setId(101);
		
		//s2.serialNum++;
		//System.out.println(s2.serialNum);
		
		System.out.println("학번 : " + s1.getId());
		//System.out.println("s2=" + s2.getId());
		
	}
}