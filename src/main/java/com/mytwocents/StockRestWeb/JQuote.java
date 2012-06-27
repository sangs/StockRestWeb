package com.mytwocents.StockRestWeb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


@JsonIgnoreProperties(ignoreUnknown = true)
public class JQuote {
	
 	public String Symbol;
	
 	public String LastTradeDate;
	
 	public String Open; //double
	
 	public String PreviousClose; //double
	
 	public String Ask; //double
	
 	public long AverageDailyVolume;
	
 	public String Bid; //double
	
 	public double AskRealtime;
	
 	public double BidRealtime;
	
 	public double BookValue;
	
 	public String Change_PercentChange;
	
 	public double Change;
	
 	public String Commission;
 	public double ChangeRealtime;
 	public String AfterHoursChangeRealtime;
 	public double DividendShare;
    //LastTradeDate;
 	public String TradeDate;
 	public double EarningsShare;
 	public String ErrorIndicationreturnedforsymbolchangedinvalid;
 	public double EPSEstimateCurrentYear;
 	public double EPSEstimateNextYear;
 	public double EPSEstimateNextQuarter;
 	public String DaysLow;
 	public String DaysHigh;
 	public String YearLow;
 	public double YearHigh;
 	public String HoldingsGainPercent;
 	public String AnnualizedGain;
 	public String HoldingsGain;
 	public String HoldingsGainPercentRealtime;
 	public String HoldingsGainRealtime;
 	public String MoreInfo;
 	public String OrderBookRealtime;
 	public String MarketCapitalization;
 	public String MarketCapRealtime;
 	public String EBITDA;
 	public String ChangeFromYearLow;
 	public String PercentChangeFromYearLow;
 	public String LastTradeRealtimeWithTime;
 	public String ChangePercentRealtime;
 	public String ChangeFromYearHigh;
 	public String PercebtChangeFromYearHigh;
 	public String LastTradeWithTime;
 	public double LastTradePriceOnly;
 	public String HighLimit;
 	public String LowLimit;
 	public String DaysRange;
 	public String DaysRangeRealtime;
 	public double FiftydayMovingAverage;
 	public double TwoHundreddayMovingAverage;
 	public String ChangeFromTwoHundreddayMovingAverage; //double
 	public String PercentChangeFromTwoHundreddayMovingAverage;
 	public String ChangeFromFiftydayMovingAverage; //double
 	public String PercentChangeFromFiftydayMovingAverage;
 	public String Name;
 	public String Notes;
    //private String Open;
    //PreviousClose
 	public String PricePaid;
 	public String ChangeinPercent;
 	public String PriceSales; //double
 	public String PriceBook; //
 	public String ExDividendDate;
 	public String PERatio; //double
 	public String DividendPayDate;
 	public String PERatioRealtime;
 	public String PEGRatio; //double
    
    @XStreamOmitField
    public double PriceEPSEstimateCurrentYear;
    
    @XStreamOmitField
    public double PriceEPSEstimateNextYear;
    
    public String SharesOwned;
    public String ShortRatio;
    public String LastTradeTime;
    public String TickerTrend;
    
    @XStreamOmitField
    public double OneyrTargetPrice;
    
    public long Volume;
    public String HoldingsValue;
    public String HoldingsValueRealtime;
    public String YearRange;
    public String DaysValueChange;
    public String DaysValueChangeRealtime;
    public String StockExchange;
    public String DividendYield;
    public String PercentChange;


    JQuote() {
		
	}
	
		
}
