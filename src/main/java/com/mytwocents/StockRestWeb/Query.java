package com.mytwocents.StockRestWeb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlRootElement(name="query")
@XStreamAlias("query")
public class Query {

  @XStreamAlias("results")
  private Result result;
  
  
  Query() {
	  
  }
  
  @XmlElement(name="results")
  public Result getResult() {
		return result;
  }

 
  public void setResult(Result result) {
		this.result = result;
  }

}
