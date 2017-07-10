package work03;

import java.util.Scanner;

public class practice07 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你出行的月份：");
		int price = 5000;
		int mon = input.nextInt();
		System.out.print("请问你选择头等舱还是经济舱？头等舱输入1，经济舱输入2：");
		String cab = input.next();
		if (mon >= 4 && mon <= 10) {

			if (cab.contentEquals("1")) {
				double pri = price * 0.9;
				System.out.print("您的机票价格：" + pri);

			} else {
				double pri = price * 0.8;
				System.out.print("您的机票价格：" + pri);
			}

		} else {

			if (cab.contentEquals("1")) {
				double pri = price * 0.5;
				System.out.print("您的机票价格：" + pri);

			} else {
				double pri = price * 0.4;
				System.out.print("您的机票价格：" + pri);

			}

		}
		input.close();
	}
}
