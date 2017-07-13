package work06;

public class practice05 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println(i+"flip");
			}if(i%5==0){
				System.out.println(i+"flop");
			}if(i%3==0&&i%5==0){
				System.out.println(i+"flipflop");
			}if(i%3!=0&&i%5!=0&&(i%3!=0&&i%5!=0)){
				System.out.println(i);
				continue;
			}
		}

	}

}
