package work02;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] args) {
		int custNumb;
		System.out.println("请输入4位会员卡号：");
		Scanner input = new Scanner(System.in);
		custNumb = input.nextInt();
		int gewei = custNumb % 10;
		int shiwei = custNumb / 10 % 10;
		int baiwei = custNumb / 100 % 10;
		int qianwei = custNumb / 1000;
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("会员卡号;" + custNumb + "各位之和：" + sum);
		boolean isluck=sum>20;
		System.out.println("是幸运客户吗？" + isluck);
	}
}
