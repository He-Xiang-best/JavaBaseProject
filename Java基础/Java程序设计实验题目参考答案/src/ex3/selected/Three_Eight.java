package ex3.selected;
/**
 * 第三章第八题
 * 实验三的选做题
 * 方程类
 * @author 郭晓燕
 * 2017.3.20
 *  
 */
public class Three_Eight {
	
	int a,b,c;//三个整数
	double x1,x2;//两个根
	
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	/**
	 * 构造方法
	 * @param a 一元二次方程的第一个系数
	 * @param b 一元二次方程的第二个系数
	 * @param c 一元二次方程的第三个系数
	 */
	public Three_Eight(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * 判断是否有解
	 * @return 返回1，有解且两个不同的方程根。
	 * 返回0，有解，解相同。
	 * 返回-1，无解
	 */
	public int isTrue(){
		int eq=b*b-4*a*c;
		if (eq>0)
			return 1;
		else if(eq==0) return 0;
		else return -1;
	}
	/**
	 * 计算方程的两个根
	 * 方程有解，计算方程的根x1,x2
	 * 
	 * */
	public void getResult(){
		if (isTrue()>0){
			x1=-b+Math.sqrt(b*b-4*a*c)/(2*a);
			x2=-b-Math.sqrt(b*b-4*a*c)/(2*a);
		}
		else if(isTrue()==0)
			x1=x2=-b+Math.sqrt(b*b-4*a*c)/(2*a);
	}
	
	public static void main(String args[]){
		Three_Eight eq=new Three_Eight(3,-8,5);
		eq.getResult();
		//输出考虑一下小数点的有效位数。
		if (eq.isTrue()>0){
			System.out.println("方程有两个根，第一个根是"+eq.x1);
			System.out.print("方程第二个根是"+eq.x2);
		}else if(eq.isTrue()==0)
			System.out.println("方程只有一个根，根是"+eq.x1);
		else System.out.println("方程无解");
	}
}
