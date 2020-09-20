package com.cg.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cg.bean.*;
import com.cg.service.*;

public class DonorRregistration {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//for titles with spaces
		DonerInterface helper=new DonorRegistrationHelper();
		while(true)
		{
		System.out.println("Menu");
		System.out.println("1->Blood Donor Registration");
		System.out.println("2->Display Donor Details");	
		System.out.println("3->Exit.");
		
		String choice="";
		System.out.print("Enter your choice: ");
		 try {
			choice=br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 switch(choice)
			{
			case"1" :
			{
					  System.out.print("Enter Donor details: ");
					  System.out.println();
			          int registrationID=103;         
			          String firstName="";
			          String lastName="";
			          String mobileNo="";
			          String  bloodGroup="";
			          int age=0;
			          String city="";
			     
			        
			          System.out.print("FirstName: ");
			          System.out.println();
			          while(true)
			          {
			        	  firstName=br.readLine();
			          if(firstName==null||firstName.isEmpty())
			          {
			        	  System.out.print("Re-enter firstName[Not Null]: ");
			        	  System.out.println();
			          }
			          else if(!helper.validatefname(firstName))
			          {
			        	  System.out.print("Re-enter FirstName[Format Error]: ");
			        	  System.out.println();
			          } 
			          else
			          {
			        	  break;
			          }
			          }
			          System.out.print("Enter LastName: ");
			          System.out.println();
			          while(true)
			          {
			        	  lastName=br.readLine();
			          if(lastName==null||lastName.isEmpty())
			          {
			        	  System.out.print("Re-enter LastName[Not Null]: ");
			        	  System.out.println();
			          }
			          else
			          {
			        	  break;
			          }
			          }
			         System.out.print("Enter Mobile Number.: ");
			         System.out.println();
			          while(true)
			          {
			        	  mobileNo=br.readLine();
			        	  if(!helper.validatemobileNo(mobileNo))
			        	  {
			        		  System.out.print("Re-enter Mobile No[10 digit].:");
			        		  System.out.println();
			        	  }
			        	  else
			        	  {
			        		  break;  
			        	  }
			          }

			          System.out.print("Enter your Blood Group: ");
			          System.out.println();
			          while(true)
			          {
			        	  String blood_group=br.readLine();
			        	  if(helper.validatebloodGroup(blood_group))
			        	  {
			        		  break;
			        	  }
			        	  else
			        	  {
			        		  
			        		  System.out.print("Enter valid blood group[A,B,O,AB]: ");
			        		  System.out.println();
			        	  }
			        	  
			          }
			          System.out.println("Enter your age");
			          while(true)
			          {
			        	  String d_age=br.readLine();
			        	  if(!helper.validateage(d_age))
			        	  {
			        		  System.out.print("Please enter an valid age[NN]");
			        		  System.out.println();
			        		  
			        	  }
			        	  else
			        	  {
			        		  age=Integer.parseInt(d_age);
			        		  
			        		  if(age<=0)
			        		  {
			        			  System.out.println("Please enter valid age");
			        		  }
			        		  else
			        		  {
			        				   break;
			        		  }
			        	  }	
			          }
			          DonorRegistrationDetails ob=new DonorRegistrationDetails(registrationID, firstName, lastName, mobileNo, bloodGroup, age, city);
			         helper.addDonerDetail(ob);
			          System.out.println("Blood Donor registration done successfully with Registation ID: ");
			         System.out.println("Reg Id: "+registrationID++);
			         System.out.println("Name :"+firstName+" "+lastName);
			         System.out.println("Mobile No: "+mobileNo);
			         System.out.println("Blood Group: "+bloodGroup);
			         System.out.println("Age: "+age);
			         System.out.println("City: "+city);
			         if(age>66)
      			   {
      				   System.out.println("!!Sorry, you are not eligible to donate the blood");
      				  
      			   }
			         break;
			     
			          
			}
				
			case "2":
				
			{
				System.out.println("Doner information");
				Map <Integer,DonorRegistrationDetails> donCol=helper.getAllDoner();
				@SuppressWarnings("rawtypes") 
				Set set=donCol.entrySet();
				@SuppressWarnings("rawtypes")
			
			Iterator<Map.Entry> itr=set.iterator();		//iterations
			while(itr.hasNext())
			{
				@SuppressWarnings("rawtypes")
				Map.Entry me=itr.next();
				System.out.println("Doner ID: " +me.getKey()+"\n\tDetails :"+me.getValue());
			}			
				break;
			}
			case"3":
			{
				System.out.println("System Exit!!");
				System.exit(0);
				break;
			}
			default:
				{
					System.out.println("Invalid Choice!!!");
				}
		}
	}
	}
}
			
	
