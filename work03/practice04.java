package work03;
import java.util.Scanner;
public class practice04 {
	public static void main(String[]ages){ 
		Scanner input=new Scanner(System.in); 
		System.out.print("请输入会员积分："); 
		int score=input.nextInt();
			 if(score>=8000){
				 System.out.println("该会员享受的折扣是：六折"); 
				 }else if(score<8000&&score>=4000){
					 System.out.println("该会员享受的折扣是：七折"); 
					 }else if(score<4000&&score>=2000){ 
						 System.out.println("该会员享受的折扣是：八折"); 
						 }else{
							 System.out.println("该会员享受的折扣是九折"); 
							 } 
			 input.close(); 
			 } 
	}

