package com.mytwocents.StockRestWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.thoughtworks.xstream.XStream;


@Controller
public class StockQuoteRetrieve {
  
  private RestTemplate rTemplate;
	
	
  @Autowired
  StockQuoteRetrieve(RestTemplate restTemplate) {
    rTemplate = restTemplate;
  }
  
  @RequestMapping(value="/getquote", method=RequestMethod.GET)
  @ResponseBody
  public Wrapper retrieve(String requestedSymbol) {
	  String str = null;
	  String env = "store://datatables.org/alltableswithkeys";
	  String fmt = "json";
	  requestedSymbol = "FB";
	  String requestedSymbol2 = "GOOG";
	  String symbolString = "("+"\""+requestedSymbol+"\""+",\""+requestedSymbol2+"\""+")";
	  String queryStr = "SELECT * from yahoo.finance.quotes where symbol in "; 
		  
	  String restJsonUrl = "http://query.yahooapis.com/v1/public/yql?q={qid}{symbol}&format={fmt}&env={senv}";
	  Wrapper response = rTemplate.getForObject(restJsonUrl, Wrapper.class, queryStr,symbolString,fmt,env);
	  System.out.println("Received JSON response from YQL");
	  
  	  return response;
  }
	
  
  @RequestMapping(value="/getquotex", method=RequestMethod.GET)
  public @ResponseBody Query retrievexml(String requestedSymbol) {
	  String env = "store://datatables.org/alltableswithkeys";
	  requestedSymbol = "FB";
	  String requestedSymbol2 = "GOOG";
	  String symbolString = "("+"\""+requestedSymbol+"\""+",\""+requestedSymbol2+"\""+")";
	  String queryStr = "SELECT * from yahoo.finance.quotes where symbol in "; 
	  String restUrl = "http://query.yahooapis.com/v1/public/yql?q={qid}{symbol}&env={senv}";
	  
	  
	  Query qresponse = rTemplate.getForObject(restUrl, Query.class, queryStr,symbolString,env);
  	  System.out.println("Received response from YQL!");
  	  //XStream stream = new XStream();
  	  //System.out.println(stream.toXML(qresponse));
		  
  	  return qresponse;
  }
 
  @RequestMapping(value="/getquotesource", method=RequestMethod.GET)
  @ResponseBody
  public Source retrieveSource(String requestedSymbol) {
    String env = "store://datatables.org/alltableswithkeys";
	requestedSymbol = "FB";
	String requestedSymbol2 = "GOOG";
	String symbolString = "("+"\""+requestedSymbol+"\""+",\""+requestedSymbol2+"\""+")";
	String queryStr = "SELECT * from yahoo.finance.quotes where symbol in "; 
	String restUrl = "http://query.yahooapis.com/v1/public/yql?q={qid}{symbol}&env={senv}";
	  
	  Source sresponse = rTemplate.getForObject(restUrl, Source.class, queryStr,symbolString,env);
  	  System.out.println("Received response from YQL!");	
  	  return sresponse;
  }
  
  @RequestMapping(value="/getq", method=RequestMethod.GET)
  public String retrievexsl(String requestedSymbol, Model model) {
	  String env = "store://datatables.org/alltableswithkeys";
	  requestedSymbol = "FB";
	  String requestedSymbol2 = "GOOG";
	  String symbolString = "("+"\""+requestedSymbol+"\""+",\""+requestedSymbol2+"\""+")";
	  String queryStr = "SELECT * from yahoo.finance.quotes where symbol in "; 
	  String restUrl = "http://query.yahooapis.com/v1/public/yql?q={qid}{symbol}&env={senv}";
	  
	  
	  Query qresponse = rTemplate.getForObject(restUrl, Query.class, queryStr,symbolString,env);
  	  System.out.println("Received response from YQL!");
  	 		  
  	  List<Quote> lq = qresponse.getResult().getQuote();
  	  model.addAttribute("quotes", lq);
  	  return "Quote";
  }
  
  
  class AcceptHeaderHttpRequestInterceptor implements ClientHttpRequestInterceptor {
    String acceptHeaderValue;
		  
    AcceptHeaderHttpRequestInterceptor() {
      	
    }
      
	AcceptHeaderHttpRequestInterceptor(String headerValue) {
	  acceptHeaderValue = headerValue;
	}
		  
		  
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
	  List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
	  acceptableMediaTypes.add(MediaType.valueOf("application/xml"));
	  acceptableMediaTypes.add(MediaType.valueOf("text/xml"));
	  acceptableMediaTypes.add(MediaType.TEXT_XML);
	  acceptableMediaTypes.add(MediaType.valueOf("application/json"));
	  acceptableMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
	  HttpRequestWrapper rWrapper = new HttpRequestWrapper(request);
	  rWrapper.getHeaders().setAccept(acceptableMediaTypes);
			
	  return execution.execute(rWrapper, body);
	}
		  
  } //class ClientHttpRequestInterceptor
	  
  

}
