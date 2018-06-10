package com.extent;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class Functionality2 extends BaseTest
{
	
	

	@BeforeClass
	public void setup(){
		
		 test = extent.createTest("Functionality2");
		
	}
	
	
    @Test
    public void functionality2Test1()
    {
        Assert.assertTrue(1 > 0);
    }
     
    @Test
    public void functionality2Test2()
    {
        
        Assert.assertEquals("Ashwani", "Singh");
    }
     
    @Test
    public void functionality2Test3()    {
        
        Assert.assertNotEquals("Singh", "Singh");
    }
}