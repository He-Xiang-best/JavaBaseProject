package ex3.selected;
/**
 * �����µڰ���
 * ʵ������ѡ����
 * ������
 * @author ������
 * 2017.3.20
 *  
 */
public class Three_Eight {
	
	int a,b,c;//��������
	double x1,x2;//������
	
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
	 * ���췽��
	 * @param a һԪ���η��̵ĵ�һ��ϵ��
	 * @param b һԪ���η��̵ĵڶ���ϵ��
	 * @param c һԪ���η��̵ĵ�����ϵ��
	 */
	public Three_Eight(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * �ж��Ƿ��н�
	 * @return ����1���н���������ͬ�ķ��̸���
	 * ����0���н⣬����ͬ��
	 * ����-1���޽�
	 */
	public int isTrue(){
		int eq=b*b-4*a*c;
		if (eq>0)
			return 1;
		else if(eq==0) return 0;
		else return -1;
	}
	/**
	 * ���㷽�̵�������
	 * �����н⣬���㷽�̵ĸ�x1,x2
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
		//�������һ��С�������Чλ����
		if (eq.isTrue()>0){
			System.out.println("����������������һ������"+eq.x1);
			System.out.print("���̵ڶ�������"+eq.x2);
		}else if(eq.isTrue()==0)
			System.out.println("����ֻ��һ����������"+eq.x1);
		else System.out.println("�����޽�");
	}
}
