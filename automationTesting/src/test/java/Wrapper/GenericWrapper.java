package Wrapper;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import tests.Base;

public class GenericWrapper extends Base {
	
	public static String randomStringGenerator(int length) {
		String s="abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb=new StringBuilder();
		Random random=new Random();
		
		for(int i=0;i<length;i++) {
			int index=random.nextInt(s.length());
			char c=s.charAt(index);
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	public static void createScreenCapture() throws IOException {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File f=ss.getScreenshotAs(OutputType.FILE);
		ssfileName=randomStringGenerator(8);
		File d=new File("target//Screenshots//"+ssfileName+".png");
		FileHandler.copy(f, d);
	}

}
