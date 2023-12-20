package kr.s07.array;

public class ScoreMain {
	public static void main(String[] args) {
		//�迭 ����, �迭�� ���� 4
		Score[] scoreArray = new Score[4];
		
		int total = 0; //��(4��) ��ü ����
		int avg = 0; //��(4��) ��ü ������ ���

		//Score ��ü�� 4�� �����ؼ� �迭�� ����
		scoreArray[0] = new Score("ȫ�浿",98,96,88);
		scoreArray[1] = new Score("�̼���",99,72,82);
		scoreArray[2] = new Score("�念��",97,83,81);
		scoreArray[3] = new Score("������",86,66,83);
		
		//�ݺ����� �̿��ؼ� �迭�� �����ؼ� ��ü�� �����͸� �б�
		for(int i=0;i<scoreArray.length;i++) {
			System.out.printf("%s\t",scoreArray[i].getName());
			System.out.printf("%d\t", scoreArray[i].getKorean());
			System.out.printf("%d\t", scoreArray[i].getEnglish());
			System.out.printf("%d\t", scoreArray[i].getMath());
			System.out.printf("%d\t", scoreArray[i].makeSum());
			System.out.printf("%d\t", scoreArray[i].makeAvg());
			System.out.printf("%s\n", scoreArray[i].makeGrade());
			
			//��ü ����
			total += scoreArray[i].makeSum();
		}
		//��ü ���
		avg = total / (scoreArray.length * 3);
		
		//�� ��ü ����,��� ���
		System.out.printf("��ü ���� : %d, ��ü ��� : %d", total, avg);
	}
}



