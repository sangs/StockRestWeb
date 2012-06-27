<?xml version="1.0" encoding="UTF-8" ?>  
<!--  <?xml:stylesheet type="text/xsl" href="/WEB-INF/views/Quote.xsl" version="1.0" encoding="UTF-8"?> -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mytwocents.StockRestWeb.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Quote from yahoo finance</title>
</head>
<body>

 
  <query>
    <results>
      <table border="2" width="50%">
       <tr>
	      <th>Symbol</th>
	      <th>Company Name</th>
	      <th>Ask</th>
	      <th>PreviousClose</th>
	      <th>StockExchange</th>
	   </tr>
      <c:forEach items="${quotes}" var="quote">
        <quote>
          <tr>
          <td width="100"><c:out value="${quote.getSymbol()}" /></td>
          <td width="150"><c:out value= "${quote.getName()}" /></td>
          <td width="150"><c:out value= "${quote.getAsk()}" /></td>     
          <td width="150"><c:out value= "${quote.getPreviousClose()}" /></td>
          <td width="150"><c:out value= "${quote.getStockExchange()}" /></td>
          </tr>
        </quote>
      </c:forEach>
      </table>
    </results>
  </query>


</body>
</html>