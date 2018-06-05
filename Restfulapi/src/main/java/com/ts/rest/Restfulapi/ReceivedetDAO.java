package com.ts.rest.Restfulapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReceivedetDAO {
	public int addReceive(Receivedetails receivedetails){
		int noOfRowsAffected=0;

		String patient_name = receivedetails.getPatient_name();
		String patient_phone = receivedetails.getPatient_phone();
		String patient_address = receivedetails.getPatient_address();
		String req_quantity = receivedetails.getReq_quantity() ;
	
		
		String sql = "insert into patient_det ( patient_name,patient_phone,patient_address,req_quantity) values(?,?,?,?)";

		try {
			//System.out.println(donate.getDis_name()+" "+donate.getQuantity()+" "+donate.getExp_date());
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, patient_name);
			ps.setString(2, patient_phone);
			ps.setString(3, patient_address);
			ps.setString(4, req_quantity);
			noOfRowsAffected = ps.executeUpdate();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(noOfRowsAffected==1)
			return 1; 
		return 0;
	}

	
	}


