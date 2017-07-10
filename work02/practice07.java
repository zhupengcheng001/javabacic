package work02;
import java.util.Scanner;
public class practice07 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请存入本金：");
		double captital = input.nextDouble();
		double firstyearCaptital = captital*1.0225;
		double secondyearCaptital = captital*0.027*2+captital;
		double thirdyearCaptital = captital*0.0324*3+captital;
		double fifthyearCaptital = captital*0.036*5+captital;
		System.out.println("本金为："+captital);
		System.out.println("存取一年后的本息为："+firstyearCaptital);
		System.out.println("存取两年后的本息为："+secondyearCaptital);
		System.out.println("存取三年后的本息为："+thirdyearCaptital);
		System.out.println("存取五年后的本息为："+fifthyearCaptital);	
	}
}
