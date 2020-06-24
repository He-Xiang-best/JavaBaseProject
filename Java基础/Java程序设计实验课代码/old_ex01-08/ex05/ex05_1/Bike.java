package ex05_1;
/**
 * 
 * @content:定义两个类Car和 Bike，实现Vehicle接口,并具体实现接口start()和stop()方法
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月8日下午8:52:22
 * @第一次修改的时间：
 * @time:2020年5月8日下午8:52:22
 * @修改原因：课堂测验，修改内容：
 */
public class Bike implements Vehicle {
 
	@Override
	public void start() {
		System.out.println("宝马又如何？不环保还要花奶粉钱！");

	}

	@Override
	public void stop() {
		System.out.println("随时停下赏风景！");

	}

}
