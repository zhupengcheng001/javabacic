package work06;
import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int young=0;
		int age=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"λ�˿͵����䣺");
			age=input.nextInt();
			if((age>0)&&(age<30)){
				young++;
			}
		}
		System.out.println("30�����µ�����ı���Ϊ��"+young/10.0);
		System.out.println("30�����ϵ�����ı���Ϊ��"+(1-(young/10.0)));

	}

}
