public class ArrayMain03 {
	public static void main(String[] args) {
		//�迭�� ���� �� ����, �ʱ�ȭ
		int[] score = {79,88,91,33,100,55,95}; //length=7
		             //0   1 2  3  4   5   6
		
		int max = score[0]; //�迭�� ù��° ������ �ִ밪�� �ʱ�ȭ
		int min = score[0]; //�迭�� ù��° ������ �ּҰ��� �ʱ�ȭ
		
		for(int i=1;i<score.length;i++) {
			//�ִ밪 ���ϱ�
			if(score[i] > max) {
				max = score[i];
			}
			//�ּҰ� ���ϱ�
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		//�ִ밪�� �ּҰ� ���
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}
}




