public class ArrayMain04 {
	public static void main(String[] args) {
		//�迭 ���� �� ����, �ʱ�ȭ
		int[] array = {10,20,30,40,50};
		
		//�ݺ����� �̿��� ����� ���
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:" + array[i]);
		}
		System.out.println("==============");
		
		//������ ����(Ȯ�� for��)
		//num : �迭�� ���(����� ������)�� �о�ͼ� ������ ����             
		//array: �迭�� 
		for(int num : array) {
			System.out.print(num + "\t");
		}
	}
}





