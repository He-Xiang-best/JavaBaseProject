package ch04;

public class _2WeatherShow {
	public static void main(String[] args)
	   {
		// ����һ����ά����temperature����ʾ10������һ�������
	      float[][] temperature = new float[10][365];
	      
	      // ͨ��������������ģ�����ʮ��������ÿ����¶�
	      for(int i = 0; i < temperature.length; i++)
	         for(int j = 0; j < temperature[i].length; j++)
	            temperature[i][j] = (float)(45.0*Math.random() - 10.0);
	 
	      // ����ÿ��������һ���ƽ�����£������
	      for(int i = 0; i < temperature.length; i++)
	      {     float tempsum = 0.0f;     
	         //����һ������һ��������ܺ�
	         for(int j = 0; j < temperature[0].length; j++)
	            tempsum += temperature[i][j];
	         // ���ÿ������һ���ƽ������
             System.out.println("�ó�������λ�� "+ (i+1) + " ��ƽ������Ϊ��" + tempsum/(float)temperature[i].length);
	      }
	   }

}
