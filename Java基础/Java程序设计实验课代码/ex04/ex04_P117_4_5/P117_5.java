package ex04_P117_4_5;

public class P117_5 {

//(1)ȱ��return
//ԭ�����£�
//  int mb_divide(int x,int y) {
//	  int result;
//	  if(y==0)
//		  result = 0;
//	  else
//		  result = x / y;
//  }
//�ķ�һ�������淶��
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

//(2)�����������һ���ֺ�
//ԭ�����£�
//	  void mb_output(int x);
//	  {
//		  System.out.println(x);
//	  }
	void mb_output(int x) {
		System.out.println(x);
	}

//(3)����֮�䲻��Ƕ��
//ԭ�����£�
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

//(4)����������������醪��
//ԭ�����£�
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
