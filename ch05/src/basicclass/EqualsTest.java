package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("우영우");
		String name2 = new String("우영우");
		//인스턴스의 메모리 주소 비교
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(name1 == name2);		//주소 비교
		System.out.println(name1.equals(name2));//문자열 비교

		System.out.println("=========================");//문자열 비교
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		
		System.out.println(book1 == book2);		//주소비교
		System.out.println(book1.equals(book2));//문자열비교
	}

}