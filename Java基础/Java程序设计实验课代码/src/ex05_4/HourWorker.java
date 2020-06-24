package ex05_4;
/**
 * 该例的Employee的每个子类都声明为final，因为不需要再继承它们生成子类
 * @content:HourlyWorker（根据工作时间长短发放工资）。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:26:27
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:26:27
 * @修改原因：课堂测验，修改内容：
 */
public final class HourWorker extends Employee {
	@Override
	public void earning() {
	System.out.println("HourWorker：干得久，拿钱多！");
	
}
public HourWorker() {
	earning();
}
}
