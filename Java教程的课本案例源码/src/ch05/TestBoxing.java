package ch05;

import java.util.HashMap;

public class TestBoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		//自动装箱可以将基本数据类型double转换为引用数据类型对应的封装类Double
		hm.put("book",35.5);
		hm.put("pen", 150.3);
		System.out.print("书的价格是"+hm.get("book"));
		System.out.print("钢笔的价格是"+hm.get("pen"));
	}

}
