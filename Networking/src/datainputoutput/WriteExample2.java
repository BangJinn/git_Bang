package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("C:/File/test2.db");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array);
			
			os.flush();
			os.close();
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
