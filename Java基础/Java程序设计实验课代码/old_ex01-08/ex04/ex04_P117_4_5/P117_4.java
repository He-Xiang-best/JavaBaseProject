package ex04_P117_4_5;

 class P117_4 {
    public static int mb_square(int x) {
    	return (x*x);
    }
//重载出错，因为传入的参数值相同，调用相同方法时，编译器会识别出错
//    public static double mb_square(int y) {
//    	double d = y;
//    	return (d*d);
//    }
//修改一下，使其传入的参数不同，即可编译通过
    public static double mb_square(double y) {
    	double d = y;
    	return (d*d);
    }
}
