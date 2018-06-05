package com.ts.rest.Restfulapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReceiveDAO {

		public  List<Receive> getTransfer() throws ClassNotFoundException, SQLException {
			String sql = "select m.donor_name,m.patient_name,m.med_name,m.med_type,m.quantity from transfer m";
			System.out.println("in mobiles dao......");
			List<Receive> mlist = new ArrayList<Receive>();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972");

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Receive temp = new Receive();
				temp.setDonor_name(rs.getString(1));
				temp.setPatient_name(rs.getString(2));
				temp.setMed_name(rs.getString(3));
				temp.setMed_type(rs.getString(4));
				temp.setQuantity(rs.getString(5));
				mlist.add(temp);
		
				System.out.println("in Mobiles dao......");
				System.out.println(mlist);
			}
			return mlist;
		}

	
	   public ReceiveDAO() {
	        super();
	    
	    }


}
