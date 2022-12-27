package selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(1000);
	    driver.findElement(By.name("NewWindow")).click();
	    Thread.sleep(1000);
	    String d = driver.getWindowHandle();
	    Set<String> dr = driver.getWindowHandles();
	    Thread.sleep(1000);
	    for(String o:dr)
	    {
	    	driver.switchTo().window(o);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	Thread.sleep(1000);
	    	if(d.equals(o))
	    	{
	    		Thread.sleep(1000);
	    		driver.close();
	    	}
	    	
	    }
	     
	     
	    

	}

}
