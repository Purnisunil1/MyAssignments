package week3day1Assignments;

public class VerifyTestData extends TestData {
	
	public void verifyUser() {
		System.out.println("Verify the user name");
	}
    public void verifyPwd() {
     System.out.println("Verify the password");	
    }
	public static void main(String[] args) {
		// Create object and call the parent methods
		
		VerifyTestData vtd = new VerifyTestData();
		vtd.enterCredentials();
		vtd.navigateToHomePage();
		vtd.verifyUser();
		vtd.verifyPwd();		

	}

}
