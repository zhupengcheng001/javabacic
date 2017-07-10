package work04;
import java.util.Scanner;
public class practica06 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = input.nextInt();
		System.out.println("请选择运算符 + - * / ");
		char symbol = input.next().charAt(0);
		System.out.println("请输入第二个数");
		int num2 = input.nextInt();
		switch(symbol){
		case '+':
			System.out.println("计算结果："+(num1+num2));
			break;
		case '-':
			System.out.println("计算结果："+(num1-num2));
			break;
		case '*':
			System.out.println("计算结果："+(num1*num2));
			break;
		case '/':
			System.out.println("计算结果："+(num1/num2));
			break;
			default:
				System.out.println("请输入正确的数字");
				break;
				
		}
	}

}
