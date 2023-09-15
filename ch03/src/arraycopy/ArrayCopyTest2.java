package arraycopy;

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		// 배열 복사 
		char[] arr1 = {'N','E','T'};
		char[] arr2 = new char[3];

		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; 
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " "); 
		}
		System.out.println();
		
		//역순 복사 T E N 나오게
		char[] arr3 = new char[3];
		//arr3[2] = arr2[0]; 'N'
		//arr3[1] = arr2[1]; 'E'
		//arr3[0] = arr2[2]; 'T'
		for(int i = 0; i < arr2.length; i++) {
			arr3[2-i] = arr1[i]; 
		}
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " "); 
		}
		System.out.println();
	}

}