package jsondata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseExample {

	public static void main(String[] args) {
		// 파일로부터 JSON 열기
		Reader reader;
		try {
			reader = new FileReader("C:/File/member.json");
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine();
			br.close();
			
			System.out.println(json);
			
			JSONObject member = new JSONObject(json);
			System.out.println("id : " + member.getString("id"));
			System.out.println("name : " + member.getString("name"));
			System.out.println("age : " + member.getInt("age"));

			//객체 속성 정보 읽기
			JSONObject tel = member.getJSONObject("tel");
			System.out.println("home:" + tel.getString("home"));
			System.out.println("moblie:" + tel.getString("moblie"));
			//배열 속성 정보 읽기
			JSONArray skill = member.getJSONArray("skill");
			System.out.print("skill: ");
			//for(int i = 0; i<skill.length(); i++) {
				//System.out.print(skill.get(i));
		//	}
			for(Object arr : skill)
				System.out.print(arr + ", ");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
