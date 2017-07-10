package work02;

public class practice05 {
	public static void main(String[] args){
		int leftx = 10;
		int righty = 8;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手手中的纸牌：" + leftx);
		System.out.println("右手手中的纸牌："+ righty);
		System.out.println("\n\n\n");
		int z;
		z = righty;
		righty = leftx;
		leftx = z;
		
		System.out.println("输出互换后手中的纸牌：");
		System.out.println("左手手中的纸牌：" + leftx);
		System.out.println("右手手中的纸牌："+ righty);
		
	}
}
