<%@ page import ="java.sql.*" %>

<%@page import="data.DBConnection"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <head>
        <title>	Bangladesh Army University of Engineering & Technology(BAUET)</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body> 
	    <header>
		    <nav>
			    <h1>Bangladesh Army University of Engineering & Technology(BAUET)</h1>
			    <ul id="nav">
			        <li><a class ="HOMEblack"href="profile.html">HOME</a></li>
			        <li><a class="HOMEblack" href="StrudentReg.html">Registration</a></li>
			         
			        <li><a class="HOMEblack" href="process_result.jsp">Process Result</a></li>
			        <li><a class="HOMEred" href="view.jsp">View Result</a></li>
			    
			    
			    </ul>
		    </nav>
	    </header>
	    
<form action="view.jsp">
  <input type="text" placeholder="ID" name="id">
  <input type="text" placeholder="semester" name="semester">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>

    
    <%
    String search=request.getParameter("id");
    String semester=request.getParameter("semester");
    
    Connection con=DBConnection.getMySqlConnection();
    Statement st=con.createStatement();
    Connection con1=DBConnection.getMySqlConnection();
    Statement st1=con1.createStatement();
    
    ResultSet rs;
    ResultSet rs1;
    st.executeUpdate("use bauet_data");

 
    	 rs=st.executeQuery("select * from mark_sheet where studentsId='"+search+"' and semester='"+semester+"'");
    


    
    %>
<h1>Bangladesh Army University of engineering & Technology<br>(BAUET) </h1>
<h4>Dept. of Information and communication engineering</h4>
<h4>Semester: <%=semester %> || Students ID : <%=search%><br>    </h4>


<table align="center" border="2" cellPadding="4" cellSpacing="1">
		
	
          <td>Subject</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;GPA</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mark</td>
          
       </tr>
		<% 	while(rs.next()) {
		%>	
		<tr>
		   <td><%=rs.getString("sumName") %></td>
		   <td><%=rs.getString("subGrade") %></td>
		   <td><%=rs.getString("subMark") %></td>
		 
		</tr>
	
		<%
	} %>
	</table>
	<%
	rs.close();
	rs=st.executeQuery("select * from result where id='"+search+"' and semester='"+semester+"'");
	%>
	
	<% 	while(rs.next()) {
		%>	
		   GPA: <%=rs.getString("gpa") %>
		 
		<%
	} %>
	
	
	
 <li><a href="\Welcome_To_BAUET/profile.html">Home</a></li>
 </body>
