package ch05;

import java.util.HashMap;

public class TestBoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		//�Զ�װ����Խ�������������doubleת��Ϊ�����������Ͷ�Ӧ�ķ�װ��Double
		hm.put("book",35.5);
		hm.put("pen", 150.3);
		System.out.print("��ļ۸���"+hm.get("book"));
		System.out.print("�ֱʵļ۸���"+hm.get("pen"));
	}

}
