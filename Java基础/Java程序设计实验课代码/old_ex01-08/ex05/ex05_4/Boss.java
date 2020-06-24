package ex05_4;
/**
 * 该例的Employee的每个子类都声明为final，因为不需要再继承它们生成子类
 * @content:Employee的子类有Boss（每星期发给他固定工资，而不计工作时间）
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:24:08
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:24:08
 * @修改原因：课堂测验，修改内容：
 */
public final class Boss extends Employee {
public Boss() {
	earning();
}

@Override
public void earning() {
	System.out.println("Boss：我工资年薪百万，羡慕不？");	
 }
}
