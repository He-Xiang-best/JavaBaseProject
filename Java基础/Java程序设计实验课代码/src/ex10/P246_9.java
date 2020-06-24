package ex10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @content:��ĳ���ļ����²���ָ���ؼ��ֵĸ����������ڵ��ļ�·��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������10:11:21
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������10:11:21
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P246_9  
{  
    public static int mount = 0;  
    public static void main(String[] args) {  
    	///hexiang04191315/src/ex10/P246_9.java
        String filename = "C:\\Users\\86138\\Desktop\\JavaProject\\hexiang04191315\\src\\ex10";
        //����һ�� File ʵ������ʾ·������ָ��·���������ļ�  
        File file = new File(filename);
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ҫ��ѯ�Ĺؼ��֣�");
        String keyWorld = input.next();
            findFile(file, keyWorld);  
            print(keyWorld);  
            input.close();
		}
 
    /*
     * �жϲ��ҹؼ��������ļ��Ĵ�����
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
     * �������ݵĸ�·����
     */
    public static void findFile(File file, String word)   
    {  
        File[] listFiles = file.listFiles();
        //�õ�һ��File���飬��Ĭ���ǰ��ļ�����޸����������  ����·���µ������ļ��洢������   
        for (int i = 0; i < listFiles.length; i++)   
        {  
           if (listFiles[i].isDirectory())  
         //�õݹ�ķ�����������Ŀ¼�ļ�
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
            {  //���������ң���ȥ�˱Ƚϵ��鷳��Ч�ʸ���
                while (str.indexOf(word, j) != -1)   
                {  
                    k++;  
                    j = str.indexOf(word, j) + 1; // ���ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�����  
                }  
            }  
            if (k > 0)   
            {  
         System.out.println("��" + file.getAbsolutePath() + "��    " + k+ " ���ؼ��֡� " + word+" ��");  
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
     * ���ڹؼ����ļ�����ͳ�ƣ�
     */
    public static void print(String word)  
    {  
        if (mount != 0)   
        {  
            System.out.println("һ���ҵ��� " + mount + " ���ļ������ؼ��֡�" + word + "��! \n");
            mount=0;
        }   
        else   
        {  
            System.out.println("û���ҵ���Ӧ���ļ�");  
        }  
    }  
}  
