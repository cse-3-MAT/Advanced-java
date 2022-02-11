// 1. import jdbc package
import java.sql.*;
import oracle.jdbc.driver.*;
//import oracle/sql.*;

// 2. Load and register jdbc diver in driver manager service
public class JDBCTest{
	public static void main(String a[]){
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
		try{
			// Load a driver
			OracleDriver d=new OracleDriver();
			// Register the driver in DriverManager 
			DriverManager.registerDriver(d);  

		// 3. open a connection to a database software
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="system";
			String password="admin";
			con=DriverManager.getConnection(url,username,password);
		// 4. create a statement object and prepare a sql command
			String query="select * from cse";
			st=con.createStatement();
		// 5. submit and execute sql_statments which in return resultant data
			rs=st.executeQuery(query);

		// 6. process the resultant data via resultset
			System.out.println("Customer Details");
			while(rs.next()){
				System.out.println("Customer Name : "+rs.getString(1)+"\tCustomer Mobile : "+rs.getString(2));
			}
		}

// 7. Handle the errors
		catch(Exception e){
			System.out.println("Connection was unsuccessful");
		}


// 8. close the resultset and statment objects
		finally{
			try{
				st.close();
				rs.close();
				con.close();
			}
			catch(Exception ee){

			}
		}

// 9. close the connection


	}
}