package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		
		School school = School.getInstance();
		
		Student kim = school.createStudent();
		Student park = school.createStudent();
		Student lee = school.createStudent();

		System.out.println("학번 : " + kim.getStudentNum());
		System.out.println("학번 : " + park.getStudentNum());
		System.out.println("학번 : " + lee.getStudentNum());
	}

}
