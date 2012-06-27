package com.mytwocents.StockRestWeb;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wrapper {

  @JsonProperty("query")
  public JResponse rs;	
  
  
  Wrapper() {
	  
  }

}