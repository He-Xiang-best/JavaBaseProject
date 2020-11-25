/*
 * Created by JFormDesigner on Thu Sep 17 18:45:35 CST 2020
 */

package fileEncoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

/**
 * @author 何翔
 */
public class DisplayWindow extends JFrame {
    public DisplayWindow() {
        initComponents();
    }

    private boolean isFileExists(String filepath){
        /*
         * @author: 何翔
         * @param: [filepath]
         * @return: boolean
         * @date: 2020/9/17 20:59
         * @description：判断输入的文件路径是否存在
         */
        return new File(filepath).exists();
    }

    private void button1ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/9/18 0:17
         * @description：读取路径中的文件，并加密，再把加密的文件输出保存
         */
        try {
            if (!isFileExists(textField1.getText())){
                JOptionPane.showMessageDialog(null, "输入的文件路径错误！请返回重新输入！", "文件查找失败", JOptionPane.ERROR_MESSAGE);
            return;
            }
            String filepath = textField1.getText();
            String writePath = filepath.substring(0, filepath.indexOf(""))+"-JiaMi.txt";
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(filepath));
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(writePath));
            byte[] bytes = new byte[bi.available()];
            bi.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                byte newByte = (byte) (bytes[i] ^ i);
                bo.write(newByte);
            }
            JOptionPane.showMessageDialog(null, "文件加密成功！", "运行成功", JOptionPane.INFORMATION_MESSAGE);
            bo.flush();
            bi.close();
            bo.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/9/18 8:34
         * @description：获取解密文件路径，并把解密的内容输出到控制台，同时也将内容保存到解密文件中
         */
        try {
            if (!isFileExists(textField1.getText())){
                JOptionPane.showMessageDialog(null, "输入的文件路径错误！请返回重新输入！", "文件查找失败", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String filepath = textField1.getText();
            String writePath = filepath.substring(0, filepath.indexOf(""))+"-JieMi.txt";
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(filepath));
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(writePath));
            byte[] bytes = new byte[bi.available()];
            bi.read(bytes);            
            byte[] originalByte = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                originalByte[i] = (byte) (bytes[i] ^ i);
                bo.write(originalByte[i]);
            }
            String content = new String(originalByte);
            System.out.println("解密的文件内容如下:\n" + content);
            JOptionPane.showMessageDialog(null, "文件解密成功！", "运行成功", JOptionPane.INFORMATION_MESSAGE);
            bo.flush();
            bi.close();
            bo.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    private void button3ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/9/18 8:41
         * @description：重置文本框内容，设置为空白
         */
        textField1.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button3 = new JButton();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        setTitle("\u6587\u4ef6\u52a0\u5bc6/\u89e3\u5bc6\u5668");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("\u8bf7\u8f93\u5165\u60a8\u8981\u52a0\u5bc6/\u89e3\u5bc6\u7684\u6587\u4ef6\u6240\u5728\u8def\u5f84\uff1a");

            //---- button3 ----
            button3.setText("\u91cd\u7f6e");
            button3.setIcon(new ImageIcon(getClass().getResource("/image/重置 .png")));
            button3.addActionListener(e -> button3ActionPerformed(e));

            //---- button2 ----
            button2.setText("\u89e3\u5bc6");
            button2.setIcon(new ImageIcon(getClass().getResource("/image/解密 .png")));
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- button1 ----
            button1.setText("\u52a0\u5bc6");
            button1.setIcon(new ImageIcon(getClass().getResource("/image/加密.png")));
            button1.addActionListener(e -> button1ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
