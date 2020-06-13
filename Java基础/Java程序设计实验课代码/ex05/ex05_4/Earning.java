package ex05_4;
/**
 * 
 * @content:多态在工资系统中的应用，设计一个根据雇员类型利用abstract方法和多态性完成工资单计算的程序。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:23:44
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:23:44
 * @修改原因：课堂测验，修改内容：
 */
public class Earning {
    //在超类中声明earnings()为抽象方法，，并且对于每个子类都提供恰当的earnings()的实现方法
	//对所有雇员类型都使用earnings()方法，但每个人挣的工资按他所属的雇员类计算
	//所有雇员类都是从超类Earnings()派出生的。
	//为了计算雇员的工资，程序仅仅使用雇员对象的超类引导并调用earnings()方法

	public static void main(String[] args) {
		/*
		 * 为了计算雇员的工资，程序仅仅使用雇员对象的超类引导 并调用earnings()方法
		 * 一个实际的工资系统Salary中，各种Employee对象的引用可以通过一个Employee引用数组来实现
		 * 程序依次使用数组的每个元素（Employee引用）调用每个对象的earnings()方法计算工资单
		 */
		System.out.println("方法一打印：");
		//通过构造函数调用earning方法直接打印：
		Employee[] employee = { new Boss(), new CommissionWorker(), new PieceWorker(), new HourWorker() };
		System.out.println("\n方法二打印：");
		//for循环调用earning方法打印：
		for (int i = 0; i < employee.length; i++) {
			employee[i].earning();
		}
		System.out.println("\n方法三打印：");
		//简易的for语句：
		for (Employee employee2 : employee) {
			employee2.earning();
		}
	}
}
