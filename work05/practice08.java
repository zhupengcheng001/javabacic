package work05;
import java.util.Scanner;
public class practice08 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		do
		{
			System.out.println("����������1-7(����0����)��");
			num=input.nextInt();
			switch(num){
			case 1 :
				System.out.println("������mon��");
				break;
			case 2:
				System.out.println("������tue��");
				break;
			case 3:
				System.out.println("������wed��");
				break;
			case 4:
				System.out.println("������tue��");
				break;
			case 5:
				System.out.println("������tue��");
				break;
			case 6:
				System.out.println("������sat��");
				break;
			case 7:
				System.out.println("������sun��");
				break;
				
			}
		}while(num!=0);
			System.out.println("��������");
		
	}
}

