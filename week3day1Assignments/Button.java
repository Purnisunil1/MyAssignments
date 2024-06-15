package week3day1Assignments;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Perform Submit action");		
	}	

	public static void main(String[] args) {
		// create object and call methods
		Button btn = new Button();
		btn.click();
		String text = btn.setText("Hi");
		System.out.println(text);
		
	}

}
