package work05;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] args){
		System.out.println("Myshopping�������ϵͳ>�������\n\n\n");
		System.out.println("\n**********************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t\t2.����Ь\t\t3.������");
		System.out.println("\n***********************************");
		Scanner input = new Scanner(System.in);
		String name="";
		double price=0.0;
		double total=0;
		double total1=0;
		int no=0;
		int amount =0;
		double discount=0.8;
	    double payment=0.0;
		String answer="y";
		while("y".equals(answer)){
			System.out.println("��������Ʒ��ţ�");
			no=input.nextInt();
			System.out.println("�����빺��������");
			amount=input.nextInt();
			switch(no){
			case 1:
				name="T��";
				total=amount*245;
				price=245.0*0.8;
				System.out.println("T����245\t\t"+amount+"\t\t"+total);
				break;
			case 2:
				name="����Ь";
				total=amount*570;
				price= 570.0*0.8;
				System.out.println("����Ь��570\t\t"+amount+"\t\t"+total);
				break;
			case 3:
				name="������";
				total=amount*320;
				price=320.0*0.8;
				System.out.println("�����ģ�320\t\t"+amount+ "\t\t"+total);
				break;
				default:
					System.out.println("��������");
					break;
					
			}total1=total+total1;
			System.out.println("�Ƿ����(y/n)");
			answer =input.next();
			
			
			
			}
		System.out.println("�ۿ�0.8");
		System.out.println("Ӧ�����"+(total1*0.8));
		System.out.println("ʵ�����:");
		double money=input.nextDouble();
		System.out.println("����"+(money-(total1*0.8)));
	}
}