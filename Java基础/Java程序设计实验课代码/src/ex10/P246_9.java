package ex10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @content:在某个文件夹下查找指定关键字的个数及其所在的文件路径
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午10:11:21
 * @第一次修改的时间：
 * @time:2020年6月4日下午10:11:21
 * @修改原因：课堂测验，修改内容：
 */
public class P246_9  
{  
    public static int mount = 0;  
    public static void main(String[] args) {  
    	///hexiang04191315/src/ex10/P246_9.java
        String filename = "C:\\Users\\86138\\Desktop\\JavaProject\\hexiang04191315\\src\\ex10";
        //创建一个 File 实例，表示路径名是指定路径参数的文件  
        File file = new File(filename);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查询的关键字：");
        String keyWorld = input.next();
            findFile(file, keyWorld);  
            print(keyWorld);  
            input.close();
		}
 
    /*
     * 判断查找关键字所在文件的存在性
     */
    public static boolean isTrueFile(File file)   
    {  
        if(!file.exists() || !file.canRead())  
        return false;  
        if (file.getName().startsWith("."))  
        return false;  
        if (file.getName().endsWith("."))  
        return false;  
        return true;  
    }  
    /*
     * 查找内容的根路径：
     */
    public static void findFile(File file, String word)   
    {  
        File[] listFiles = file.listFiles();
        //得到一个File数组，它默认是按文件最后修改日期排序的  ，将路径下的所有文件存储到其中   
        for (int i = 0; i < listFiles.length; i++)   
        {  
           if (listFiles[i].isDirectory())  
         //用递归的方法解析到根目录文件
           findFile(listFiles[i], word); 
           else if (isTrueFile(listFiles[i]))  
           search(listFiles[i], word);  
        }  
    }  
    public static void search(File file, String word)   
    {  
        try   
        {  
            int j = 0, k = 0, ch = 0;  
            String str = null;  
            //FileReader in = new FileReader(file);  
            BufferedReader in = new BufferedReader(new FileReader(file));
            while ((ch = in.read()) != -1)   
            {  
                str += (char) ch;  
            }  
            if (str != null)  
            {  //按索引来找，减去了比较的麻烦，效率更高
                while (str.indexOf(word, j) != -1)   
                {  
                    k++;  
                    j = str.indexOf(word, j) + 1; // 返回第一次出现的指定子字符串在此字符串中的索引  
                }  
            }  
            if (k > 0)   
            {  
         System.out.println("在" + file.getAbsolutePath() + "有    " + k+ " 个关键字“ " + word+" ”");  
                mount++;  
            }  
            in.close();  
        }   
        catch (FileNotFoundException e)  
        {  
            e.printStackTrace();  
        }   
        catch (IOException e)  
        {  
            e.printStackTrace();  
        }  
    }  
    /*
     * 存在关键字文件总数统计：
     */
    public static void print(String word)  
    {  
        if (mount != 0)   
        {  
            System.out.println("一共找到： " + mount + " 个文件包含关键字“" + word + "”! \n");
            mount=0;
        }   
        else   
        {  
            System.out.println("没有找到相应的文件");  
        }  
    }  
}  
