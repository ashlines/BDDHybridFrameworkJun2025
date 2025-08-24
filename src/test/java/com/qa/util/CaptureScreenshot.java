package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author USER
 *this class has common method to take the sceenshot 
 */
public class CaptureScreenshot {

	/**
	 * @param driver
	 * @return the object of captured screnshot into byte format 
	 */
	public static byte[] captureImage(WebDriver driver) {

		TakesScreenshot srcShot = (TakesScreenshot) driver;

		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);

		return srcFile;

	}
}
