package application;

import java.sql.Connection;
import java.sql.SQLException;

import db.DB;
import model.entities.Department;

public class Program {
	public static void main(String[] args) throws SQLException {
		Department obj = new Department(1, "Books");
		Connection conn = null;
		try {
			conn = DB.getConnection();
			System.out.println("OI");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
	}
}
