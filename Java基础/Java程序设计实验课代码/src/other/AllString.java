package other;

import java.util.ArrayList;
import java.util.Scanner;
public class AllString {
       String[] str;
      ArrayList<String> s = new ArrayList<String>();
      public AllString(int i) {
    	  Scanner input = new Scanner(System.in);
    	  str =new String[i];
    	  System.out.println("请输入集合元素，以空格进行分隔结束某个元素的录入");
    	  for (int j = 0; j < i; j++) {
			s.add(input.next());
		}
    	  for (int j = 0; j < str.length; j++) {
			str[j] = input.next();
		}
    	  input.close();
      }

}
