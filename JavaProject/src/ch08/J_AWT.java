package ch08;

// ////////////////////////////////////////////////////////
// 
// J_AWT.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     AWTͼ���û��������̡�
// ////////////////////////////////////////////////////////


public class J_AWT
{
    public static void main(String args[ ])
    {
        java.awt.Frame app = new java.awt.Frame( );
        app.setTitle("AWT���");
        app.add(new java.awt.Button("AWT��ť"),
            java.awt.BorderLayout.CENTER);
        app.addWindowListener( new java.awt.event.WindowAdapter( )
            {
                public void windowClosing(java.awt.event.WindowEvent e)
                {
                    System.exit(0);
                } // ����windowClosing����
            } // ʵ�ֳ�����WindowAdapter���ڲ��������
        ); // addWindowListener�������ý���
        app.setSize(250, 100);
        app.setVisible(true);
    } // ����main����
} // ��J_AWT����