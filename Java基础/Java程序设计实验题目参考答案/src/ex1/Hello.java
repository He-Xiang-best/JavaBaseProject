package ex1;

import java.util.Arrays;

public class Hello
{
  int HighLevel(int wide) {
	int i = 0, j = 0, k = 0, t = 0, m = 0, n = 0, count = 1;
	m = (wide - 4) / 2;
	do {
		count++;
		m -= 4;
	} while (m > 4);
	if ((wide - 4) % 2 == 0)
	{
		n = 2 + 4 * (count - 1);
		m--;
	} else
		n = 1 + 4 * (count - 1);

	for (i = 0; i < count; i++) {
		for (j = (count - i) * 2; j > 0; j--)
			System.out.print(" ");
		for (k = 0; k < m; k++)
			System.out.print("*");
		for (t = 0; t < n; t++)
			System.out.print(" ");
		for (k = 0; k < m; k++)
			System.out.print("*");
		m += 4;
		n -= 4;
		System.out.print("\n");
	}

	return 0;
}

int LowLevel(int wide) {
	int i = 0, j = 0, k = 0;
	int high = 0, tmp = wide;
	do
	{
		high++;
		tmp -= 4;
	} while (tmp > 4);
	high += 1;

	for (i = 0; i < high; i++) {
		for (j = 0; j < 2 * i; j++)
			System.out.print(" ");
		for (k = wide - 4 * i; k > 0; k--)
			System.out.print("*");
		System.out.print("\n");
	}
	return 0;
}

public static void main(String[] args) {
	System.out.println("hello world");
	int wide = 30;
	Hello heart = new Hello();
	heart.HighLevel(wide);
	heart.LowLevel(wide);
	/*int i=0;
	 for ( char ch = 97; ch<109; ch++,i++) {
		   if( i % 6 == 0 )
		  System.out.println(" ");
		  System.out.print("\t" +ch);           
	 }*/
	 /*int[] a= new int[5];
	 for (int u:a) System.out.print("1"+u);*/
}
}
