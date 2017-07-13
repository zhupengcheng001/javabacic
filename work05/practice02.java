package work05;
import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		System.out.println("Myshopping购物管理系统>购物结算\n\n\n");
		System.out.println("\n**********************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t\t2.网球鞋\t\t3.网球拍");
		System.out.println("\n***********************************");
		String goodName="";
		double price = 0.0;
		int goodNo=0;
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".contentEquals(answer)){
			System.out.println("请输入商品编号：");
			goodNo=input.nextInt();
			switch(goodNo){
			case 1:
				goodName="T恤";
				price=245.0;
				break;
			case 2:
				goodName="网球鞋";
				price=570.0;
				break;
			case 3:
				goodName="网球拍";
				price=320.0;
				break;
			}
			System.out.println(goodName+"\t"+price);
			System.out.println("是否继续(y/n)");
			answer=input.next();
		}
		System.out.println("程序结束");
		
				

	}

}

