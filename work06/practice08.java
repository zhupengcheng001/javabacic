package work06;
import java.util.Scanner;
public class practice08 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int num=input.nextInt();
		int i=2;
		for(;i<num;i++){
			if(num==2){
				System.out.println("������������");
				break;
			}
			if(num%i==0){
				System.out.println("��������������");
				break;
			}else{
				System.out.println("������������");
				break;
			}
			
			
		}

	}

}
