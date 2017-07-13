package work06;

public class practice10 {

	public static void main(String[] args) {
		int i = 0;
		int j = 7;
		int count = 1;
		for (; i >= 0; count++) {
			i = i + 3;

			i = i - 2;

			if (i + 3 > 7) {
				break;
			}

		}
		System.out.println("第" + count + "天跳出了井");

	}

}
