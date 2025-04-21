package seleniumJava;

import org.testng.annotations.Factory;

public class LoginPageFactory {
	
	@Factory
	public Object[] createTestInstance(){
		return new Object[] {
				new LoginTest("Admin","admin123"),
				new LoginTest("cdjsk","dsk")
		};
	}

}
