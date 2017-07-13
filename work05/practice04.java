package work05;
import java.util.Scanner;
public class practice04 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println("欢迎使用myshopping管理系统\n\n");
		System.out.println("\n******************************");
		System.out.println("1.客户信息管理\n");
		System.out.println("2.购物结算\n");
		System.out.println("3.真情回馈\n");
		System.out.println("4.注销\n");
		System.out.println("********************************\n\n\n\n");
	    System.out.println("请选择：");
	   
		Boolean isRight=true;
		
		do{
			int num=input.nextInt();
			switch(num){
	
			case 1:
				System.out.println("执行客户信息管理");
				break;
			case 2:
				System.out.println("执行购物结算");
				break;
			case 3:
				System.out.println("执行真情回馈");
				break;
			case 4:
				System.out.println("执行注销");
				break;
				default:
					System.out.println("输入错误请重新输入:");
					isRight=false;
					break;
				
			}
		}while(isRight==false);input.close();
				
			}
		
}
