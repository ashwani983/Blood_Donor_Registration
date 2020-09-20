package com.cg.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.bean.DonerInterface;
import com.cg.bean.DonorRegistrationDetails;

public class DonorRegistrationValidator {
	DonerInterface dv=new DonorRegistrationHelper();

	@Test
	public void testFName() 
	{
		assertTrue(dv.validatefname("Raghu"));
		assertFalse(dv.validatefname("Rag"));
	}
	@Test
	public void testMobileNo()
	{
		assertTrue(dv.validatemobileNo("9000234512"));
		assertFalse(dv.validatemobileNo("65089"));
	}
	@Test
	public void testBloodGroup()
	{
		assertTrue(dv.validatebloodGroup("O"));
		assertTrue(dv.validatebloodGroup("A"));
		assertTrue(dv.validatebloodGroup("B"));
		assertFalse(dv.validatebloodGroup("y"));
		assertFalse(dv.validatebloodGroup("a"));
	}
	@Test
	public void testAge()
	{
		assertTrue(dv.validateage("22"));
		assertFalse(dv.validateage("0"));
	}
	@Test
	public void testCity()
	{
		assertTrue(dv.validateCity("Pune"));
		assertFalse(dv.validateCity("1234"));
	}
	@Test
	public void testaddEmployee() {
		DonorRegistrationDetails e=new DonorRegistrationDetails();
		assertTrue(dv.addDonerDetail(e));
		
	}
	@Test
	public void testgetAllEmployees()
	{
		assertTrue(dv.getAllDoner().size()>0);
		
	}
	
	

}
