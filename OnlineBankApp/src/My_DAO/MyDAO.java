package My_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Bean.My_Bean;







public class MyDAO {
public Connection Start()
{
     Connection con = null;
     try
     {
    	    Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerceproduct","root","root");
     }
     catch(ClassNotFoundException | SQLException w)
		{
		   System.out.println(w);
		}

	
	return con;
	


}
	public int logincheck(String uid , String pwd)
	{
		int x=0;
		
		try {
			
			Connection con = Start();
			PreparedStatement ps=con.prepareStatement("select * from login where user=? and pass=?");
			ps.setString(1, uid);
			ps.setString(2, pwd);
			 ResultSet rs= ps.executeQuery();
	          x=0;
			 if(rs.next())
				 x=1;
			con.close();
		}catch( SQLException w)
			{
			   System.out.println(w);
			}

		
		return x;
		
	}

	 public int insert(My_Bean e)
	 {
		 int x=0;
		 
		 try {
			 Connection con = Start();
			 PreparedStatement ps=con.prepareStatement("insert into wallet(Customer,Adress,Mobile,emailid,AccountNo,Pasw,Balance) values(?,?,?,?,?,?,?)");
				
				ps.setString(1, e.getName());
				ps.setString(2, e.getAddress());
				ps.setInt(3, e.getMob());
				ps.setString(4, e.getEmail());
				ps.setInt(5, e.getAcc_no());
				ps.setString(6, e.getPass());
				ps.setInt(7, e.getBalance());
				
				x= ps.executeUpdate();
		 }
		         catch( SQLException w)
				{
				   System.out.println(w);
				}
		 return x;
		}

	 public ArrayList<My_Bean>  viewcustomer()
		{
			ArrayList<My_Bean> list=new ArrayList<>();
			try {
				Connection con = Start();
				PreparedStatement ps=con.prepareStatement("SELECT uid,Customer,Adress,Mobile,emailid,AccountNo, Balance FROM wallet");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{ 
					My_Bean e=new My_Bean();
					e.setUid(rs.getInt("uid"));
					e.setName(rs.getString("Customer"));
					e.setAddress(rs.getString("Adress"));
					e.setMob(rs.getInt("Mobile"));
					e.setEmail(rs.getString("emailid"));
					e.setAcc_no(rs.getInt("AccountNo"));
					e.setBalance(rs.getInt("Balance"));
					//e.setSalary(rs.getDouble("salary"));
					//e.setAddress(rs.getString("address"));
					list.add(e);
			     }
				con.close();
			}catch( SQLException w)
				{
				  System.out.println(w);
				}
		return list;
			
		}
		
		 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
