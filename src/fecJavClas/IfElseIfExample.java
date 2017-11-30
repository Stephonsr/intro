package fecJavClas;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = 80;
		if (weight < 50) {
			System.out.println("Fail");
		} 
		else if (weight >= 50 && weight < 60) {
			System.out.println("Light");
		} else if (weight >= 60 && weight < 70) {
			System.out.println("Semi light");
		} else if (weight >= 70 && weight < 80) {
			System.out.println("Medium");
		} else if (weight >=80 && weight < 90) {
			System.out.println("Heavy");
		} else if (weight >= 90 && weight < 100) {
			System.out.println("Super heavy");
		} else {
			System.out.println("invalid");
		}

	}

}
