package com.mytwocents.StockRestWeb;

import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XmlRootElement(name="quote")
@XStreamAlias("quote")
public class Quote {
	
		
 	private String Symbol;
	
 	
	private String LastTradeDate;
	

	private String Open; //double
	

	private String PreviousClose; //double
	

	private String Ask; //double
	
	
	private long AverageDailyVolume;
	
	private String Bid; //double
	
	private double AskRealtime;
	
	private double BidRealtime;
	
	private double BookValue;
	
	private String Change_PercentChange;
	
	private double Change;
	
	private String Commission;
	
    private double ChangeRealtime;
	
    private String AfterHoursChangeRealtime;
	
    private double DividendShare;
    //LastTradeDate;
	
    private String TradeDate;
	
    private double EarningsShare;
	
    private String ErrorIndicationreturnedforsymbolchangedinvalid;
    
    private double EPSEstimateCurrentYear;
    
    private double EPSEstimateNextYear;
	
    private double EPSEstimateNextQuarter;
	
    private String DaysLow;
    
    private String DaysHigh;
    
    private String YearLow;
    
    private double YearHigh;
    
    private String HoldingsGainPercent;
    
    private String AnnualizedGain;
    
    private String HoldingsGain;
    
    private String HoldingsGainPercentRealtime;
    
    private String HoldingsGainRealtime;
	
    private String MoreInfo;
    
    private String OrderBookRealtime;
    
    private String MarketCapitalization;
    
    private String MarketCapRealtime;
    
    private String EBITDA;
    
    private String ChangeFromYearLow;
    
    private String PercentChangeFromYearLow;
    
    private String LastTradeRealtimeWithTime;
    
    private String ChangePercentRealtime;
    
    private String ChangeFromYearHigh;
    
    private String PercebtChangeFromYearHigh;
    
    private String LastTradeWithTime;
    
    private double LastTradePriceOnly;
    
    private String HighLimit;
    
    private String LowLimit;
    
    private String DaysRange;
    
    private String DaysRangeRealtime;
    
    private double FiftydayMovingAverage;
    
    private double TwoHundreddayMovingAverage;
    
    private String ChangeFromTwoHundreddayMovingAverage; //double
    
    private String PercentChangeFromTwoHundreddayMovingAverage;
    
    private String ChangeFromFiftydayMovingAverage; //double
    
    private String PercentChangeFromFiftydayMovingAverage;
    
    private String Name;
    
    private String Notes;
    //private String Open;
    //PreviousClose
    
    private String PricePaid;
    
    private String ChangeinPercent;
    
    private String PriceSales; //double
    
    private String PriceBook; 

    private String ExDividendDate;
    
    private String PERatio; //double
    
    private String DividendPayDate;
    
    private String PERatioRealtime;
    
    private String PEGRatio; //double
    
    @XStreamOmitField
    private double PriceEPSEstimateCurrentYear;
    
    @XStreamOmitField
    private double PriceEPSEstimateNextYear;
    
    private String SharesOwned;
    
    private String ShortRatio;
    
    private String LastTradeTime;
    
    private String TickerTrend;
    
    @XStreamOmitField
    private double OneyrTargetPrice;
    
    private long Volume;
    
    private String HoldingsValue;
    
    private String HoldingsValueRealtime;
    
    private String YearRange;
    
    private String DaysValueChange;
    
    private String DaysValueChangeRealtime;
    
    private String StockExchange;
    
    private String DividendYield;
    
    String PercentChange;


	Quote() {
	  
	}
	
	@XmlAttribute(name="symbol")
	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	@XmlElement(name="LastTradeDate")
	public String getLastTradeDate() {
		return LastTradeDate;
	}


	public void setLastTradeDate(String lastTradeDate) {
		LastTradeDate = lastTradeDate;
	}

	@XmlElement(name="Open")
	public String getOpen() {
		return Open;
	}

	public void setOpen(String open) {
		Open = open;
	}
	
    @XmlElement(name="PreviousClose")
	public String getPreviousClose() {
		return PreviousClose;
	}

	public void setPreviousClose(String previousClose) {
		PreviousClose = previousClose;
	}

	@XmlElement(name="Ask")
	public String getAsk() {
		return Ask;
	}

	public void setAsk(String ask) {
		Ask = ask;
	}

	@XmlElement(name="AverageDailyVolume")
	public long getAverageDailyVolume() {
		return AverageDailyVolume;
	}

