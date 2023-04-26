package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Brower Which u want!!!");
		String browserValue=sc.next();//ask the user input

		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver Driver=new ChromeDriver();//launch the browser
			Driver.manage().window().maximize();//maximize the parent browser
		}
		else if(browserValue.equals("edge"))	
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver Driver=new EdgeDriver();//launch the browser
			Driver.manage().window().maximize();//maximize the parent browser
		}
		else
		{
			System.out.println("select valid browerValue!!!");
		}
	}
}