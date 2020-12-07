<%@ page import ="java.sql.*" %>
<%@page import="data.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 Connection con=DBConnection.getMySqlConnection();
 Statement st=con.createStatement();
 ResultSet rs;
  String name = (String) request.getAttribute("name" ) ; 
  String status = (String) request.getAttribute("status" ) ; 
  
    String nname=request.getParameter("nname");
	String nstatus=request.getParameter("nstatus");
	String message=request.getParameter("messege");
	
	st.executeQuery("use bauet_data");
	st.executeUpdate("insert into notice values('"+nstatus+"','"+message+"','"+nname+"')");
  
  
%>

 <head>
        <title>	Bangladesh Army University of Engineering & Technology(BAUET)</title>
        <link rel="stylesheet" href="style1.css">
    </head>
    <body> 
	  
<div class="navbar">
  <a href="homepage.html">Home</a>
  <a href="homepage.html" class="right">Logout</a>
   <a href="StrudentReg.html">registration</a>
  <script type="text/javascript">
var status=<%=status%>;
if(status=="Teacher")
{
para1.style.display="block";

}
else
{
para.style.display="block";;
} 
</script>
  
  <div class="para">
  <a class="para" href="regPage.html">registration</a>
  <a class="para" href="view.jsp" class="right">view result</a>
  </div>
  <div class="para1">
  <a class="para1" href="process_result.jsp">Process result</a>
  <a  class="para1" href="view.jsp" >view result</a>
  </div>
</div>


<div class="row">
  <div class="side">
      <h1 >Welcome</h1> 
      Name:<h2><%=name %></h2>
      <h5>(<%=status %>)</h5>
      <div>
       <h3>Add Notice</h3>
       <form action="profilep.jsp">
        <input name=messege>
        <input type=hidden  name=nname value=<%=name %>>
        <input type=hidden name=nstatus value=<%=status %>>
        <input type="submit" value="submit" > 
       </form>
      </div>
  </div>
  <div class="main">
      <h2>Bangladesh Army University of Engineering & Technology</h2>
      <h5></h5>
      <div class="fakeimg" style="height:100px;"> 
           <%
           
           st.executeUpdate("use bauet_data");
           rs=st.executeQuery("select * from notice");   
           %>
           <table align="center" border="2" cellPadding="4" cellSpacing="1">
		
	
          <td>Name</td>
           <td>Status</td>
           <td>messege</td>
          
       </tr>
		<% 	while(rs.next()) {
		%>	
		<tr>
		   <td><%=rs.getString("name") %></td>
		   <td><%=rs.getString("status") %></td>	
		   <td><%=rs.getString("messege") %></td>	 
		</tr>
	
		<%
	} %>
	</table>
           
           
       </div>
      <br>
      <h2>Bauet at a glance</h2>
      <h5>made my dept. of ice </h5>
      <div class="fakeimg" style="height:550px;"> 
      <video width="100%" height="100%" controls>
      <source src="images1/video1.mp4" type="video/mp4">
      </video> 
      </div>
      <p>Bangladesh Army University of Engineering & Technology (BAUET) has been established
       by the Bangladesh Army with due permission from the government of the Peoples Republic 
      of Bangladesh with a view to imparting Quality Education at affordable.</p>
  </div>
</div>

<div class="footer">
  <h2>(devoloped by dept. of ICE)</h2>
</div>



</body>
</html>