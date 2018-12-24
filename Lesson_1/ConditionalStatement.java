public class ConditionalStatement {
	public static void main(String[] args) {
		byte myAge = 30;
		boolean sex = true; // мужской это тру
		float height = 1.86f;
		String name = "Vladimir";

		if (myAge > 20) {
			System.out.println(myAge +"> 20");
		}	

		if (sex) {
			System.out.println("male");
		} else {
			System.out.println("female");
		}

		if (height < 1.80) {
			System.out.println("shortone");
		} else {
			System.out.println("tallone");
		}


		if (name.charAt(0) == 'M') {
			System.out.println("M");
		} else if (name.charAt(0) == 'Y'){
			System.out.println("Y");
		} else {
			System.out.println(name);
		}


	}
}