package ex5;
/**
 * 测试Shape及其子类Square和Circle的动态多态性
* @author 郭晓燕
* 2017.3.20
*/
public class TestShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = new Cirlce(3.0);
		circle.draw();
		Square square = new Square(4);
		square.draw();		
		}

}
