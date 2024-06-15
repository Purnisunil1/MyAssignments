package week3day1Assignments;

public class Textfield extends WebElement {
	
	public void getText() {
		System.out.println("Perform getText method");		
	}	

	public static void main(String[] args) {
		// create object and call methods
				Textfield tf = new Textfield();
				tf.click();
				String text = tf.setText("Hello text field");
				System.out.println(text);

	}

}
