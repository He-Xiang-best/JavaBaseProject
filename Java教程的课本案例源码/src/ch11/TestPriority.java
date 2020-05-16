package ch11;


/**
* 测试线程优先级
*/
public class TestPriority {

	/*主线程，新建三个线程，设置不同的优先级*/
	 public static void main(String[] args) {
	           PrintNumberThread p1 = new PrintNumberThread("高优先级");
	           PrintNumberThread p2 = new PrintNumberThread("普通优先级");
	           PrintNumberThread p3 = new PrintNumberThread("低优先级");
	           p1.setPriority(Thread.MAX_PRIORITY);
	           p2.setPriority(Thread.NORM_PRIORITY);
	           p3.setPriority(Thread.MIN_PRIORITY);
	           p1.start();
	           p2.start();
	           p3.start();
	 }
}
