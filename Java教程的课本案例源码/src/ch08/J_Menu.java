package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Menu.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����˵����̡�
// ////////////////////////////////////////////////////////

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class J_Menu extends JFrame
{
	JLabel label;
    public J_Menu( )
    {
        super("����˵�Ӧ��ʾ��");
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        label=new JLabel("���ǲ˵�ʵ��");
        c.add(label);
        label.setPreferredSize(new Dimension(200,100));
        //label.setFont(new Font());
        JMenuBar mBar = new JMenuBar( );
        setJMenuBar(mBar); // ���ò˵���

        JMenu [ ] m = { new JMenu("�ļ�(F)"), new JMenu("�༭(E)") };
        char  [ ][ ] mC = {{'B', 'E'}, {'O', 'S'}, {'C', 'V'}};
        JMenuItem [ ] [ ] mI =
        {
            {new JMenuItem("��(O)"), new JMenuItem("����(S)")},
            {new JMenuItem("����(C)"), new JMenuItem("ճ��(V)")}
        };
        int i, j;
        
        for (i=0; i < m.length; i++)
        {
            mBar.add(m[i]); // �������ʽ�˵�
            m[i].setMnemonic(mC[0][i]); // �������Ƿ�
            for (j=0; j < mI[i].length; j++)
            {
                m[i].add(mI[i][j]); // �������ʽ�˵���
                mI[i][j].setMnemonic(mC[i+1][j]); // �������Ƿ�
                mI[i][j].setAccelerator( // ���ÿ�ݼ�
                    KeyStroke.getKeyStroke("ctrl " + mC[i+1][j]));
                mI[i][j].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            System.out.println("���в˵���: "
                                + mItem.getText( ));
                            label.setText("���в˵���: "
                                    + mItem.getText( ));
                        } // ����actionPerformed����
                    } // ʵ�ֽӿ�ActionListener���ڲ������
                ); // ����addActionListener���ý���
            } // �ڲ�forѭ������
        } // �ⲿforѭ������
        m[0].insertSeparator(1); 
    } // J_Menu���췽������
    
    public static void main(String args[ ])
    {
        JFrame app = new J_Menu( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400,400);
        app.setVisible(true);
    } // ����main����
} // ��J_Menu����
