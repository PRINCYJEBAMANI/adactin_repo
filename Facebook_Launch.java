package com.facebook;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;

import com.base.BaseClass;

public class Facebook_Launch extends BaseClass {

	private void screenshotDynamic(String filename) {

		// ---------------dynamic screenshot---------------

	//	TakesScreenshot fb = (TakesScreenshot) browser;

		// DateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy h-m-s");

		// Date date = new Date();

	//	File source = fb.getScreenshotAs(OutputType.FILE);

	//	File dest = new File(
	//			"C:\\Users\\V.PRINCY JEBAMANI\\eclipse-workspace\\Maven_Pro\\Screenshot\\" + filename + ".png");

	//	FileUtils.copyFile(source, dest);

	}

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\V.PRINCY JEBAMANI\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver1.exe");

		WebDriver browser = new ChromeDriver();

		browser.manage().window().maximize();

		browser.get("https://www.facebook.com/");

		TakesScreenshot fb = (TakesScreenshot) browser;

		File source = fb.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\V.PRINCY JEBAMANI\\eclipse-workspace\\Maven_Pro\\Screenshot\\fblaunch.png");

		FileUtils.copyFile(source, dest);

	}

}
