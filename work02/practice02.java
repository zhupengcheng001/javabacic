package work02;
public class practice02 {
	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
		double score = (int)finalPay*3/100;
		System.out.println("-------------*消费单*-------------");
		System.out.println("购买物品\t\t\t单价\t\t\t个数\t\t\t金额");
		System.out.println("T恤\t\t\t￥245\t\t\t2\t\t\t￥490");
		System.out.println("网球鞋\t\t\t￥570\t\t\t1\t\t\t￥570");
		System.out.println("网球拍\t\t\t￥320\t\t\t2\t\t\t￥320");
		System.out.println("\n\n");
		System.out.println("折扣：   8折");
		System.out.println("消费总金额：￥" + finalPay);
		System.out.println("实际缴费：￥1500.0");
		System.out.println("找钱：￥396.0");
		System.out.println("本次购物活的积分是："+ score);
		}
}
