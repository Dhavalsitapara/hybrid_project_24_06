package org.example;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest extends Utils
{

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp()
    {
        driverManager.openBrowser();
    }

    @AfterMethod

    public void tearDown(@NotNull ITestResult result)
    {  //Screenshot
        if (!result.isSuccess())
        {
            takeSnapShot(result.getName());
        }
      //  driverManager.closeBrowser();
    }
}
