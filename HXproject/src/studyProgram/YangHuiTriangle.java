package studyProgram;

import java.util.Scanner;

public class YangHuiTriangle {
  private static Scanner input;
    public static void main(String[] args) {
//�ǵݹ�ķ�����		
    	System.out.println("��������Ҫ��ӡ������ǵ�������");
		input = new Scanner(System.in);
		int line = input.nextInt();
		int length = line;
		int arr[][] = new int[length][];
		// ������ά����
		for (int i = 0; i < arr.length; i++) {
			// ȷ����ά����Ԫ�صĴ�С
			arr[i] = new int[i + 1];
			// ��ӡ�ո�
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.print("  ");
			}
			// ����һά����
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || arr[i].length - 1 == j) {
					// ����������ȫΪ 1
					arr[i][j] = 1;
				} else {
					// ����Ԫ�ص�����������֮��
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/**
 * �ݹ鷨��ӡ10��������ǣ�
  public  static  int fun(int i,int j) {
    if(j == 1 || i == j) {
      return 1;
    }else {
      return fun(i-1,j)+fun(i-1,j-1);
    }
  }
  public static void main(String[] args) {
    int length = 10;    // ��ӡ������
    
    for (int i = 1; i <= length; i++) {
      
      // ��ӡ�ո�
      for (int j = 1; j <= length-i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.printf("%4d",fun(i,j));
      }
      System.out.println();
    }
  }
}
 */

