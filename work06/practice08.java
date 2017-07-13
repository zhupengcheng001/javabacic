package work06;
import java.util.Scanner;
public class practice08 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num=input.nextInt();
		int i=2;
		for(;i<num;i++){
			if(num==2){
				System.out.println("该数是质数！");
				break;
			}
			if(num%i==0){
				System.out.println("该数不是质数！");
				break;
			}else{
				System.out.println("该数是质数！");
				break;
			}
			
			
		}

	}

}
