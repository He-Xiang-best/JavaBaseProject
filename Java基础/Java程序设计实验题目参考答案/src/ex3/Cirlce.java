package ex3;
/**
 * Բ����
 * @author ������
 * 2016.3.20
 *  
 */
public class Cirlce {
	//�뾶��������ܳ�
	private double radius,area,primeter;
	
	
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
	/**
	 * ����������ܳ�
	 *��ӡԲ�εİ뾶���ܳ������
	 */
	public void printInfo(){
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
