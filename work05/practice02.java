package work05;
import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		System.out.println("Myshopping�������ϵͳ>�������\n\n\n");
		System.out.println("\n**********************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t\t2.����Ь\t\t3.������");
		System.out.println("\n***********************************");
		String goodName="";
		double price = 0.0;
		int goodNo=0;
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".contentEquals(answer)){
			System.out.println("��������Ʒ��ţ�");
			goodNo=input.nextInt();
			switch(goodNo){
			case 1:
				goodName="T��";
				price=245.0;
				break;
			case 2:
				goodName="����Ь";
				price=570.0;
				break;
			case 3:
				goodName="������";
				price=320.0;
				break;
			}
			System.out.println(goodName+"\t"+price);
			System.out.println("�Ƿ����(y/n)");
			answer=input.next();
		}
		System.out.println("�������");
		
				

	}

}

