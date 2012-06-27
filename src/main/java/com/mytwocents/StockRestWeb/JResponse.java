package com.mytwocents.StockRestWeb;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JResponse {

	
	@JsonProperty("results")
	public JQuoteHelper jquoteHelp;
	//public quote quotes;     
	//public quote results;
	
	JResponse() {
		
	}

	
}