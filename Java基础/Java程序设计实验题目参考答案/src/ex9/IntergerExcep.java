package ex9;

import java.util.Scanner;

/**
 * ������ �쳣����
 * @author guoxiaoyan
 * 2017.5.1
 *
 */
public class IntergerExcep {
	
	public double catchEx() throws NumberFormatException{
		String inputs;
		double inputd;
		Scanner in=null;
		System.out.println("����һ����������");
		in=new Scanner(System.in);
			inputs=in.next();
			inputd=Double.parseDouble(inputs);
		in.close();
		return inputd;
	}
	
	public static void main(String args[]){
		IntergerExcep six=new IntergerExcep();
		try{
		double d=six.catchEx();
		System.out.println(d);
		}catch(NumberFormatException ex){
			System.err.print("�������"+ex);
		}
	}

}
