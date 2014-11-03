package com.sysco.margin.beans

class MarginNavigator {
	
	SortedMap<String,MarginAssociate>	rsmData	=	new  TreeMap<String,MarginAssociate>()
	
	SortedMap<String,MarginAssociate>	dsmData	=	new  TreeMap<String,MarginAssociate>()

	SortedMap<String,MarginAssociate>	maData	=	new  TreeMap<String,MarginAssociate>()

	SortedMap<String,Customer>	customerData	=	new  TreeMap<String,Customer>()


    static constraints = {
    }
}
