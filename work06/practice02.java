package work06;
import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Myshopping管理系统>客户信息管理>添加客户信息");
		int num=0;
		String birth;
		int score=0;
		for(int i=1;i<=3;i++){
			System.out.println("请输入会员号<4位整数>：");
			num=input.nextInt();
			System.out.println("请输入会员生日<月/日两位整数表示>：");
			birth=input.next();
			System.out.println("请输入会员积分：");
			score=input.nextInt();
			if(score<=999||score>=10000){
				System.out.println("输入错误！");
				continue;
				
				
			}
			System.out.println("您输入的会员信息为：");
			System.out.println(num+"\t\t"+birth+"\t\t"+score);
		}
		System.out.println("程序结束！");

	}

}
