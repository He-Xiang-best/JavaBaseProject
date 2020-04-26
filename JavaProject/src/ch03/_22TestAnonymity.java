package ch03;

public class _22TestAnonymity {
	public _22Calculation cal() {  
        //匿名内部类   
    	return new _22Calculation() {  
                 private int i = 11,j=22;  
                 public int value() {  
                        return i*j;  
                 }  
          }; // 在这里需要一个分号  
    }  
    public static void main(String[] args) {  
    	int x;
    	_22TestAnonymity ta = new _22TestAnonymity();  
       //通过cal()方法返回一个Contents对象，使用该对象调用匿名类中的value()方法
    	x=ta.cal().value();
    	System.out.println("ta.cont().value()="+x);
    }  

}