	public void setAverageDailyVolume(long averageDailyVolume) {
		AverageDailyVolume = averageDailyVolume;
	}

	@XmlElement(name="Bid")
	public String getBid() {
		return Bid;
	}

	public void setBid(String bid) {
		Bid = bid;
	}
	
    @XmlElement(name="AskRealtime")
	public double getAskRealtime() {
		return AskRealtime;
	}

	public void setAskRealtime(double askRealtime) {
		AskRealtime = askRealtime;
	}

	@XmlElement(name="BidRealtime")
	public double getBidRealtime() {
		return BidRealtime;
	}

	public void setBidRealtime(double bidRealtime) {
		BidRealtime = bidRealtime;
	}

	@XmlElement(name="BookValue")
	public double getBookValue() {
		return BookValue;
	}

	public void setBookValue(double bookValue) {
		BookValue = bookValue;
	}

	@XmlElement(name="Change_PercentChange")
	public String getChange_PercentChange() {
		return Change_PercentChange;
	}

	public void setChange_PercentChange(String change_PercentChange) {
		Change_PercentChange = change_PercentChange;
	}

	@XmlElement(name="Change")
	public double getChange() {
		return Change;
	}

	public void setChange(double change) {
		Change = change;
	}

	@XmlElement(name="Commission")
	public String getCommission() {
		return Commission;
	}

	public void setCommission(String commission) {
		Commission = commission;
	}

	@XmlElement(name="ChangeRealtime")
	public double getChangeRealtime() {
		return ChangeRealtime;
	}

	public void setChangeRealtime(double changeRealtime) {
		ChangeRealtime = changeRealtime;
	}

	@XmlElement(name="AfterHoursChangeRealtime")
	public String getAfterHoursChangeRealtime() {
		return AfterHoursChangeRealtime;
	}

	public void setAfterHoursChangeRealtime(String afterHoursChangeRealtime) {
		AfterHoursChangeRealtime = afterHoursChangeRealtime;
	}

	@XmlElement(name="DividendShare")
	public double getDividendShare() {
		return DividendShare;
	}

	public void setDividendShare(double dividendShare) {
		DividendShare = dividendShare;
	}

