package data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import data.DBConnection;

public class login_check {

	public int check(String id,String pass){
		int i=0;
		try {
			Connection con = DBConnection.getMySqlConnection();
    		Statement stmt = con.createStatement();
    		ResultSet rs = stmt.getResultSet();
    		stmt.executeQuery("use bauet_data");
    		rs=stmt.executeQuery("select * from  login_data");
    		
    		while(rs.next()) {
    			    String idd= rs.getString("personsId");
    			    String pas=rs.getString("passWord");
    			    String status=rs.getString("status");
    			    String name=rs.getString("firstName");
    			if((idd.equals(id))&&(pas.equals(pass)))
    			{
    				data.login2.statusof=status;
    				data.login2.nameof=name;
    				return i=10;
    			}
    		
    			
    		} 
    		
    		
    		
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} 		
		return 0;
	}

	
	public int insert(String firstName,String lastName,String personsId,String passWord,String status){
		int j=0;
		try { 
    		Connection con = DBConnection.getMySqlConnection();
    		Statement stmt = con.createStatement();
    		stmt.executeQuery("use bauet_data");
    		j=stmt.executeUpdate("insert into  login_data values('" + firstName + "','" + lastName + "','" + personsId + "','" + passWord +"','"+status+"') ");
    		
    		
    		
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} 		
		return j;
		
	}


	public int insert_result_4th_semester(String subName,String subcredit,String subMark,String grade,String subMulticredit,String id,String semester){
		int j=0;
		try {
    		Connection con = DBConnection.getMySqlConnection();
    		Statement stmt = con.createStatement();
    		stmt.executeQuery("use bauet_data");
           j=stmt.executeUpdate("insert into mark_sheet values('" + subName + "','" + subcredit + "','" + subMark+"','" + grade +"','"+subMulticredit+"','"+ id +"','"+semester+"') ");
    		
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} 		
		return j;
		
	}
	
	
	public int reg1(String id,String reg,String course,String dept,String batchno,String session,String semester,String year)
	{
		Connection con;
		try {
			con = DBConnection.getMySqlConnection();
			Statement stmt = con.createStatement();
			stmt.executeQuery("use bauet_data");
	        int j=stmt.executeUpdate("insert into regmain values('" + id + "','" + reg + "','" + course+"','" + dept +"','"+batchno+"','"+session +"','"+semester+"','"+year+"') ");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}

	
    public int regper(String id ,String StudentName,String MotherName,String FatherName,String Bday,String bmonth,String byear,String bloodgroup,String gender) 
    {
    	Connection con;
    	try {
			con = DBConnection.getMySqlConnection();
			Statement stmt = con.createStatement();
			stmt.executeQuery("use bauet_data");
	        int j=stmt.executeUpdate("insert into regpersonal values('" + id + "','" + StudentName + "','" + MotherName+"','" + FatherName +"','"+Bday+"','"+bmonth +"','"+byear+"','"+bloodgroup+"','"+gender+"') ");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    return 0;
	
    
    	
    }
    
    
    public int peradd(String id,String permanentadd, String persentadd, String Email,String mobile,String nationality,String nationalid )
    {
    	Connection con;
    	try {
			con = DBConnection.getMySqlConnection();
			Statement stmt = con.createStatement();
			stmt.executeQuery("use bauet_data");
	        int j=stmt.executeUpdate("insert into  regaddress values('" + id + "','" + permanentadd + "','" + persentadd+"','" + Email +"','"+mobile+"','"+nationality +"') ");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
    	
    }
    public int subadd(String subcode,String subname,String remerk,String semester, String id)
    {
    	Connection con;
    	try {
			con = DBConnection.getMySqlConnection();
			Statement stmt = con.createStatement();
			stmt.executeQuery("use bauet_data");
	        int j=stmt.executeUpdate("insert into subjectinfo  values('" + subcode + "','" + subname + "','" + remerk+"','"+semester+"','"+id+"') ");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
    	
    }
    
    public int result(String id,String gpa,String semester)
    {

    	Connection con;
    	try {
			con = DBConnection.getMySqlConnection();
			Statement stmt = con.createStatement();
			stmt.executeQuery("use bauet_data");
	        int j=stmt.executeUpdate("insert into result  values('" + id + "','" + gpa + "','" + semester+"') ");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return 0;
    }
	
	
}
