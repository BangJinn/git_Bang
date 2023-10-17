package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 -getConnection(url, user, pwd)
			try {
				 conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521/xe",
						"c##mydb",
						"pwmydb");
				System.out.println("연결성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				System.out.println("연결끝");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
