package week3day1Assignments;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("The endPoint value is "+ endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus) {
		System.out.println("The endPoint value is "+ endPoint);
		System.out.println("The requestBody value is "+ requestBody);
		System.out.println("The requestStatus value is "+ requestStatus);
	}

	public static void main(String[] args) {
		// Create object and call the methods
		APIClient api = new APIClient();
		api.sendRequest("Success");
		api.sendRequest("Success", "Reuested", true);
	}

}
