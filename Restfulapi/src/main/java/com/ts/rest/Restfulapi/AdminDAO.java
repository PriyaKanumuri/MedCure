package com.ts.rest.Restfulapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {

	public AdminDAO() {
		// TODO Auto-generated constructor stub
	}
	public int getAdmin( Admin admin) {
		ResultSet rs;
		String name = admin.getName();
		String password = admin.getPassword();
		String sql =  "select * from admin_det where name='" + name + "' AND password='" + password + "'";

		try {
			System.out.println(admin.getName()+" "+admin.getPassword());
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972");
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			String rname = "";
			String uPass = "";
            while (rs.next()) {
                rname = rs.getString("name");
                uPass = rs.getString("password");
            }
            if (uPass.equals(password)) {
                return 1;
            } 
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
