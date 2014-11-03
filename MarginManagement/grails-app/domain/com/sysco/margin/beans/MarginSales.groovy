package com.sysco.margin.beans

class MarginSalesData {
	String idsId
	String name
	Double ytdValue; 
	Double ytdSalesValue
	Double ytdCostValue
	Integer year
	Double averageByWeeks //6 weeks avg margin
	Double averageSalesByWeeks//6 weeks avg sales
	Double averageCostByWeeks//6 weeks avg cost
	
	String weekString;
	
	List<Double>	weekMargins	=	new ArrayList<Double>()
	List<Double>	weekSales	=	new ArrayList<Double>()
	List<Double>	weekCosts	=	new ArrayList<Double>()
	

    static constraints = {
    }
}
