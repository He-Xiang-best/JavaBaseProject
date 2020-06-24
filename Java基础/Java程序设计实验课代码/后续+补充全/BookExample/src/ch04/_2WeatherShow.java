package ch04;

public class _2WeatherShow {
	public static void main(String[] args)
	   {
		// 定义一个二维数组temperature，表示10个地区一年的气温
	      float[][] temperature = new float[10][365];
	      
	      // 通过随机函数，随机模拟产生十个地区中每天的温度
	      for(int i = 0; i < temperature.length; i++)
	         for(int j = 0; j < temperature[i].length; j++)
	            temperature[i][j] = (float)(45.0*Math.random() - 10.0);
	 
	      // 计算每个地区的一年的平均气温，并输出
	      for(int i = 0; i < temperature.length; i++)
	      {     float tempsum = 0.0f;     
	         //计算一个地区一年的气温总和
	         for(int j = 0; j < temperature[0].length; j++)
	            tempsum += temperature[i][j];
	         // 输出每个地区一年的平均气温
             System.out.println("该城市所在位置 "+ (i+1) + " 的平均气温为：" + tempsum/(float)temperature[i].length);
	      }
	   }

}
