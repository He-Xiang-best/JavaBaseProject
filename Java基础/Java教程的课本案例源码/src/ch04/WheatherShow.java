package ch04;

public class WheatherShow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float[][] temperature=new float[10][365];
		
		for(int i=0;i<temperature.length;i++)
			for (int j=0;j<temperature[i].length;j++)
				temperature[i][j]=(float)(45.0*Math.random()-10.0);
				
		 for(int i=0;i<temperature.length;i++){
				float tempSum=0.0f;
				
				for (int j=0;j<temperature[i].length;j++){
						tempSum+=temperature[i][j];
				}
				System.out.println("�ó��е�"+(i+1)+"����ƽ������Ϊ"
						+tempSum/(float)temperature[i].length);			
		}
	
		 
	}//end for main

}