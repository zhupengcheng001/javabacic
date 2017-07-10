package work03;
import java.util.Scanner;
public class practice02 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in); 
		System.out.println("我行我素购物管理系统>客户管理信息>添加客户信息");
			 System.out.print("\n请输入会员号<4位整数>:"); 
			 int custNo = input.nextInt();
			  System.out.print("请输入会员生日（月/日用两位数字表示）："); 
			  String custBirth = input.next();
			  System.out.print("请输入积分："); 
			  int custScore = input.nextInt(); 
			  if (custNo >=1000 && custNo < 10000) {
				  System.out.println("已录入的会员消息：" + "\n" + custNo +"\t" + custBirth + "\t" + custScore); 
				  } else { System.out.println("信息录入失败");
			  } 
			  input.close();
			  } 
	}

