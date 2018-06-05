package com.ts.rest.Restfulapi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DonateDAO {


	
		public int addDonate(Donate donate){
			int noOfRowsAffected=0;

			String dis_name = donate.getDis_name();
			String med_name = donate.getMed_name();
			String med_type = donate.getMed_type();
			String exp_date= donate.getExp_date() ;
			String dosage = donate.getDosage();
			String quantity = donate.getQuantity();
			
			String sql = "insert into donate(dis_name,med_name,med_type,exp_date,dosage,quantity) values(?,?,?,?,?,?)";

			try {
				System.out.println(donate.getDis_name()+" "+donate.getQuantity()+" "+donate.getExp_date());
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972");
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, dis_name);
				ps.setString(2, med_name);
				ps.setString(3, med_type);
				ps.setString(4, exp_date);
				ps.setString(5, dosage);
				ps.setString(6, quantity);
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
		public static Donate getDonate(String dis_name)  throws ClassNotFoundException, SQLException {
			System.out.println("Inside donate from DAO");
			ResultSet rs;
			Donate p = new Donate();
			String sql ="select * from donate where dis_name = ?";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver Loaded");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972"); 
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, dis_name);
				rs = ps.executeQuery();
				System.out.println("executed query");
				while(rs.next()) {
					System.out.println("Inside if");
					p.setDis_name(rs.getString(1));
				    p.setMed_name(rs.getString(2));
					p.setMed_type(rs.getString(3));
					p.setExp_date(rs.getString(4));
					p.setDosage(rs.getString(5));
					p.setQuantity(rs.getString(6));
		
				}
			} catch (Exception e) {
					e.printStackTrace();
			}
			
		    System.out.println(p.getMed_type());
			
			return p;
		}
	
		public  List<Donate> getAllHistory() throws ClassNotFoundException, SQLException {
				String sql = "select m.dis_name,m.med_name,m.med_type,m.exp_date,m.dosage,m.quantity from donate m";
				System.out.println("in mobiles dao......");
				List<Donate> mlist = new ArrayList<Donate>();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root","vasu1972");

				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Donate temp = new Donate();
					temp.setDis_name(rs.getString(1));
					temp.setMed_name(rs.getString(2));
					temp.setMed_type(rs.getString(3));
					temp.setExp_date(rs.getString(4));
					temp.setDosage(rs.getString(5));
					temp.setQuantity(rs.getString(6));
					mlist.add(temp);
					System.out.println("in Mobiles dao......");
					System.out.println(mlist);
				}
				return mlist;
			}

		
		   public DonateDAO() {
		        super();
		    
		    }
}

