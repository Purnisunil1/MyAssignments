package week3day1Assignments;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Perform select Radio button method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton rb = new RadioButton();
		rb.click();
		System.out.println(rb.setText("Enter Radio Button"));
		rb.submit();
		
	}

}
