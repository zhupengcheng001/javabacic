package work05;
/*import java.util.Scanner;

public class practice13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		int i = 0;
		while (num != 0) {
			i = num % 10;
			System.out.print(i);
			num = num / 10;
		}

	}

}*/
import java.util.Scanner;

public class practice13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num=input.nextInt();
		int i=0 ;
		do{
			i = num % 10;
			System.out.print(i);
			num = num / 10;
		}while(num!=0);
	}
}