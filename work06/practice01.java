package work06;
import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int young=0;
		int age=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"位顾客的年龄：");
			age=input.nextInt();
			if((age>0)&&(age<30)){
				young++;
			}
		}
		System.out.println("30岁以下的年龄的比例为："+young/10.0);
		System.out.println("30岁以上的年龄的比例为："+(1-(young/10.0)));

	}

}
