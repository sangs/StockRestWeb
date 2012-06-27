<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
	</xsl:template>
	
	<xsl:template match="quote">
	  <table border="2" width="50%">
	    <tr>
	      <th>Symbol</th>
	      <th>Company Name</th>
	      <th>Ask</th>
	      <th>PreviousClose</th>
	      <th>StockExchange</th>
	    </tr>
	    <xsl:for-each select="quote">
	      <tr>
	        <td>
	          <i><xsl:value-of select="Symbol"/></i>
	        </td>
	        <td>
	          <xsl:value-of select="Name"/>
	        </td>
	        <td>
	          <xsl:value-of select="Ask"/>
	        </td>
	        <td>
	          <xsl:value-of select="PreviousClose"/>
	        </td>
	      </tr>
	    </xsl:for-each>
	  
	  </table>
	
	</xsl:template>
	
	
</xsl:stylesheet>