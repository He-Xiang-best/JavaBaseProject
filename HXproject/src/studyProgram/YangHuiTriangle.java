package studyProgram;

import java.util.Scanner;

public class YangHuiTriangle {
  private static Scanner input;
    public static void main(String[] args) {
//非递归的方法：		
    	System.out.println("请输入你要打印杨辉三角的行数：");
		input = new Scanner(System.in);
		int line = input.nextInt();
		int length = line;
		int arr[][] = new int[length][];
		// 遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			// 确定二维数组元素的大小
			arr[i] = new int[i + 1];
			// 打印空格
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.print("  ");
			}
			// 遍历一维数组
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || arr[i].length - 1 == j) {
					// 三角形两腰全为 1
					arr[i][j] = 1;
				} else {
					// 其他元素等于两肩数字之和
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/**
 * 递归法打印10行杨辉三角：
  public  static  int fun(int i,int j) {
    if(j == 1 || i == j) {
      return 1;
    }else {
      return fun(i-1,j)+fun(i-1,j-1);
    }
  }
  public static void main(String[] args) {
    int length = 10;    // 打印的行数
    
    for (int i = 1; i <= length; i++) {
      
      // 打印空格
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

