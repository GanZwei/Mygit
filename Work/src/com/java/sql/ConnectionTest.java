package com.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
public class ConnectionTest {
	public static final String URL="jdbc:mysql://localhost:3306/work";
	public static final String USER="root";
	public static final String PASSWORD="666666";
	@Test
	public void test(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(URL, USER, PASSWORD);
			if(con!=null){
				System.out.println("链接成功");
				Statement sta=con.createStatement();
				String sql="insert into user values(16,'张三','256984','4656891')";
				sta.executeUpdate(sql);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
