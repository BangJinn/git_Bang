package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;		//sql 처리 클래스
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 -getConnection(url, user, pwd)
			try {
				 conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521/xe",
						"c##mydb",
						"pwmydb");
				System.out.println("연결성공");
				
				//db 처리 작업
				//매개변수화된 sql문 작성 - 동적 바인딩
				String sql = "INSERT INTO users(userid,username,userpassword,userage,useremail) "
						+ "VALUES (?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				//? 값 지정
				pstmt.setString(1, "cloud");
				pstmt.setString(2, "이구름");
				pstmt.setString(3, "u1234");
				pstmt.setInt(4, 100);
				pstmt.setString(5, "cloud@cloud.com");
				
				int rows = pstmt.executeUpdate();
				System.out.println("저장된 행의 수:" + rows);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
			try {
				conn.close();
				System.out.println("연결끝");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}
		
	}

}
