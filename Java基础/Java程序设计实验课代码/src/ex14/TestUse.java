package ex14;
/**
 * @content:学习采用Thread类和Runnalbe接口两种方法编写线程程序。
 *          分别用两种方式编写多线程功能的程序
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日下午4:51:08
 * @第一次修改的时间：
 * @time:2020年6月18日下午4:51:08
 * @修改原因：课堂测验，修改内容：
 */
public class TestUse {

	public static void main(String[] args) {
		UseThread ut = new UseThread();
		ut.start();
		UseRunnable ur = new UseRunnable();
		new Thread(ur).start();

	}

}
