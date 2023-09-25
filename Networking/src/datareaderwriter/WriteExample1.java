package datareaderwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) {

		try(Writer writer = new FileWriter("C:/File/test.txt");) {
			
			
			//1. 한문자 쓰기
			char a = 'A';
			char b = 'B';
			
			//2. 문자열 쓰기
			String str = "ㅎㅇ";
			
			//3. 배열 쓰기
			char[] arr = {'c','d','e'};
			
			
			
			writer.write(a);
			writer.write(b);
			writer.write(str);
			writer.write(arr);
			
			writer.flush();

			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
