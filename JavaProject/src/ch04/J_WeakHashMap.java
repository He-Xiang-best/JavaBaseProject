// ////////////////////////////////////////////////////////
// 
// J_WeakHashMap.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��WeakHashMap���Զ�ȥ��һЩ�������á�Ԫ��(�ؼ��ּ���Ӧ��ֵ)�����̡�
// ////////////////////////////////////////////////////////
package ch04;

import java.util.WeakHashMap;

public class J_WeakHashMap
{
    public static void main(String args[ ]) throws Exception
    {
        // ����WeakHashMapʵ������
        int s=800; // ����WeakHashMapʵ�����������ӵ�Ԫ�صĸ���
        WeakHashMap<String, String> ht
            = new WeakHashMap<String, String>(s*4/3, 0.75f);

        // ��WeakHashMapʵ����������Ԫ��(�ؼ��ּ���ֵ)
        int i;
        for (i=0; i<s; i++)
            ht.put(("key"+i), ("value"+i));
        System.out.println("�ڸ�����������ʱ������ϣ��Ԫ�ظ�����" + ht.size( ));

        // ����Ѿ�����WeakHashMapʵ�������е�Ԫ�أ�����ȴ�����ϣ��ɾ��Ԫ��
        for (i=0; i<s; )
        {
            if (!ht.containsKey("key"+i))
                System.out.print("key" + i + "; ");
            if (ht.size( )!=s)
                i++;
        } // forѭ������
        System.out.println("");
        System.out.println("һ��ʱ��֮������ϣ��Ԫ�ظ�����" + ht.size( ));
    } // ����main����
} // ��J_WeakHashMap����