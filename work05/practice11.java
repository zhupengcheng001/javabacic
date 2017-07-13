package work05;

/*public class practice11 {

	public static void main(String[] args) {
		double i =0.0008;
		int count=0;
		while(i<=8848.13){
			i=i*2;
			count++;
			
		}System.out.println(count);
		

	}

}*/
public class practice11{
	public static void main(String[] args){
		double i=0.0008;
		int count=0;
		do{
			i=i*2;
			count++;
		}while(i<=8848.13);
		System.out.println(count);
	}
}
