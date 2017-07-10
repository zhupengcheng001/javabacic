package work03;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入是否是会员：是（y）/否（其他字符）");
		String ans = input.next();
		System.out.print("购物金额:");
		double money = input.nextDouble();
		if (ans.equals("y")) {
			if (money >= 200) {
				double pay = money * 0.75;
				System.out.println("实际支付:" + pay);
			} else {
				double pay = money * 0.8;
				System.out.println("实际支付：" + pay);
			}
		} else {
			if (money > 100) {
				double pay = money * 0.9;
				System.out.println("实际支付：" + pay);
			} else {
				double pay = money;
				System.out.println("实际支付" + pay);
			}
			input.close();
		}
	}
}

