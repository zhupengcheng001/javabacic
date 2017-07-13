package work05;
import java.util.Scanner;
public class practice07 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i =input.nextInt();
		int max=i;
		int min=i;
		while(i!=0){
			System.out.println("请输入一个整数：");
			i=input.nextInt();
			if(i>max){
				max=i;
			}if(i<min&&i!=0){
				min=i;
			}if(i==0){
				System.out.println("最大值为"+max+"最小值为"+min);
				break;
			}
		}
		
		
		
		
		
		
		
		}
		
	}


