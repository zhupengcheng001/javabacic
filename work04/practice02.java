/*package work04;
import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		int money = input.nextInt();
		System.out.println("是否参加换购活动？");
		System.out.println("1.满50元，加2元换购百事可乐一瓶");
		System.out.println("2.满100元，加3元换购百事可乐500ml一瓶");
		System.out.println("3.满100元，加10元换购5kg面粉");
		System.out.println("4.满200元，加10元换购一个苏泊尔炒菜锅");
		System.out.println("5.满200元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("0.不换购");
		System.out.println("请选择：");
		int num = input.nextInt();
		if (money >= 200) {
			switch (num) {
			case 4:
				System.out.println("本息消费总金额：" + (money + 10));
				break;
			case 5:
				System.out.println("本次消费总金额：" + (money + 20));
				break;
				default:
					System.out.println("本次消费总金额：" + (money));
					break;
			}
		} else if (money >= 100) {
			switch (num) {
			case 2:
				System.out.println("本次消费总金额：" + (money + 3));
				break;
			case 3:
				System.out.println("本次消费总金额：" + (money + 10));
				break;
				default:
				System.out.println("本次消费总金额：" + (money));
			}
		} else if (money >= 50) {
			switch (num) {
			case 1:
				System.out.println("本次消费总金额：" + (money + 2));
				break;
				default:
				System.out.println("本次消费总金额：" + (money));
			}
		} 
	}

}*/
	


