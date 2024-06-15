package week3day1Assignments;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Perform Click Check Button");
	}

	public static void main(String[] args) {
		
		CheckBoxButton cbb = new CheckBoxButton();
		cbb.click();
		System.out.println(cbb.setText("Enter Check Box Button"));
		cbb.submit();
		
	}

}
