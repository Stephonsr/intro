package fecJavClas;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bills = "B";
		switch (bills) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
		case "C":
			System.out.println("Well done");
			break;
		case "D":
			System.out.println("You passed");
		case "F":
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your bills" + bills);
	}

}
