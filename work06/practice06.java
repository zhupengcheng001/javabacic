package work06;

public class practice06 {

	public static void main(String[] args) {
		int man = 0;// ����
		int woman = 0;// Ů��
		int kids = 0;// ������
		for (man = 0; man <= 10; man++) {
			for (kids = 0; kids <= 30; kids++) {
				woman = 30 - man - kids;// һ��30��
				if (man * 3 + woman * 2 + kids == 50) {// һ������50
					System.out.println("�У�" + man + " " + "Ů��" + woman + " " + "���ӣ�" + kids);
					continue;// �����ж������ Ҳ�ɲ�д
				}
			}
		}
	}
}
