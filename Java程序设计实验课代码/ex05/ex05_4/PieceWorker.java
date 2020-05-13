package ex05_4;
/**
 * 该例的Employee的每个子类都声明为final，因为不需要再继承它们生成子类
 * @content:PieceWorker（按其生产的产品数发放工资）
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:26:33
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:26:33
 * @修改原因：课堂测验，修改内容：
 */
public final class PieceWorker extends Employee {
@Override
public void earning() {
	System.out.println("PieceWorker：产多多，钱多多！");
	
}
public PieceWorker() {
	earning();
}
}
