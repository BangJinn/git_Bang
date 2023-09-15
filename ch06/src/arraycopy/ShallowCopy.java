package arraycopy;

public class ShallowCopy {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("미생1", "윤태호");
		array1[1] = new Book("미생2", "윤태호");
		array1[2] = new Book("미생3", "윤태호");
		
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		
		
		System.out.println("*** array1 출력 ***");
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i].toString());
		}

		
		//배열 복사
		System.out.println("*** array2 출력 ***");
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		Book[] array3 = array2.clone();
		System.out.println("*** array3 출력 ***");
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		//for(자료형 변수 : 배열이름){변수 출력}
		for(Book arr3 : array3) {
			System.out.println(arr3.toString());
			
			
		}
		
		
	}

}