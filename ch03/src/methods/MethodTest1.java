package methods;

public class MethodTest1 {

	//변수의 선언과 사용
	//함수 정의(선언)과 호출(사용)
	
	
	
	
	
	public static void main(String[] args) {
		sayHello();
		sayHello("파이썬");
		sayHello("우영우");
	}
	
	//sayHello() 이름의 함수를 정의
	public static void sayHello() {
		System.out.println("안녕하세요~ 자바");
		
	}
	
	//매개변수가 있는 함수 정의
	public static void sayHello(String name) {
		System.out.println("안녕하세요~ " + name);
	}
	
	
}
