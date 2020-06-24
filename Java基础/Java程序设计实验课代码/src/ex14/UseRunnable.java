package ex14;
/**
 * 
 * @content:
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日下午4:52:14
 * @第一次修改的时间：
 * @time:2020年6月18日下午4:52:14
 * @修改原因：课堂测验，修改内容：
 */
public class UseRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("“你好，我的名字名字是李四，第"+(i+1)+"此来这儿”");
		}
		
	}

}
