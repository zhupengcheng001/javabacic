package work05;
import java.util.Scanner;
public class practice08 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		do
		{
			System.out.println("请输入数字1-7(输入0结束)：");
			num=input.nextInt();
			switch(num){
			case 1 :
				System.out.println("今天是mon！");
				break;
			case 2:
				System.out.println("今天是tue！");
				break;
			case 3:
				System.out.println("今天是wed！");
				break;
			case 4:
				System.out.println("今天是tue！");
				break;
			case 5:
				System.out.println("今天是tue！");
				break;
			case 6:
				System.out.println("今天是sat！");
				break;
			case 7:
				System.out.println("今天是sun！");
				break;
				
			}
		}while(num!=0);
			System.out.println("输入有误");
		
	}
}

