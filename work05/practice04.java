package work05;
import java.util.Scanner;
public class practice04 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println("��ӭʹ��myshopping����ϵͳ\n\n");
		System.out.println("\n******************************");
		System.out.println("1.�ͻ���Ϣ����\n");
		System.out.println("2.�������\n");
		System.out.println("3.�������\n");
		System.out.println("4.ע��\n");
		System.out.println("********************************\n\n\n\n");
	    System.out.println("��ѡ��");
	   
		Boolean isRight=true;
		
		do{
			int num=input.nextInt();
			switch(num){
	
			case 1:
				System.out.println("ִ�пͻ���Ϣ����");
				break;
			case 2:
				System.out.println("ִ�й������");
				break;
			case 3:
				System.out.println("ִ���������");
				break;
			case 4:
				System.out.println("ִ��ע��");
				break;
				default:
					System.out.println("�����������������:");
					isRight=false;
					break;
				
			}
		}while(isRight==false);input.close();
				
			}
		
}
