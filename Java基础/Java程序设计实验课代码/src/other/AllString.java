package other;

import java.util.ArrayList;
import java.util.Scanner;
public class AllString {
       String[] str;
      ArrayList<String> s = new ArrayList<String>();
      public AllString(int i) {
    	  Scanner input = new Scanner(System.in);
    	  str =new String[i];
    	  System.out.println("�����뼯��Ԫ�أ��Կո���зָ�����ĳ��Ԫ�ص�¼��");
    	  for (int j = 0; j < i; j++) {
			s.add(input.next());
		}
    	  for (int j = 0; j < str.length; j++) {
			str[j] = input.next();
		}
    	  input.close();
      }

}
