package ex2;
/**
* ´òÓ¡*Èı½ÇĞÎ
* 
*@author ¹ùÏşÑà
*@version 2.0
*@since J2SE1.7
*2017.3.1
*/
public class Pascal_Triangle {

	public static void main(String[] args) {
		
		for (int i=1;i<=7;i++){
		  if (i<=4){
			for (int m=0;m<4-i;m++)
				System.out.print(" ");
			for (int n=0;n<2*i-1;n++)
				//if ((i==4)&&(n==3))System.out.print("+");
				//else 
					System.out.print("*");
			System.out.println();
		  }//end for if(i<=4)
		  else{
			  int k=i-4;
			  for (int m=0;m<k;m++)
				  System.out.print(" ");
			  for (int n=0;n<7-2*k;n++)
				  System.out.print("*");
			  System.out.println();
		  }
		}
		
	}

}
