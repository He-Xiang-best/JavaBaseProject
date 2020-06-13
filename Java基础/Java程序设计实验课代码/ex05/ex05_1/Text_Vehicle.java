package ex05_1;
/**
 * 
 * @content:创建另一个类Test_Vehicle，
 *          在main主方法中分别通过使用Vehicle接口创建关于Car 与Bike 类的引用对象audi 与 yongjiu。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月8日下午8:52:40
 * @第一次修改的时间：
 * @time:2020年5月8日下午8:52:40
 * @修改原因：课堂测验，修改内容：
 */
public class Text_Vehicle {

	public static void main(String[] args) {
		//创建关于Car 与Bike 类的引用对象audi 与 yongjiu
		Vehicle audi = new Car();
		Vehicle yongjiu = new Bike();
		//使用接口Vehicle的两个引用对象分别调用各自的启动start()与刹车stop()，显示不同运输工具的多态性。
		System.out.println("Car吐槽Bike:");
		audi.start();
		System.out.println("Bike吐槽Car:");
		yongjiu.start();
		System.out.println("\n他们各自的世界：");
		System.out.print("Car:");audi.stop();
		System.out.print("Bike:");yongjiu.stop();
       
	}

}
