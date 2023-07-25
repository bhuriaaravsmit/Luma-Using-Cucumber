package com.softwaretestingboard.magneto;

import com.softwaretestingboard.magneto.propertyreader.PropertyReader;
import com.softwaretestingboard.magneto.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {

    @Before
    public void setUp(){

        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}






