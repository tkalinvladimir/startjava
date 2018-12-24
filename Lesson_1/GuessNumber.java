public class GuessNumber {
		public static void main(String[] args) {
			int comp_num = 50;
			int user_num = 0;

			while(true) {	
				if (user_num == comp_num) {
					System.out.println("You guessed!");
					break;
				} else if (user_num > comp_num) {
					System.out.println("Your number is bigger");
					user_num--;
				} else if (user_num < comp_num) {
					System.out.println("Your number is smaller");
					user_num++;
				}
			}
		System.out.println("You win!");
	}
}