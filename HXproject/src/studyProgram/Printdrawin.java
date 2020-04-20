package studyProgram;

/**
 * 
 * @contend：用循环打印图案
 *  @author： 何翔 
 *  @time： 2020年2月19日下午8:22:47
 */
public class Printdrawin {
	public static void main(String[] args) {
		/*
		 * 知识要点：
		 * 行，列——双循环；
		 * 外循环控制行；控制行数；控制换行；注意：换行一般在内循环结束出来后换哦！
		 * 内循环控制列；控制列数；控制列打印出的符号；注意：只能打印符号，不要换行！
		 * 一般用行（假设定义为：i）来表示列（假设定义为：j）的最大值（用j<=(含i的关系式）表示）；分别找到i和j的逻辑及关系；
		 * i，j一般的逻辑都是从0开始，0代表第一行/列（的数）； 运用拆分的知识，可将图形拆分成三角形（通常情况）打印；
		 *打倒三角形是时可以直接copy正三角形的代码，把i的起始值变换，以及循环条件变，i--即可！
		 */
	
	// 图形1：空心星号菱形
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // 打完空格打星号；
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0||j==2*i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();// 外层结束时才控制换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // 打完空格打星号；
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j ==0 || j ==4 - 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();// 外层结束时才控制换行
		}
		System.out.println();
		
	// 图形2：实心星号菱形
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
		
		// 图形3：实心星号菱形
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j <= 2 - i; j++) {
						System.out.print(" ");
					} // 打完空格打星号；
					for (int j = 0; j <= 2 * i; j++) {
						if(j==3&&i==j)
							System.out.print("+");
						else
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
     
	//图形4：重复字母型菱形
		char letters = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // 打完空格打字母；
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char) (letters + i));
			}
			System.out.println();// 外层结束时才控制换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // 打完空格打字母；
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print((char) (letters + i));
			}
			System.out.println();// 外层结束时才控制换行
		}
		System.out.println();
      
	 //图形5：顺序字母型菱形	
		char letters2 = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			} // 打完空格打星号；
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char) (letters2));
			}
			letters2++;
			System.out.println();// 外层结束时才控制换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			} // 打完空格打字母；
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print((char) (letters2));
			}
			letters2++;
			System.out.println();// 外层结束时才控制换行
		}
	}
}
