package week3day1Assignments;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("Enter USername");
		}
		public void enterPassword() {
		System.out.println("Enter Password");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       LoginTestData lt = new LoginTestData();
       
       lt.enterCredentials();
       lt.navigateToHomePage();             
       lt.enterUsername();
       lt.enterPassword();
	}
	

}
