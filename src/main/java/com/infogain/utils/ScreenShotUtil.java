package com.infogain.utils;

import com.infogain.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtil {
  private ScreenShotUtil() {}
  ;

  public static String getScreenShot() {
    return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
  }
}
