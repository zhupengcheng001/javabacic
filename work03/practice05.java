package work03;

import java.util.Scanner;

public class practice05 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("在键盘输入一个整数:");
		int integer = input.nextInt();
		if (integer % 3 == 0 || integer % 5 == 0) {
			System.out.println("该整数是3或5的倍数");
		} else {
			System.out.println("该数不可以被3或5任何一个数整除");
		}
		input.close();
	}
}
