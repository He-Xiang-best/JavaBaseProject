package ex02;
/**
 * @contend����ѭ����ӡͼ��
 *  @author�� ���� 
 *  @time�� 2020��4��21������3:37:47
 */
public class Pascal_Triangle {
	public static void main(String[] args) {
		
	// ͼ�Σ�ʵ���Ǻ�����
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // ����ո���Ǻţ�
			for (int j = 0; j <= 2 * i; j++) {
					System.out.print("*");
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // ����ո���Ǻţ�
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		System.out.println();
      
	}
}
