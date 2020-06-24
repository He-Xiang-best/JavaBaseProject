package ex09;

public class P199_4 {
    public static void mb_createException() {
    	throw new ArrayIndexOutOfBoundsException();
    }
    public static void mb_method() {
    	try {
			mb_createException();
			System.out.print("a");
		} catch (ArithmeticException e) {
			System.out.print("b");
		}
    	finally {
			System.out.print("c");
		}
    	System.out.print("d");
    }
	public static void main(String[] args) {
		try {
			mb_method();
		} catch (Exception e) {
			System.err.println('m');
		}
            System.out.println('n');
	}

}
