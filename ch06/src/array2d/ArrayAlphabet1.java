package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력


			//char c2 = 66;
			//System.out.println(c2);
			System.out.println("일반 for문을 사용 알파벳 출력");
			char c;
			for(c=65; c<=90; c++) {
				System.out.print(c + " ");
			}
			System.out.println("\n변수의 마지막에 값 : " + (char)(c-1));
			
			
			System.out.println(" == 알파벳을 배열에 저장하고 출력 == ");
			char[] alphabets = new char[26];
			char ch = 'A';
			
			//alphabets[0] = ch;
			//System.out.println(alphabets[0]);	//A
			//alphabets[1] = (char)(ch + 1);		//자바에서 덧셈연산을 하면 int형으로 바뀜
			//ch++;
			//alphabets[1] = ch;
			
			//System.out.println(alphabets[1]);
			
			//알파벳을 배열에 저장 - 1증가
			for(int i=0; i<alphabets.length; i++) {
				alphabets[i] = ch;
				ch++;
			}
			//알파벳 출력
			for(int i=0; i<alphabets.length; i++) {
				System.out.print(alphabets[i] + " ");
			}
			
		}

	}


