package singleton.student;

public class Student {

	private static int schoolNum = 100;
	private int studentNum;
	
	public Student() {
		schoolNum++;
		studentNum = schoolNum;
		
		
	}
	
	public int getStudentNum() {
		return studentNum;
		
	}
	
}
