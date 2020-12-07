<%@ page import ="java.sql.*" %>

<%@page import="data.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	    
	    	    
<form action="admitcard.jsp">
  <input type="text" placeholder="ID" name="id">
  <input type="text" placeholder="semester" name="semester">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
	    
	    
	      <%
    String search=request.getParameter("id");
    String semester=request.getParameter("semester");
    Connection con=DBConnection.getMySqlConnection();
    Statement st=con.createStatement();
    ResultSet rs;
    st.executeUpdate("use bauet_data");
     rs=st.executeQuery("select * from regpersonal where id='"+search+"'");    
    %>
    <br>
<table  align="center" border="2" cellPadding="4" cellSpacing="1">
   <tr>
   <td>Students name</td>
    <td>Students id</td>
   
   </tr>

    <% 	while(rs.next()) {
		%>	
		 <tr>
		   <td>  <%=rs.getString("studentName") %></td>
		    <td> <%=rs.getString("id") %></td>
		  </tr> 
	
		<%} %>
</table>	
		<%
		rs.close();
	    rs=st.executeQuery("select * from regmain where id='"+search+"'");   
		%>
	
		
<table  align="center" border="2" cellPadding="4" cellSpacing="1">
<tr>
<td> REG no</td>
<td> name of the program</td>
<td> dept </td>
<td> batch </td>
<td> session  </td>
<td> semester </td>
<td>year</td>
</tr>
		 <% 	while(rs.next()) {
		%>	
		<tr>
		       <td><%=rs.getString("reg") %></td>
		       <td><%=rs.getString("programName") %></td>
		       <td><%=rs.getString("dept") %></td>
		       <td><%=rs.getString("batch") %></td>
		       <td><%=rs.getString("session") %></td>
		       <td><%=rs.getString("semester") %></td>
		       <td><%=rs.getString("year") %></td>
		   
		</tr>
		<%} %>

</table>

	<%
      rs=st.executeQuery("select * from subjectinfo where id='"+search+"' and semester='"+semester+"'");

		%>
		<table  align="center" border="2" cellPadding="4" cellSpacing="1">
    <tr>
   <td>sub. code</td>
    <td>sub Name</td>
   
   </tr>

    <% 	while(rs.next()) {
		%>	
		 <tr>
		   <td>  <%=rs.getString("subCode") %></td>
		    <td> <%=rs.getString("subName") %></td>
		  </tr> 
	
		<%} %>
</table>	
		

	
</body>
</html>