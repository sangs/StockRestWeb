package com.mytwocents.StockRestWeb;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class JQuoteHelper {

	  @JsonProperty("quote")
	  public List<JQuote> quotes;

	  JQuoteHelper() {
		  
	  }

}