package seleniumsessions;

import java.util.Properties;

public class openCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadProperty propReader = new ReadProperty();
		Properties prop = propReader.initprop();
		BrowserUtil b1 = new BrowserUtil();
		b1.launchBrowser(prop.getProperty("browser"));
		b1.launchURL(prop.getProperty("url"));
		b1.getTitle();
		b1.getcurrentURL();
		b1.closeBroswer();
	}

}
