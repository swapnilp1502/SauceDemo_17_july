package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class LoginPageTest extends BaseClass {
    @BeforeTest   
	public void setUp()
	{
    	BaseClass.initialization();
	}
    @Test
    public void validate() {
    	
    }
}
