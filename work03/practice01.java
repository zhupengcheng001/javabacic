package work03;
import java.util.Scanner;
public class practice01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素管理系统>幸运抽奖");
		System.out.println("\n请输入四位会员号:");
		int custNo = input.nextInt();
		int baiwei = custNo / 100 % 10;
		int random = (int) (Math.random() * 10);
		if (baiwei == random) {
			System.out.println(custNo + "客户是幸运用户，获得精美Mp3一个");
		} else {
			System.out.println(custNo + "客户，谢谢你的支持");
		}
		input.close();
	}

}
