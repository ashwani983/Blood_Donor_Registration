package com.cg.service;



import java.util.HashMap;
import java.util.Map;

import com.cg.bean.*;

public class DonorRegistrationHelper implements DonerInterface{
	HashMap<Integer,DonorRegistrationDetails> DonerCollection=new HashMap<Integer,DonorRegistrationDetails>();
	public DonorRegistrationHelper() {
	DonorRegistrationDetails d1=new DonorRegistrationDetails(101,"Vijay","Patel","9025678090","A",40,"Pune");
	DonorRegistrationDetails d2=new DonorRegistrationDetails(102,"Raju","Pakhar","9582348900","B",45,"Mumbai");
	DonorRegistrationDetails d3=new DonorRegistrationDetails(103,"Nikhil","Katikar","9766234200","O",35,"Delhi");
	DonerCollection.put(d1.getregistrationID(),d1);
	DonerCollection.put(d2.getregistrationID(),d2);
	DonerCollection.put(d3.getregistrationID(),d3);
	}
	@Override
	public boolean addDonerDetail(DonorRegistrationDetails ob) {
		DonerCollection.put(ob.getregistrationID(), ob);
		DonorRegistrationDetails b=DonerCollection.get(ob.getregistrationID());
		if(b==null)
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}

	@Override
	public Map<Integer, DonorRegistrationDetails> getAllDoner() {
		
		 return DonerCollection;
	}

	
	

	
}
