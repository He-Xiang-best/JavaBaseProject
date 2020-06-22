package ex5;



/**
 * 继承Vehicle接口Car类
 * 实现了抽象方法run
 * @author 郭晓燕
 * 2017.3.20
 *
 */
public class Car implements Vehicle {

	@Override
	public void run() {
		System.out.println("汽车在跑");

	}

}
