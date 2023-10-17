package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

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
				String sql = "SELECT * FROM users";
				pstmt = conn.prepareStatement(sql);
			
				
				//sql 실행 -검색
				ResultSet rs = pstmt.executeQuery();
				List<User> userList = new ArrayList<>();
				 
				
				while(rs.next()) {
					User user =new User();
					user.setUserId(rs.getString("userid"));
					user.setUserName(rs.getString("username"));
					user.setUserPassword(rs.getString("userpav ssword"));
					user.setUserAge(rs.getInt("userage"));
					user.setUserEmail(rs.getString("useremail"));
					
					 
					
					System.out.println(user);
					
					userList.add(user);
				}
				
				for(int i=0; i<userList.size(); i++) {
					User user = userList.get(i);
					System.out.println(user);
					
				}
				
				//스택구조이므로 종료 순서를 바꿔줌
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