	@XmlElement(name="TradeDate")
	public String getTradeDate() {
		return TradeDate;
	}

	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}

	@XmlElement(name="EarningsShare")
	public double getEarningsShare() {
		return EarningsShare;
	}

	public void setEarningsShare(double earningsShare) {
		EarningsShare = earningsShare;
	}

	@XmlElement(name="ErrorIndicationreturnedforsymbolchangedinvalid")
	public String getErrorIndicationreturnedforsymbolchangedinvalid() {
		return ErrorIndicationreturnedforsymbolchangedinvalid;
	}

	public void setErrorIndicationreturnedforsymbolchangedinvalid(
			String errorIndicationreturnedforsymbolchangedinvalid) {
		ErrorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
	}

	@XmlElement(name="EPSEstimateCurrentYear")
	public double getEPSEstimateCurrentYear() {
		return EPSEstimateCurrentYear;
	}

	public void setEPSEstimateCurrentYear(double ePSEstimateCurrentYear) {
		EPSEstimateCurrentYear = ePSEstimateCurrentYear;
	}

	@XmlElement(name="EPSEstimateNextYear")
	public double getEPSEstimateNextYear() {
		return EPSEstimateNextYear;
	}

	public void setEPSEstimateNextYear(double ePSEstimateNextYear) {
		EPSEstimateNextYear = ePSEstimateNextYear;
	}

	@XmlElement(name="EPSEstimateNextQuarter")
	public double getEPSEstimateNextQuarter() {
		return EPSEstimateNextQuarter;
	}

	public void setEPSEstimateNextQuarter(double ePSEstimateNextQuarter) {
		EPSEstimateNextQuarter = ePSEstimateNextQuarter;
	}

	@XmlElement(name="DaysLow")
	public String getDaysLow() {
		return DaysLow;
	}

	public void setDaysLow(String daysLow) {
		DaysLow = daysLow;
	}

	@XmlElement(name="DaysHigh")
	public String getDaysHigh() {
		return DaysHigh;
	}

	public void setDaysHigh(String daysHigh) {
		DaysHigh = daysHigh;
	}

	@XmlElement(name="YearLow")
	public String getYearLow() {
		return YearLow;
	}

	public void setYearLow(String yearLow) {
		YearLow = yearLow;
	}

	@XmlElement(name="YearHigh")
	public double getYearHigh() {
		return YearHigh;
	}

	public void setYearHigh(double yearHigh) {
		YearHigh = yearHigh;
	}

	@XmlElement(name="HoldingsGainPercent")
	public String getHoldingsGainPercent() {
		return HoldingsGainPercent;
	}

	public void setHoldingsGainPercent(String holdingsGainPercent) {
		HoldingsGainPercent = holdingsGainPercent;
	}

	@XmlElement(name="AnnualizedGain")
	public String getAnnualizedGain() {
		return AnnualizedGain;
	}

	public void setAnnualizedGain(String annualizedGain) {
		AnnualizedGain = annualizedGain;
	}

	@XmlElement(name="HoldingsGain")
	public String getHoldingsGain() {
		return HoldingsGain;
	}

	public void setHoldingsGain(String holdingsGain) {
		HoldingsGain = holdingsGain;
	}

	@XmlElement(name="HoldingsGainPercentRealtime")
	public String getHoldingsGainPercentRealtime() {
		return HoldingsGainPercentRealtime;
	}

	public void setHoldingsGainPercentRealtime(String holdingsGainPercentRealtime) {
		HoldingsGainPercentRealtime = holdingsGainPercentRealtime;
	}

	@XmlElement(name="HoldingsGainRealtime")
	public String getHoldingsGainRealtime() {
		return HoldingsGainRealtime;
	}

	public void setHoldingsGainRealtime(String holdingsGainRealtime) {
		HoldingsGainRealtime = holdingsGainRealtime;
	}

	@XmlElement(name="MoreInfo")
	public String getMoreInfo() {
		return MoreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		MoreInfo = moreInfo;
	}

	@XmlElement(name="OrderBookRealtime")
	public String getOrderBookRealtime() {
		return OrderBookRealtime;
	}

	public void setOrderBookRealtime(String orderBookRealtime) {
		OrderBookRealtime = orderBookRealtime;
	}

	@XmlElement(name="MarketCapitalization")
	public String getMarketCapitalization() {
		return MarketCapitalization;
	}

	public void setMarketCapitalization(String marketCapitalization) {
		MarketCapitalization = marketCapitalization;
	}

	@XmlElement(name="MarketCapRealtime")
	public String getMarketCapRealtime() {
		return MarketCapRealtime;
	}

	public void setMarketCapRealtime(String marketCapRealtime) {
		MarketCapRealtime = marketCapRealtime;
	}

	@XmlElement(name="EBITDA")
	public String getEBITDA() {
		return EBITDA;
	}

	public void setEBITDA(String eBITDA) {
		EBITDA = eBITDA;
	}

	@XmlElement(name="ChangeFromYearLow")
	public String getChangeFromYearLow() {
		return ChangeFromYearLow;
	}

	public void setChangeFromYearLow(String changeFromYearLow) {
		ChangeFromYearLow = changeFromYearLow;
	}

	@XmlElement(name="PercentChangeFromYearLow")
	public String getPercentChangeFromYearLow() {
		return PercentChangeFromYearLow;
	}

	public void setPercentChangeFromYearLow(String percentChangeFromYearLow) {
		PercentChangeFromYearLow = percentChangeFromYearLow;
	}

	@XmlElement(name="LastTradeRealtimeWithTime")
	public String getLastTradeRealtimeWithTime() {
		return LastTradeRealtimeWithTime;
	}

	public void setLastTradeRealtimeWithTime(String lastTradeRealtimeWithTime) {
		LastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
	}

	@XmlElement(name="ChangePercentRealtime")
	public String getChangePercentRealtime() {
		return ChangePercentRealtime;
	}

	public void setChangePercentRealtime(String changePercentRealtime) {
		ChangePercentRealtime = changePercentRealtime;
	}

	@XmlElement(name="ChangeFromYearHigh")
	public String getChangeFromYearHigh() {
		return ChangeFromYearHigh;
	}

	public void setChangeFromYearHigh(String changeFromYearHigh) {
		ChangeFromYearHigh = changeFromYearHigh;
	}

	@XmlElement(name="PercebtChangeFromYearHigh")
	public String getPercebtChangeFromYearHigh() {
		return PercebtChangeFromYearHigh;
	}

	public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh) {
		PercebtChangeFromYearHigh = PercebtChangeFromYearHigh;
	}

	@XmlElement(name="LastTradeWithTime")
	public String getLastTradeWithTime() {
		return LastTradeWithTime;
	}

	public void setLastTradeWithTime(String lastTradeWithTime) {
		LastTradeWithTime = lastTradeWithTime;
	}

	@XmlElement(name="LastTradePriceOnly")
	public double getLastTradePriceOnly() {
		return LastTradePriceOnly;
	}

	public void setLastTradePriceOnly(double lastTradePriceOnly) {
		LastTradePriceOnly = lastTradePriceOnly;
	}

	@XmlElement(name="HighLimit")
	public String getHighLimit() {
		return HighLimit;
	}

	public void setHighLimit(String highLimit) {
		HighLimit = highLimit;
	}

	@XmlElement(name="LowLimit")
	public String getLowLimit() {
		return LowLimit;
	}

	public void setLowLimit(String lowLimit) {
		LowLimit = lowLimit;
	}

	@XmlElement(name="DaysRange")
	public String getDaysRange() {
		return DaysRange;
	}

	public void setDaysRange(String daysRange) {
		DaysRange = daysRange;
	}

	@XmlElement(name="DaysRangeRealtime")
	public String getDaysRangeRealtime() {
		return DaysRangeRealtime;
	}

	public void setDaysRangeRealtime(String daysRangeRealtime) {
		DaysRangeRealtime = daysRangeRealtime;
	}

	@XmlElement(name="FiftydayMovingAverage")
	public double getFiftydayMovingAverage() {
		return FiftydayMovingAverage;
	}

	public void setFiftydayMovingAverage(double fiftydayMovingAverage) {
		FiftydayMovingAverage = fiftydayMovingAverage;
	}

	@XmlElement(name="TwoHundreddayMovingAverage")
	public double getTwoHundreddayMovingAverage() {
		return TwoHundreddayMovingAverage;
	}

	public void setTwoHundreddayMovingAverage(double twoHundreddayMovingAverage) {
		TwoHundreddayMovingAverage = twoHundreddayMovingAverage;
	}

	@XmlElement(name="ChangeFromTwoHundreddayMovingAverage")
	public String getChangeFromTwoHundreddayMovingAverage() {
		return ChangeFromTwoHundreddayMovingAverage;
	}

	public void setChangeFromTwoHundreddayMovingAverage(
			String changeFromTwoHundreddayMovingAverage) {
		ChangeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
	}

	@XmlElement(name="PercentChangeFromTwoHundreddayMovingAverage")
	public String getPercentChangeFromTwoHundreddayMovingAverage() {
		return PercentChangeFromTwoHundreddayMovingAverage;
	}

	public void setPercentChangeFromTwoHundreddayMovingAverage(
			String percentChangeFromTwoHundreddayMovingAverage) {
		PercentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
	}

	@XmlElement(name="ChangeFromFiftydayMovingAverage")
	public String getChangeFromFiftydayMovingAverage() {
		return ChangeFromFiftydayMovingAverage;
	}

	public void setChangeFromFiftydayMovingAverage(
			String changeFromFiftydayMovingAverage) {
		ChangeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
	}

	@XmlElement(name="PercentChangeFromFiftydayMovingAverage")
	public String getPercentChangeFromFiftydayMovingAverage() {
		return PercentChangeFromFiftydayMovingAverage;
	}

	public void setPercentChangeFromFiftydayMovingAverage(
			String percentChangeFromFiftydayMovingAverage) {
		PercentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
	}

	@XmlElement(name="Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@XmlElement(name="Notes")
	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	@XmlElement(name="PricePaid")
	public String getPricePaid() {
		return PricePaid;
	}

	public void setPricePaid(String pricePaid) {
		PricePaid = pricePaid;
	}

	@XmlElement(name="ChangeinPercent")
	public String getChangeinPercent() {
		return ChangeinPercent;
	}

	public void setChangeinPercent(String changeinPercent) {
		ChangeinPercent = changeinPercent;
	}

	@XmlElement(name="PriceSales")
	public String getPriceSales() {
		return PriceSales;
	}

	public void setPriceSales(String priceSales) {
		PriceSales = priceSales;
	}

	@XmlElement(name="PriceBook")
	public String getPriceBook() {
		return PriceBook;
	}

	public void setPriceBook(String priceBook) {
		PriceBook = priceBook;
	}

	@XmlElement(name="ExDividendDate")
	public String getExDividendDate() {
		return ExDividendDate;
	}

	public void setExDividendDate(String exDividendDate) {
		ExDividendDate = exDividendDate;
	}

	@XmlElement(name="PERatio")
	public String getPERatio() {
		return PERatio;
	}

	public void setPERatio(String pERatio) {
		PERatio = pERatio;
	}

	@XmlElement(name="DividendPayDate")
	public String getDividendPayDate() {
		return DividendPayDate;
	}

	public void setDividendPayDate(String dividendPayDate) {
		DividendPayDate = dividendPayDate;
	}

	@XmlElement(name="PERatioRealtime")
	public String getPERatioRealtime() {
		return PERatioRealtime;
	}

	public void setPERatioRealtime(String pERatioRealtime) {
		PERatioRealtime = pERatioRealtime;
	}

	@XmlElement(name="PEGRatio")
	public String getPEGRatio() {
		return PEGRatio;
	}

	public void setPEGRatio(String pEGRatio) {
		PEGRatio = pEGRatio;
	}

	@XmlElement(name="PriceEPSEstimateCurrentYear")
	public double getPriceEPSEstimateCurrentYear() {
		return PriceEPSEstimateCurrentYear;
	}

	public void setPriceEPSEstimateCurrentYear(double priceEPSEstimateCurrentYear) {
		PriceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
	}

	@XmlElement(name="PriceEPSEstimateNextYear")
	public double getPriceEPSEstimateNextYear() {
		return PriceEPSEstimateNextYear;
	}

	public void setPriceEPSEstimateNextYear(double priceEPSEstimateNextYear) {
		PriceEPSEstimateNextYear = priceEPSEstimateNextYear;
	}

	@XmlElement(name="SharesOwned")
	public String getSharesOwned() {
		return SharesOwned;
	}

	public void setSharesOwned(String sharesOwned) {
		SharesOwned = sharesOwned;
	}

	@XmlElement(name="ShortRatio")
	public String getShortRatio() {
		return ShortRatio;
	}

	public void setShortRatio(String shortRatio) {
		ShortRatio = shortRatio;
	}

	@XmlElement(name="LastTradeTime")
	public String getLastTradeTime() {
		return LastTradeTime;
	}

	public void setLastTradeTime(String lastTradeTime) {
		LastTradeTime = lastTradeTime;
	}

	@XmlElement(name="TickerTrend")
	public String getTickerTrend() {
		return TickerTrend;
	}

	public void setTickerTrend(String tickerTrend) {
		TickerTrend = tickerTrend;
	}

	@XmlElement(name="OneyrTargetPrice")
	public double getOneyrTargetPrice() {
		return OneyrTargetPrice;
	}

	public void setOneyrTargetPrice(double oneyrTargetPrice) {
		OneyrTargetPrice = oneyrTargetPrice;
	}

	@XmlElement(name="Volume")
	public long getVolume() {
		return Volume;
	}

	public void setVolume(long volume) {
		Volume = volume;
	}

	@XmlElement(name="HoldingsValue")
	public String getHoldingsValue() {
		return HoldingsValue;
	}

	public void setHoldingsValue(String holdingsValue) {
		HoldingsValue = holdingsValue;
	}

	@XmlElement(name="HoldingsValueRealtime")
	public String getHoldingsValueRealtime() {
		return HoldingsValueRealtime;
	}

	public void setHoldingsValueRealtime(String holdingsValueRealtime) {
		HoldingsValueRealtime = holdingsValueRealtime;
	}

	@XmlElement(name="YearRange")
	public String getYearRange() {
		return YearRange;
	}

	public void setYearRange(String yearRange) {
		YearRange = yearRange;
	}

	@XmlElement(name="DaysValueChange")
	public String getDaysValueChange() {
		return DaysValueChange;
	}

	public void setDaysValueChange(String daysValueChange) {
		DaysValueChange = daysValueChange;
	}

	@XmlElement(name="DaysValueChangeRealtime")
	public String getDaysValueChangeRealtime() {
		return DaysValueChangeRealtime;
	}

	public void setDaysValueChangeRealtime(String daysValueChangeRealtime) {
		DaysValueChangeRealtime = daysValueChangeRealtime;
	}

	@XmlElement(name="StockExchange")
	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}

	@XmlElement(name="DividendYield")
	public String getDividendYield() {
		return DividendYield;
	}

	public void setDividendYield(String dividendYield) {
		DividendYield = dividendYield;
	}

	@XmlElement(name="PercentChange")
	public String getPercentChange() {
		return PercentChange;
	}

	public void setPercentChange(String percentChange) {
		PercentChange = percentChange;
	}
	
		
}
