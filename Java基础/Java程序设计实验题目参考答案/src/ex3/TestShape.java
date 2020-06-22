package ex3;
/**
 * 调用圆形及矩形的主类
 * @author 郭晓燕
 * 2016.3.20
 *  
 */
public class TestShape {

	/**
	 * 生成圆形对象和矩形对象
	 * 打印出相关信息
	 * @param args无意义
	 */
	public static void main(String[] args) {
		Cirlce circle = new Cirlce(3.0);
		circle.printInfo();
		Rect rect = new Rect(4);
		rect.printInfo();		
		}

}
