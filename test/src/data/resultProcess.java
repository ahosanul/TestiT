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


/**
 * Servlet implementation class resultProcess
 */
@WebServlet("/resultProcess")
public class resultProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		login_check data=new login_check();
		
		PrintWriter out=response.getWriter();
		
		String semes= request.getParameter("semester");
		String id=request.getParameter("id");
		String one =request.getParameter("one");
		String one_cre =request.getParameter("one_cradit");
		String one_mark =request.getParameter("one_mark");
		String one_grade=request.getParameter("one_earn");
		String one_multigpa=request.getParameter("onemultigpa");

		
		String two =request.getParameter("two");
		String two_cre =request.getParameter("two_cradit");
		String two_mark =request.getParameter("two_mark");
		String two_grade=request.getParameter("two_earn");
		String two_multigpa=request.getParameter("twomultigpa");
		
		String three =request.getParameter("three");
		String three_cre =request.getParameter("three_cradit");
		String three_mark =request.getParameter("three_mark");
		String three_grade=request.getParameter("three_earn");
		String three_multigpa=request.getParameter("threemultigpa");
		
		String four =request.getParameter("four");
		String four_cre =request.getParameter("four_cradit");
		String four_mark =request.getParameter("four_mark");
		String four_grade=request.getParameter("four_earn");
		String four_multigpa=request.getParameter("fourmultigpa");
		
		String five =request.getParameter("five");
		String five_cre =request.getParameter("five_cradit");
		String five_mark =request.getParameter("five_mark");
		String five_grade=request.getParameter("five_earn");
		String five_multigpa=request.getParameter("fivemultigpa");
		
		String six =request.getParameter("six");
		String six_cre =request.getParameter("six_cradit");
		String six_mark =request.getParameter("six_mark");
		String six_grade=request.getParameter("six_earn");
		String six_multigpa=request.getParameter("sixmultigpa");
		
		String seven =request.getParameter("seven");
		String seven_cre =request.getParameter("seven_cradit");
		String seven_mark =request.getParameter("seven_mark");
		String seven_grade=request.getParameter("seven_earn");
		String seven_multigpa=request.getParameter("sevenmultigpa");
		
		String eight =request.getParameter("eight");
		String eight_cre =request.getParameter("eight_cradit");
		String eight_mark =request.getParameter("eight_mark");
		String eight_grade=request.getParameter("eight_earn");
		String eight_multigpa=request.getParameter("eightmultigpa");
		
		String nine =request.getParameter("nine");
		String nine_cre =request.getParameter("nine_cradit");
		String nine_mark =request.getParameter("nine_mark");
		String nine_grade=request.getParameter("nine_earn");
		String nine_multigpa=request.getParameter("ninemultigpa");
		
		
		String iddd=request.getParameter("gpa");
	
	    if(one !=null && id !=null)
		{
			data.insert_result_4th_semester(one,one_cre,one_mark,one_grade,one_multigpa,id,semes);	
			 
		}
		if( two!=null && id !=null)
		{
			data.insert_result_4th_semester(two,two_cre,two_mark,two_grade,two_multigpa,id,semes);		
		}
		
		if( three!=null && id !=null)
		{
			data.insert_result_4th_semester(three, three_cre, three_mark, three_grade, three_multigpa, id, semes);
		}
		
		if( four!=null && id !=null)
		{
			data.insert_result_4th_semester(four, four_cre, four_mark, four_grade, four_multigpa, id, semes);
		}
		if( five!=null && id !=null)
		{
			data.insert_result_4th_semester(five, five_cre, five_mark, five_grade, five_multigpa, id, semes);
		}
		if( six!=null && id !=null)
		{
			data.insert_result_4th_semester(six, six_cre, six_mark, six_grade, six_multigpa, id, semes);
		}
		if( seven!=null && id !=null)
		{
			data.insert_result_4th_semester(seven, seven_cre, seven_mark, seven_grade, seven_multigpa, id, semes);
		}
		if( eight!=null && id !=null)
		{
			data.insert_result_4th_semester(eight, eight_cre, eight_mark, eight_grade, eight_multigpa, id, semes);
		}
		if( nine!=null && id !=null)
		{
			data.insert_result_4th_semester(nine, nine_cre, nine_mark, nine_grade,nine_multigpa, id, semes);
		}
		
		
		
		if(iddd !=null && id !=null)
		{
			data.result(id, iddd, semes);
		}
	    
		
		  RequestDispatcher rd=request.getRequestDispatcher("process_result.jsp");  
          rd.forward(request, response);

	/*
		out.println(id);
		out.println(one_grade);
		out.println(one_multigpa);
		out.println(iddd);
		out.println(two_grade);
		*/
	}

}
