package work06;
import java.util.Scanner;
public class practice03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		double avg=0.0;
				for(int i=1;i<=5;i++){
			System.out.println("请输入周"+i+"学习的时间");
			int time= input.nextInt();
			sum=sum+time;
		}avg=sum/5;
		System.out.println("周一到周五的每日平均学习时间是："+avg);
		

	}
	
}
