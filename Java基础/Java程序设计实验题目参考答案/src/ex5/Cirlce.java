package ex5;
/**
 * Բ����
 * �̳�Shape������
 * @author ������
* 2017.3.20
*/
public class Cirlce extends Shape{
	
	private double radius;
	
	
	public Cirlce(double radius){
		this.radius=radius;
		this.area=0;
		this.primeter=0;
	}
	public double getPrimeter(){
		if (radius>0)
			primeter=2*Math.PI*radius;
		else
			primeter=-1;
		return primeter;
	}
	
	public double getArea(){
		if (radius>0)
			area=Math.PI*radius*radius;
		else
			area=-1;
		return area;
	}
	//ʵ�ֳ��󷽷�draw
	public void draw(){
		getArea();
		getPrimeter();
		if ((radius>0) ){
		System.out.println("Բ�εİ뾶��"+radius);
		System.out.println("���ܳ���"+primeter+"�������"+area);
		}
		else
			System.out.println("���ݷǷ����޷�����һ��Բ��");
		
	}

}
