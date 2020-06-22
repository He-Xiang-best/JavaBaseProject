package ex8;
/**
 * 
 * @author 郭晓燕
 *
 * @param <T>泛型代表从Five_2_Shape类生成的子类
 */
class PrintShape<T extends Five_2_Shape>{
   public void printInfo(T a){
	   a.getArea();
	   a.print();
   }

}
/**
 * 第五章第二题
 * @author 郭晓燕
 * 2017.5.14 * 
 */
public class Five_2  {

	public static void main(String[] args) {
		PrintShape<Five_2_Circle> shapeOne=new PrintShape<Five_2_Circle>();
		Five_2_Circle c=new Five_2_Circle(3.6);
		shapeOne.printInfo(c);
		
		PrintShape<Fi_square> shapeTwo=new PrintShape<Fi_square>();
		Fi_square sq=new Fi_square(3.6,5.5);
		shapeTwo.printInfo(sq);
		
	}

}
