package studyProgram;

/**
 * 
 * @contend����ѭ����ӡͼ��
 *  @author�� ���� 
 *  @time�� 2020��2��19������8:22:47
 */
public class Printdrawin {
	public static void main(String[] args) {
		/*
		 * ֪ʶҪ�㣺
		 * �У��С���˫ѭ����
		 * ��ѭ�������У��������������ƻ��У�ע�⣺����һ������ѭ������������Ŷ��
		 * ��ѭ�������У����������������д�ӡ���ķ��ţ�ע�⣺ֻ�ܴ�ӡ���ţ���Ҫ���У�
		 * һ�����У����趨��Ϊ��i������ʾ�У����趨��Ϊ��j�������ֵ����j<=(��i�Ĺ�ϵʽ����ʾ�����ֱ��ҵ�i��j���߼�����ϵ��
		 * i��jһ����߼����Ǵ�0��ʼ��0�����һ��/�У��������� ���ò�ֵ�֪ʶ���ɽ�ͼ�β�ֳ������Σ�ͨ���������ӡ��
		 *����������ʱ����ֱ��copy�������εĴ��룬��i����ʼֵ�任���Լ�ѭ�������䣬i--���ɣ�
		 */
	
	// ͼ��1�������Ǻ�����
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // ����ո���Ǻţ�
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0||j==2*i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // ����ո���Ǻţ�
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j ==0 || j ==4 - 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		System.out.println();
		
	// ͼ��2��ʵ���Ǻ�����
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
		
		// ͼ��3��ʵ���Ǻ�����
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j <= 2 - i; j++) {
						System.out.print(" ");
					} // ����ո���Ǻţ�
					for (int j = 0; j <= 2 * i; j++) {
						if(j==3&&i==j)
							System.out.print("+");
						else
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
     
	//ͼ��4���ظ���ĸ������
		char letters = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // ����ո����ĸ��
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char) (letters + i));
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // ����ո����ĸ��
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print((char) (letters + i));
			}
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		System.out.println();
      
	 //ͼ��5��˳����ĸ������	
		char letters2 = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // ����ո���Ǻţ�
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char) (letters2));
			}
			letters2++;
			System.out.println();// ������ʱ�ſ��ƻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // ����ո����ĸ��
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print((char) (letters2));
			}
			letters2++;
			System.out.println();// ������ʱ�ſ��ƻ���
		}
	}
}
