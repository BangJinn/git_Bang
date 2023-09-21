package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("찾는 클래스가 있습니다");
		}catch (Exception e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("항상 수행됨");
			
		}
		
		
	}
	
	
}
