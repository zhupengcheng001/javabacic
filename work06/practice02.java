package work06;
import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Myshopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		int num=0;
		String birth;
		int score=0;
		for(int i=1;i<=3;i++){
			System.out.println("�������Ա��<4λ����>��");
			num=input.nextInt();
			System.out.println("�������Ա����<��/����λ������ʾ>��");
			birth=input.next();
			System.out.println("�������Ա���֣�");
			score=input.nextInt();
			if(score<=999||score>=10000){
				System.out.println("�������");
				continue;
				
				
			}
			System.out.println("������Ļ�Ա��ϢΪ��");
			System.out.println(num+"\t\t"+birth+"\t\t"+score);
		}
		System.out.println("���������");

	}

}
