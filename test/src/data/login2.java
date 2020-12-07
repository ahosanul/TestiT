package data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.login_check;
import data.profine;

/**
 * Servlet implementation class login2
 */
@WebServlet("/login2")
public class login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
	public static String statusof;
	public static String nameof;
    public login2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	    int i=0;
		PrintWriter out=response.getWriter();
		login_check data=new login_check();
		
			
		String status=request.getParameter("status");
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String id = request.getParameter("UserId");
		String pass=request.getParameter("password");

		
		
		
		//student reg:
		String Course=request.getParameter("Course");
		String Department=request.getParameter("Department");
		String batchNo=request.getParameter("batchNo");
		String RegistraionNo=request.getParameter("RegistraionNo");
		String IdNo=request.getParameter("IdNo");
		String Session=request.getParameter("Session");
		String Semester=request.getParameter("Semester");
		String Year=request.getParameter("Year");
		//personal information 
		String StudentName=request.getParameter("StudentName");
		String MotherName=request.getParameter("MotherName");
		String FatherName=request.getParameter("FatherName");
		String PermanentAddress=request.getParameter("PermanentAddress");
		String PresentAddress=request.getParameter("PresentAddress");
		String Birthday_day=request.getParameter("Birthday_day");
		String Birthday_Month=request.getParameter("Birthday_Month");
		String Birthday_Year=request.getParameter("Birthday_Year");
		String Email_Id=request.getParameter("Email_Id");
		String Mobile_Number=request.getParameter("Mobile_Number");
		String Gender=request.getParameter("Gender");
		String Nationality=request.getParameter("Nationality");
		String NationalID=request.getParameter("NationalID");
		String Bloodgroup=request.getParameter("Bloodgroup");
		
		//subject 
		String sub1_code=request.getParameter("sub1_code");
		String sub1_title=request.getParameter("sub1_title");
		String sub2_code=request.getParameter("sub2_code");
		String sub2_title=request.getParameter("sub2_title");
		String sub3_code=request.getParameter("sub3_code");
		String sub3_title=request.getParameter("sub3_title");
		String sub4_code=request.getParameter("sub4_code");
		String sub4_title=request.getParameter("sub4_title");
		String sub5_code=request.getParameter("sub5_code");
		String sub5_title=request.getParameter("sub5_title");
		String sub6_code=request.getParameter("sub6_code");
		String sub6_title=request.getParameter("sub6_title");
		String sub7_code=request.getParameter("sub7_code");
		String sub7_title=request.getParameter("sub7_title");
		String sub8_code=request.getParameter("sub8_code");
		String sub8_title=request.getParameter("sub8_title");
		String sub9_code=request.getParameter("sub9_code");
		String sub9_title=request.getParameter("sub9_title");
		String sub10_code=request.getParameter("sub10_code");
		String sub10_title=request.getParameter("sub10_title");
		String remark="reg";

		
		
	// reg
		
		if(IdNo !=null)
		{
			data.reg1(IdNo,RegistraionNo , Course, Department, batchNo, Session, Semester, Year);
			data.regper(IdNo, StudentName, MotherName, FatherName, Birthday_day, Birthday_Month, Birthday_Year, Bloodgroup,Gender);
			data.peradd(IdNo, PermanentAddress, PresentAddress, Email_Id, Mobile_Number, Nationality, NationalID);
			
			
			if(sub1_code !=null && sub1_title!=null )
			{
				data.subadd(sub1_code, sub1_title, remark,Semester,IdNo);
			}
			if(sub2_code !=null && sub2_title!=null )
			{
				data.subadd(sub2_code, sub2_title, remark,Semester,IdNo);
			}
			if(sub3_code !=null && sub3_title!=null )
			{
				data.subadd(sub3_code, sub3_title, remark,Semester,IdNo);
			}
			if(sub4_code !=null && sub4_title!=null )
			{
				data.subadd(sub4_code, sub4_title, remark,Semester,IdNo);
			}
			if(sub5_code !=null && sub5_title!=null )
			{
				data.subadd(sub5_code, sub5_title, remark,Semester,IdNo);
			}
			if(sub6_code !=null && sub6_title!=null )
			{
				data.subadd(sub6_code, sub6_title, remark,Semester,IdNo);
			}
			if(sub7_code !=null && sub7_title!=null )
			{
				data.subadd(sub7_code, sub7_title, remark,Semester,IdNo);
			}
			if(sub8_code !=null && sub8_title!=null )
			{
				data.subadd(sub9_code, sub9_title, remark,Semester,IdNo);
			}
			if(sub10_code !=null && sub10_title!=null )
			{
				data.subadd(sub10_code, sub10_title, remark,Semester,IdNo);
			}
			
			
			out.println("<h2> updated </h2>");
			RequestDispatcher rd=request.getRequestDispatcher("/Start_Page.html");  
            rd.include(request, response); 
			
			
			
		}
		
		
	//reg
		
	   	
		
		
		if(id!=null&&pass!=null&&fname==null&&lname==null)
		{
		i=data.check(id, pass);
		if(i>0)
		{
			profine passid=new profine(id);
			passid.fun_profile(id);
			request.setAttribute("idof" ,id ) ;
			request.setAttribute("status" ,statusof ) ;
			request.setAttribute("name" ,nameof ) ;
			RequestDispatcher rd=request.getRequestDispatcher("profilep.jsp");  
            rd.forward(request, response);
			
			
		}
		else
		{
			out.println("<h2> sorry </h2>");
			RequestDispatcher rd=request.getRequestDispatcher("/Start_Page.html");  
            rd.include(request, response); 
		}
		}
		
		
		
		if(id!=null&&pass!=null&&fname!=null&&lname!=null)
		{
			int j=0;
		j=data.insert(fname,lname,id,pass,status);
		if(j>0)
		{
			out.println("<h2>successfully doen "+id +"</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("/Start_Page.html");
			rd.include(request,response);
		}
		else
		{
			out.println("<h2> sorry  fail to registerd </h2>");
            
			
		}
		}
		
		
		
	}
}
