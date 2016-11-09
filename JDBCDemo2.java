import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//inserting into user

public class JDBCDemo2 {

	int id;
	String emailid,password,username,phno;
	boolean enabled;
	Connection con;
	private Connection createConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/suman", "sa", "");
		return con;
	}

	/*public void storeDetails() throws ClassNotFoundException, SQLException
	{
		createConnection();
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id");
		id=sc.nextInt();
		System.out.println("enter user name");
		username=sc.next();
		System.out.println("enter password");
		password=sc.next();
		System.out.println("enter phone no");
		phno=sc.next();
		System.out.println("enter email id");
		emailid=sc.next();
		
		enabled=true;
		//1 refers to 1st column
		ps.setInt(1, id);
		ps.setString(2, emailid);
		ps.setBoolean(3, enabled);
		ps.setString(4, password);
		ps.setString(5, phno);
		ps.setString(6, username);
		
		//updating(insert)
		int x=ps.executeUpdate();
		if(x>0)
		{
			System.out.println("inserted into table");
		}
		else
		{
			System.out.println("not inserted");
		}
	
	
	}
	*/public void showDetails() throws ClassNotFoundException, SQLException
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
	
	public void deleteDetails() throws ClassNotFoundException, SQLException
	{
		createConnection();
		PreparedStatement ps=con.prepareStatement("delete from user where user_id=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id to delete");
		int id=sc.nextInt();
		ps.setInt(1, id);
		int x=ps.executeUpdate();
		if(x==id)
		{
			System.out.println("deleted");
		}
		
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		JDBCDemo2 j2=new JDBCDemo2();
		/*j2.storeDetails();
		*/j2.deleteDetails();
		
		j2.showDetails();
		}

}
