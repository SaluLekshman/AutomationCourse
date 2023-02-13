package com.obsqura.automationcourse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotationsExample {
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	@Before
	public void before()
	{
		System.out.println("Before");
		
	}
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
    public void test2()
    {
    	System.out.println("Test2");
    	
    }
	@Test
    public void test3()
    {
    	System.out.println("Test3");
    	
    }
	@Test
    public void test4()
    {
    	System.out.println("Test4");
    	
    }
	@After
    public void after()
	{
		System.out.println("After");
		
	}
	@AfterClass
    public static void afterClass()
	{
		System.out.println("After Class");
	}
    
}
