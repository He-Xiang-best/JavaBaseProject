package ch03;

public class _22TestAnonymity {
	public _22Calculation cal() {  
        //�����ڲ���   
    	return new _22Calculation() {  
                 private int i = 11,j=22;  
                 public int value() {  
                        return i*j;  
                 }  
          }; // ��������Ҫһ���ֺ�  
    }  
    public static void main(String[] args) {  
    	int x;
    	_22TestAnonymity ta = new _22TestAnonymity();  
       //ͨ��cal()��������һ��Contents����ʹ�øö�������������е�value()����
    	x=ta.cal().value();
    	System.out.println("ta.cont().value()="+x);
    }  

}
