package ch03;
/**
 * 
 * @author Administrator
 *
 */
public class _1Rect {

	private float rectLong, rectWide;    //类成员变量部分；
	
	public _1Rect( ){
		rectLong=(float)88.2;
		rectWide=(float)100.2;
	}
	public _1Rect(double lnum,double wnum ){
		rectLong=(float)lnum;
		rectWide=(float)wnum;
	}
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public float getPerimeter()         //类成员方法部分；
	{	
		return 2*(rectLong+rectWide);
	}
	public double getArea()
	{  
		return rectLong*rectWide;
		}
	public float getRectLong() {
		return rectLong;
	}
	public void setRectLong(float rectLong) {
		this.rectLong = rectLong;
	}
	public float getRectWide() {
		return rectWide;
	}
	public void setRectWide(float rectWide) {
		this.rectWide = rectWide;
	}
	
}
