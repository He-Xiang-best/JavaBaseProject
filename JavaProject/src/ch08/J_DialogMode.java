package ch08;

// ////////////////////////////////////////////////////////
// 
// J_DialogMode.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��׼�Ի������̡�
// ////////////////////////////////////////////////////////


import javax.swing.JOptionPane;

public class J_DialogMode
{
    public static void main(String args[ ])
    {
        JOptionPane.showMessageDialog(null, "����!");
        JOptionPane.showConfirmDialog(null, "�����ڻ�����?");
        JOptionPane.showInputDialog(null, "�����ڻ�����?");
        String [ ] s = {"��", "����"};
        JOptionPane.showInputDialog(null, "�����ڻ�����?", "����",
            JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
    } // ����main����
} // ��J_DialogMode����
