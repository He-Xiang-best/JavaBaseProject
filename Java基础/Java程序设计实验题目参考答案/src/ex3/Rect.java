package ex3;
/**
 * ��������
 * 
 * @author ������
 * 2016.3.20
 *  
 */ class Rect {
	
	private double width,area,primeter;
	
	
	public Rect(double width){
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
	public void printInfo(){
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
