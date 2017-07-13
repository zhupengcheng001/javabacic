package work05;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] args){
		System.out.println("Myshopping购物管理系统>购物结算\n\n\n");
		System.out.println("\n**********************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t\t2.网球鞋\t\t3.网球拍");
		System.out.println("\n***********************************");
		Scanner input = new Scanner(System.in);
		String name="";
		double price=0.0;
		double total=0;
		double total1=0;
		int no=0;
		int amount =0;
		double discount=0.8;
	    double payment=0.0;
		String answer="y";
		while("y".equals(answer)){
			System.out.println("请输入商品编号：");
			no=input.nextInt();
			System.out.println("请输入购买数量：");
			amount=input.nextInt();
			switch(no){
			case 1:
				name="T恤";
				total=amount*245;
				price=245.0*0.8;
				System.out.println("T恤￥245\t\t"+amount+"\t\t"+total);
				break;
			case 2:
				name="网球鞋";
				total=amount*570;
				price= 570.0*0.8;
				System.out.println("网球鞋￥570\t\t"+amount+"\t\t"+total);
				break;
			case 3:
				name="网球拍";
				total=amount*320;
				price=320.0*0.8;
				System.out.println("网球拍￥320\t\t"+amount+ "\t\t"+total);
				break;
				default:
					System.out.println("输入有误");
					break;
					
			}total1=total+total1;
			System.out.println("是否继续(y/n)");
			answer =input.next();
			
			
			
			}
		System.out.println("折扣0.8");
		System.out.println("应付金额"+(total1*0.8));
		System.out.println("实付金额:");
		double money=input.nextDouble();
		System.out.println("找零"+(money-(total1*0.8)));
	}
}