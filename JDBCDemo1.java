import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//userdetails retrieving

public class JDBCDemo1
{
	int id;
	String emailid,password,username,phno;
	boolean enabled;
	Connection con;
	//declare a function private bcz 1st priority is given to local
	private Connection createConnection() throws ClassNotFoundException, SQLException
	{
		//loading of driver
		Class.forName("org.h2.Driver");
		//connection to DB
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/suman", "sa", "");
		return con;
	}

	public void showDetails() throws ClassNotFoundException, SQLException
	{
		createConnection();
		//requesting
		Statement st=con.createStatement();
		//retreiving data
		ResultSet rs= st.executeQuery("select * from user");
		while(rs.next())
		{
			System.out.println("Id:"+rs.getInt(1)+"Name: "+rs.getString(6)+
					"Phono: "+rs.getString(5)+
		"Password: "+rs.getString(4)+"enabled: "+rs.getString(3)+"EmailId: "+rs.getString(2));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		JDBCDemo1 j1=new JDBCDemo1();
		j1.showDetails();
		
	}

}
