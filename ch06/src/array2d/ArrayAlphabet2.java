package array2d;

public class ArrayAlphabet2 {

	public static void main(String[] args) {
		// 
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
			
		}
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
	}

}
