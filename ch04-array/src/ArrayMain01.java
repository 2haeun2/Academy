public class ArrayMain01 {
	public static void main(String[] args) {
		//�迭 ����
		char[] ch;
		//�迭 ����
		ch = new char[4];
		//�迭�� �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//�迭�� ���(�迭�� ����� ������) ���
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("--------------");
		
		//�ݺ����� �̿��� �迭�� ��� ���
		              //�迭�� ����(4)
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"]:" + ch[i]);
		}
		System.out.println("--------------");
		
		//�迭 ���� �� ����
		int it[] = new int[6];
		//int[] it = new int[6];

		//�迭 ���� �� ����(����� �迭 ����), �ʱ�ȭ
		char[] ch2 = new char[] {'J','a','v','a'};
		
		//�迭 ���� �� ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		char[] ch3 = {'��','��'};
		
	}
}










