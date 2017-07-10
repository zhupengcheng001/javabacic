package work03;

import java.util.Scanner;

public class practice06 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入刘珊珊的成绩:");
		int score = input.nextInt();
		if (score >= 100) {
			System.out.println("爸爸买车");

		} else if (score >= 90) {
			System.out.println("妈妈买笔记本");

		} else if (score >= 60) {
			System.out.println("妈妈买手机");

		} else {
			System.out.println("没有礼物");
		}
		input.close();
	}
}
