package ex5;
/**
 * ��������
 * �̳�Shape������
 * @author ������
* 2017.3.20
*/

public class Square extends Shape{
	
	private double width;
	
	
	public Square(double width){
		this.width=width;
		this.area=0;
		this.primeter=0;
	}
	/*
	 * ����߳�����0�������ܳ������ض�Ӧֵ
	 * �����ܳ�Ϊ-1
	 */
	public double getPrimeter(){
		if (width>0)
			primeter=4*width;
		else
			primeter=-1;
		return primeter;
	}
	
	public double getArea(){
		if (width>0)
			area=Math.pow(width,2);
		else
			area=-1;
		return area;
	}
	//ʵ��Shape��ĳ��󷽷�draw
	public void draw(){
		getArea();
		getPrimeter();
		if ((width>0) ){
		System.out.println("�����α߳�"+width);
		System.out.println("���ܳ���"+primeter+"�������"+area);
		}
		else
			System.out.println("���ݷǷ����޷�����һ��������");
		
	}

}
