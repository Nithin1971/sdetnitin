package Practise;

public class If1 {
	public static void main(String[] args) {
		String expected_result="Login page ";
		String actual_result="Blank page";
		if (expected_result==actual_result) {
			System.out.println("testcase pass");
		} else {
			System.out.println("testcase fail");
			System.out.println("blocker defect");
		}
	}
}
