package datainputoutput;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {

		String orignFile = "C:/File/avenue.1.jpg";
		String copyFile = "C:/File/avenue.2.jpg";
		long start, end;
		
		
		try {
			InputStream is = new FileInputStream(orignFile);	//원본파일
			OutputStream os = new FileOutputStream(copyFile);
			start = System.currentTimeMillis();
			
			
			while(true) {
				int num = is.read();	//읽은 데이터
				if(num == -1) break;
				os.write(num);			//파일에 쓰기
			}
			os.flush();
			is.close();
			os.close();
			
			end = System.currentTimeMillis();
			System.out.println("복사에 걸린 시간 : " + (end - start) + "ms");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
