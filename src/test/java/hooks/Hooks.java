package hooks;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;
import utils.ExtentManager;

public class Hooks {
    private static ExtentReports er;
    @Before
    public void setup(){
        DriverFactory.initDriver();
        if(er==null){
            er = ExtentManager.sync();
        }
    }

    @After
    public void tearDown(){
        DriverFactory.quitDriver();
        er.flush();
    }
}
