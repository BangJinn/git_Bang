package classes;

public class StudentTest {

	public static void main(String[] args) {
		//Student 객체(변수) 생성
		//메모리 영역(new를 하면 heap 영역 사용)
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.studentId = 101;
		
		System.out.println(student1.name);
		System.out.println(student1.studentId);
	}

}