package work06;

public class practice06 {

	public static void main(String[] args) {
		int man = 0;// 男数
		int woman = 0;// 女数
		int kids = 0;// 孩子数
		for (man = 0; man <= 10; man++) {
			for (kids = 0; kids <= 30; kids++) {
				woman = 30 - man - kids;// 一共30人
				if (man * 3 + woman * 2 + kids == 50) {// 一共花了50
					System.out.println("男：" + man + " " + "女：" + woman + " " + "孩子：" + kids);
					continue;// 可能有多种情况 也可不写
				}
			}
		}
	}
}
