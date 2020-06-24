package ex14;

import java.applet.*;
import java.awt.*;
/**
 * @content:用多线程实现一个简单动画，效果为一个球由小到大，从屏幕左侧滚动到右侧
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日下午5:19:25
 * @第一次修改的时间：
 * @time:2020年6月18日下午5:19:25
 * @修改原因：课堂测验，修改内容：
 */
public class BallMoveDemo extends Applet {
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	//设置小球初始样子
	int x1 = 50, x2 = 5, y1 = 25;

	public void paint(Graphics g) {
		//获取程序的边框大小
		int w = this.getWidth();
		int h = this.getHeight();
		//如果超出，则重新开始
		if (x1 >= w) {
			x1 = 50;
		}
		if (x2 > h) {
			x2 = 5;
		}
		//设置小球颜色
		g.setColor(Color.cyan);
		//对小球区域进行填充
		g.fillOval(x1, y1, x2, x2);
		//画成圆形
		g.drawOval(x1, y1, x2, x2);
		//打印完后
		x1 += 50;
		x2 += 50;
        //实现动态滚动
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		repaint();//重复循环
	}

}
