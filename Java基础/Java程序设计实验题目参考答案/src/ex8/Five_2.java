package ex8;
/**
 * 
 * @author ������
 *
 * @param <T>���ʹ����Five_2_Shape�����ɵ�����
 */
class PrintShape<T extends Five_2_Shape>{
   public void printInfo(T a){
	   a.getArea();
	   a.print();
   }

}
/**
 * �����µڶ���
 * @author ������
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
