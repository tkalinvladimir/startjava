public class Cycle {
	public static void main(String[] args) {
		//1
		for (byte i = 0; i < 21; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2
		int i = 6;
		while (i > -7) {
			System.out.print(i+" ");
			i = i - 2;
		}
		System.out.println();
		//3
		int res = 0;
		for (byte j = 10; j <21; j++) {
			if (j%2==0) res = res + j;
		}
		System.out.println(res);

	}
}