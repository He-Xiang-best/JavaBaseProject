package ex5;



/**
 * 测试Vehicle接口与其实现类Bike、Car的动态多态性
* @author 郭晓燕
* 2017.3.20
*/

public class TestTool {

	public static void main(String[] args) {
		Vehicle audi=new Car();
		audi.run();
		audi=new Bike();
		audi.run();

	}

}
