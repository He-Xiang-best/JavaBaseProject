package other;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		AllString[] al = new AllString[5];
		Scanner input = new Scanner(System.in);
        for (int i = 0; i < al.length; i++) {
			if(al[i]==null) {
				System.out.print("请输入第"+(i+1)+"个集合的元素个数：");
				al[i] = new AllString(input.nextInt());
			} 
	}
         for (int i = 0; i < al.length; i++) {
        	
        		 if(al[i+1].s.contains(al[i].s.get(i))) {
     				add();
			}

		}
}

	private static void add() {
		// TODO Auto-generated method stub
		
	}
}