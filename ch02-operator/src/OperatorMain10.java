public class OperatorMain10 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� �� ����
		 * ���� �� �ְ�, ���������� �� ���� �������� ���Ͻÿ�.
		 * 
		 * [��³���]
		 * �л� �� ���� ������ ���� �� : ?
		 * ���� ���� �� : ?
		 */
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int quantity = pencils / students;
		System.out.println("�л� �� ���� ������ ���� �� : " + quantity);
		
		//���� ���ʼ�
		int rest = pencils % students;
		System.out.println("���� ���ʼ� : " + rest);
		
	}
}




