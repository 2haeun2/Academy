public class ArrayMain02 {
	public static void main(String[] args) {
		//�迭 ���� �� ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		int[] score = {100,88,88,100,90};//length=5
		int sum = 0; //����
		float avg = 0.0f; //���
		
		//�ݺ����� �̿��� ���� ���ϱ�
		             //�迭�� ����(5)
		for(int i=0;i<score.length;i++) {
			//����
			sum += score[i];
		}
		
		//��� ���ϱ�
		avg = sum / (float)score.length;
		
		System.out.printf("���� : %d%n", sum);
		System.out.printf("��� : %.2f", avg);
		
		
	}
}

