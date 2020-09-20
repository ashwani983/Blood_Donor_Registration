package com.cg.bean;


import java.util.Map;

public interface DonerInterface {
	String patternfname="[A-Z][a-zA-Z]{3,12}+";//patterns
	String patternmobileNo="[7-9][0-9]{9}+";//patterns
	String patternage="[0-9]{2}";//patterns
	String patternbloodGroup="[A B O AB]";//patterns
	String patternCity="[a-zA-z]+";
	public default boolean validatefname(String fname) {
		return fname.matches(patternfname);//patterns
	}
	public default boolean validatemobileNo(String mobileNo) {
		return mobileNo.matches(patternmobileNo);//patterns
	}
	public default boolean validatebloodGroup(String bloodGroup) {
		return bloodGroup.matches(patternbloodGroup);//patterns
	}
	
	public default boolean validateage(String age) {
		return age.matches(patternage);}
	
	public default boolean validateCity(String city) {
		return city.matches(patternCity);//patterns
	}
	//patterns
	
	public boolean addDonerDetail(DonorRegistrationDetails ob);//add method
	
	public Map<Integer,DonorRegistrationDetails>getAllDoner();//Getting all details of employees 
	
	
	
}
