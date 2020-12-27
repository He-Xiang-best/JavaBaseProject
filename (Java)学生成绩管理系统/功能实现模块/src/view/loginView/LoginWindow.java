/*
 * Created by JFormDesigner on Fri Sep 18 20:28:54 CST 2020
 */

package view.loginView;

import classType.userType.Admin;
import sqlContact.AdminContact;
import util.StringUtil;
import view.mainView.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;

/*
 * @author:何翔
 * @date:2020/11/20 9:50
 * @description:实现登录界面窗口
 /*

 */

public class LoginWindow {
    public void showLoginFrame(){
        loginFrame.setVisible(true);
    }

    public LoginWindow() {
        initComponents();
    }

    private void resetActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:52
         * @description：重置文本栏信息
         */
        inputNameText.setText("");
        passwordField1.setText("");
        IdentifyComboBox.setSelectedIndex(0);
    }

    private void exitActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:52
         * @description：退出系统
         */
        loginFrame.setVisible(false);
        System.exit(0);
    }

    private void loginActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:51
         * @description：匹配登入信息，成功后登入
         */
        String nameText = inputNameText.getText();
        String passwordText = passwordField1.getText().toString();
        String str =(String) IdentifyComboBox.getSelectedItem();
        if(StringUtil.isEmpty(nameText)){
            JOptionPane.showMessageDialog(null, "用户名不能为空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(StringUtil.isEmpty(passwordText)){
            JOptionPane.showMessageDialog(null, "密码不能为空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Admin admin = null;
        if("管理员".equals(str)){
            AdminContact adminCon = new AdminContact();
            Admin adminTmp = new Admin();
            adminTmp.setName(nameText);
            adminTmp.setPassword(passwordText);
            admin = adminCon.login(adminTmp);
            adminCon.CloseCon();
            //判断对象是否获取到信息
            if(admin == null){
                JOptionPane.showMessageDialog(null, "登入信息错误！请重试!", "信息错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null, "欢迎登入成绩管理系统！", "登入成功", JOptionPane.INFORMATION_MESSAGE);
            loginFrame.dispose();
            new MainWindow().showMainWindow(admin);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        loginFrame = new JFrame();
        loginPanel = new JPanel();
        loginTitel = new JLabel();
        userName = new JLabel();
        inputNameText = new JTextField();
        password = new JLabel();
        passwordField1 = new JPasswordField();
        identify = new JLabel();
        IdentifyComboBox = new JComboBox<>();
        login = new JButton();
        reset = new JButton();
        exit = new JButton();

        //======== loginFrame ========
        {
            loginFrame.setTitle("\u767b\u5f55\u754c\u9762");
            loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            var loginFrameContentPane = loginFrame.getContentPane();

            //======== loginPanel ========
            {

                //---- loginTitel ----
                loginTitel.setText("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf\u767b\u5165\u754c\u9762");
                loginTitel.setFont(loginTitel.getFont().deriveFont(loginTitel.getFont().getSize() + 10f));
                loginTitel.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u6210\u7ee9.png")));

                //---- userName ----
                userName.setText("\u7528\u6237\u540d\u79f0\uff1a");
                userName.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u7528\u6237\u540d.png")));
                userName.setFont(userName.getFont().deriveFont(userName.getFont().getSize() + 5f));

                //---- password ----
                password.setText("\u767b\u5165\u5bc6\u7801\uff1a");
                password.setFont(password.getFont().deriveFont(password.getFont().getSize() + 5f));
                password.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u5bc6\u7801.png")));

                //---- identify ----
                identify.setText("\u8eab\u4efd\u7c7b\u578b\uff1a");
                identify.setFont(identify.getFont().deriveFont(identify.getFont().getSize() + 5f));
                identify.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u5206\u671f\uff0d\u8eab\u4efd\u7c7b\u522b.png")));

                //---- IdentifyComboBox ----
                IdentifyComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "\u7ba1\u7406\u5458",
                    "\u6559\u5e08",
                    "\u5b66\u751f"
                }));

                //---- login ----
                login.setText("\u767b\u5165");
                login.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u767b\u5165.png")));
                login.addActionListener(e -> {
			loginActionPerformed(e);
		});

                //---- reset ----
                reset.setText("\u91cd\u7f6e");
                reset.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u91cd\u7f6e.png")));
                reset.addActionListener(e -> resetActionPerformed(e));

                //---- exit ----
                exit.setText("\u9000\u51fa");
                exit.setIcon(new ImageIcon(getClass().getResource("/image/LoginView/\u9000\u51fa.png")));
                exit.addActionListener(e -> exitActionPerformed(e));

                GroupLayout loginPanelLayout = new GroupLayout(loginPanel);
                loginPanel.setLayout(loginPanelLayout);
                loginPanelLayout.setHorizontalGroup(
                    loginPanelLayout.createParallelGroup()
                        .addGroup(loginPanelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(login, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                    .addComponent(reset, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(exit, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addGroup(loginPanelLayout.createParallelGroup()
                                        .addComponent(password)
                                        .addComponent(userName)
                                        .addComponent(identify))
                                    .addGap(32, 32, 32)
                                    .addGroup(loginPanelLayout.createParallelGroup()
                                        .addComponent(inputNameText, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(IdentifyComboBox, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
                            .addGap(84, 84, 84))
                        .addGroup(GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                            .addGap(0, 125, Short.MAX_VALUE)
                            .addComponent(loginTitel, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95))
                );
                loginPanelLayout.setVerticalGroup(
                    loginPanelLayout.createParallelGroup()
                        .addGroup(loginPanelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(loginTitel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(inputNameText, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addComponent(userName))
                            .addGap(18, 18, 18)
                            .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(password))
                            .addGap(18, 18, 18)
                            .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(IdentifyComboBox, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(identify))
                            .addGap(18, 18, 18)
                            .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(exit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(login, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(reset, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(13, Short.MAX_VALUE))
                );
            }

            GroupLayout loginFrameContentPaneLayout = new GroupLayout(loginFrameContentPane);
            loginFrameContentPane.setLayout(loginFrameContentPaneLayout);
            loginFrameContentPaneLayout.setHorizontalGroup(
                loginFrameContentPaneLayout.createParallelGroup()
                    .addComponent(loginPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            loginFrameContentPaneLayout.setVerticalGroup(
                loginFrameContentPaneLayout.createParallelGroup()
                    .addGroup(loginFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
            );
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(loginFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame loginFrame;
    private JPanel loginPanel;
    private JLabel loginTitel;
    private JLabel userName;
    private JTextField inputNameText;
    private JLabel password;
    private JPasswordField passwordField1;
    private JLabel identify;
    private JComboBox<String> IdentifyComboBox;
    private JButton login;
    private JButton reset;
    private JButton exit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
