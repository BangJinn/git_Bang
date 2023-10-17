package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectOneTest {

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
				String sql = "SELECT * FROM users WHERE userid = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "cloud");
				
				//sql 실행 -검색
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					User user =new User();
					user.setUserId(rs.getString("userid"));
					user.setUserName(rs.getString("username"));
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserAge(rs.getInt("userage"));
					user.setUserEmail(rs.getString("useremail"));
					System.out.println(user);
					
					/*String userId = rs.getString("userid");
					String userName = rs.getString("username");
					String userPassword = rs.getString("userpassword");
					int userAge = rs.getInt("userage");
					String userEmail = rs.getString("useremail");
					
					System.out.println("userId: " + userId);
					System.out.println("userName: " + userName);
					System.out.println("userPassword: " + userPassword);
					System.out.println("userAge: " + userAge);
					System.out.println("userEmail: " + userEmail);*/
				}else {
					System.out.println("아이디가 없어용.");
				}
				rs.close();
				pstmt.close();
				
				
				
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
