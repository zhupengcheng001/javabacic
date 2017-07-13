package work05;

/*public class practice10 {

	public static void main(String[] args) {
		int i=10;
		int sum=1;
		while(i<=10&&i>=1){
			sum=sum*i;
			i--;
		}System.out.println(sum);
	}

}*/
public class practice10{
	public static void main(String[] args){
		int i=10;
		int sum=1;
		do{
			sum=sum*i;
			i--;
		}while(i<=10&&i>=1);
		System.out.println(sum);
	}
}
