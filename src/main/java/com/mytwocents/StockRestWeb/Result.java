package com.mytwocents.StockRestWeb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlRootElement(name="results")
@XStreamAlias("results")
public class Result {

	@XStreamImplicit(itemFieldName="quote")
	private List<Quote> quote;
	

    Result() {
		
	}
	
    @XmlElement
  	public List<Quote> getQuote() {
		return quote;
	}

    
	public void setQuote(List<Quote> quote) {
		this.quote = quote;
	}

}
