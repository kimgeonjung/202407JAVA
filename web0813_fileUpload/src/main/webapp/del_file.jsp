<%@page import="webhard.Webhard"%>
<%@page import="webhard.WebhardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.File" %>
<% 
    int num = Integer.parseInt(request.getParameter("num"));
	WebhardDAO dao = new WebhardDAO();
	Webhard dto = dao.getWebhardById(num);
	
	if(dto != null){
        File file = new File(application.getRealPath("/files/") + dto.getFname());
        
        if (file != null) {
            file.delete();
        }
        dao.deleteWebhard(num);
	}
   
    response.sendRedirect("webhard.jsp");
%>