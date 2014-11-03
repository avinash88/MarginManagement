package com.sysco.margin.beans

class Customer {
	
	String idsId
	String name

	String billingStreetNumber
	String billingStreetName
	String billingPostal
	String billingState

	String deliveryStreetNumber
	String deliveryStreetName
	String deliveryPostal
	String deliveryState

	String phone1
	String fax1
		
	//idLevel defined for the internal program use.
	//Like for MA Margin Management to identify the navigator Hierarchy
	Integer idLevel
	
	String maID
	String customerRank

    static constraints = {
    }
}
