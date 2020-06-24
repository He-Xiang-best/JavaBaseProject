package ex05_3_old;
/**
 * 
 * @content:定义一个形状类（做成抽象类或接口皆可），有周长和面积两个域变量，三个抽象方法：
                        计算周长，计算其面积及输出周长和面积的抽象方法
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月10日下午1:04:49
 * @第一次修改的时间：
 * @time:2020年5月10日下午1:04:49
 * @修改原因：课堂测验，修改内容：
 */
public interface Shape {
	public double perimeter = 0;
	public double area = 0;

	double calculateP();

	double calculateA();

	void outPut(Shape shape);

}
 