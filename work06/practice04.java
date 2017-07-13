package work06;

public class practice04 {

	public static void main(String[] args) {
		int chook=0;
		int rabbit=35;
		for(;chook>=0&&chook<=35;chook++,rabbit--){
			if(chook+rabbit==35&&2*chook+4*rabbit==94){
				break;
			}
		}System.out.println(+chook+"\t"+rabbit);
		
	}

}
