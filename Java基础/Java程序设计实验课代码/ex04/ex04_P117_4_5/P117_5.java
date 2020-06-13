package ex04_P117_4_5;

public class P117_5 {

//(1)缺少return
//原题如下：
//  int mb_divide(int x,int y) {
//	  int result;
//	  if(y==0)
//		  result = 0;
//	  else
//		  result = x / y;
//  }
//改法一：（不规范）
//      int mb_divide(int x, int y) {
//		int result;
//		if (y == 0)
//			return result = 0;
//		else
//			return result = x / y;
//	}
	int mb_divide(int x, int y) {
		if (y == 0)
			return 0;
		else
			return x / y;
	}

//(2)函数后面多了一个分号
//原题如下：
//	  void mb_output(int x);
//	  {
//		  System.out.println(x);
//	  }
	void mb_output(int x) {
		System.out.println(x);
	}

//(3)函数之间不能嵌套
//原题如下：
//	  void mb_outputSquare(int x) {
//		  System.out.println("x = "+ x);
//	  void mb_outputSquare(int x) {
//		  System.out.println("x * x = "+ x * x);
//	  }
//	  }
	void mb_outputSquare(int x) {
		System.out.println("x = " + x);
		System.out.println("x * x = " + x * x);
	}

//(4)变量定义出错，且语句块啰嗦
//原题如下：
//	  void mb_fun(int x) {
//		  System.out.println("x = "+ x);
//		  int x = x * x;
//		  System.out.println("x * x = "+ x * x);
//		  {
//			  int x = x * x* x;
//			  System.out.println("x * x * x = "+ x * x * x);
//		  }
//	  }
	void mb_fun(int x) {
		System.out.println("x = " + x);
		int y = x * x;
		System.out.println("x * x = " + y);
		// {
		int z = x * x * x;
		System.out.println("x * x * x = " + z);
		// }
	}

}
