package org.rc;

import java.awt.AWTException;

import org.bs.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RoughClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
		
		ClassFive c5 = new ClassFive();
		sleep();
		clickBtn(c5.getSrchicon());
		passingText("Spanish Omelet", c5.getSrch());
		pressEnter();
		releaseEnter();
		sleep();
		clickBtn(c5.getSobtn());
		sleep();
		
		String r = c5.getPr().getText();
		System.out.println("\n The price before probability : " + r);
		
		clickBtn(c5.getT0());
		String t0 = c5.getT0().getText();
	     
		clickBtn(c5.getT1());
		String t1 = c5.getT1().getText();
		
		clickBtn(c5.getT2());
		String t2 = c5.getT2().getText();
		
		System.out.printf("\\n The probabilities are : " + t0,t1,t2);
		sleep(); 
		
		String r1 = c5.getPr().getText();
		System.out.println("\\n The price after probability : " + r1);
		
		
}

}
