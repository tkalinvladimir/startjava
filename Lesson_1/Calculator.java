public class Calculator {
	public static void main(String[] args) {
		int x = 2;
		int y = 10;
		char operation = '^'; // - * / ^ %

		if (operation == '+') {
			System.out.println(x+y);
		} else if (operation == '-') {
			System.out.println(x-y); 
		} else if (operation == '*') {
			System.out.println(x*y); 
		} else if (operation == '/') {
			System.out.println(x/y); 
		} else if (operation == '%') {
			System.out.println(x%y); 
		} else if (operation == '^') {
			
			int res = 1;
			for (int i = 0; i <y; i++) {
				res = res*x;
			}
			System.out.println(res); 
		
		}
	}
}