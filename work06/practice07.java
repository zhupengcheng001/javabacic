package work06;

public class practice07 {

	public static void main(String[] args) {
		int i=100;
		for(;i>=100&&i<=999;i++){
			if(i==(i/100%10)*(i/100%10)*(i/100%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)){
				System.out.println(i);
			}
			
		}
		

	}

}
