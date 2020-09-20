package com.cg.bean;

public class DonorRegistrationDetails {
	private  int registrationID;		
	private  String firstName;			
	private  String LastName;			
	private  String mobileNo;			
	private  String bloodGroup;			
	private  int age;				
	private String city;	 		
	static {
		  
		}//static block ended here
	public DonorRegistrationDetails() {
		
	}
	public DonorRegistrationDetails(int registrationID, String firstName,String LastName,String mobileNo, String bloodGroup, int age,String city) {
		super();
		this.registrationID = registrationID;
		this.firstName = firstName;
		this.LastName = LastName;
		this.mobileNo=mobileNo;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.city=city;
	}//parameterized constructor
	public int getregistrationID() {
		return registrationID;
	}
	public void setregistrationID(int eid) {
		this.registrationID = eid;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getcity() {
		return city;
	}
	public void setTax(String city) {
		this.city = city;
	}
	
	
//getters and setters
	
	@Override
	public int hashCode() {
		int result=registrationID^firstName.hashCode()^mobileNo.hashCode(); 
		return result;
	}
	//hashcode method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonorRegistrationDetails other = (DonorRegistrationDetails) obj;
		if (registrationID != other.registrationID)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}//equals
	@Override
	public String toString() {
		return "\n\t [Registration ID=" + registrationID + "\n\t First Name=" + firstName + "\n\t Last Name=" + LastName + "\n\t Mobile Number=" + mobileNo
				+"\n \t Blood Group= "+bloodGroup +"\n\t Age= " + age + "\n\t City= " + city + "]";
	}//toString method
	
	
		
	} 
	

