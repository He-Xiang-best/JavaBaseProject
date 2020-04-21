package ex02;
/**
 * @content:输入下列应用程序，了解如何从命令行中输入参数
                        应用程序中main方法的参数String类型的数组args能接受用户从命令行键入的参数
 * @author:04191315何翔
 * @time:2020年4月21日下午3:41:18
 */
public class Test_Three {

	public static void main(String args[]) {
		double n, sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Double.valueOf(args[i]).doubleValue();

		}
		n = sum / args.length;
		System.out.print("average" + n);
	}
}
/*
 注意：
1）	参数的个数可以利用args.length来取得
2）	参数“12.34” “34.45” “21212121”分别赋给了main方法的参数arges[0]、arges[1]  和arges[2]
3）	由于arges[0]、arges[1]和arges[2]是String类型的
        所以要利用Double.valueOf（String s）方法将String类型转化成Double类型
        再用double Value（）方法求出double类型的值

 */
 