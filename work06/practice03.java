package work06;
import java.util.Scanner;
public class practice03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		double avg=0.0;
				for(int i=1;i<=5;i++){
			System.out.println("��������"+i+"ѧϰ��ʱ��");
			int time= input.nextInt();
			sum=sum+time;
		}avg=sum/5;
		System.out.println("��һ�������ÿ��ƽ��ѧϰʱ���ǣ�"+avg);
		

	}
	
}
