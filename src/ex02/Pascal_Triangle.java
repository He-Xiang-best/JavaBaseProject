package ex02;
/**
 * @contend：用循环打印图案
 *  @author： 何翔 
 *  @time： 2020年4月21日下午3:37:47
 */
public class Pascal_Triangle {
	public static void main(String[] args) {
		
	// 图形：实心星号菱形
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // 打完空格打星号；
			for (int j = 0; j <= 2 * i; j++) {
					System.out.print("*");
			}
			System.out.println();// 外层结束时才控制换行
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // 打完空格打星号；
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();// 外层结束时才控制换行
		}
		System.out.println();
      
	}
}
