/*
 * Created by JFormDesigner on Tue Oct 27 23:31:24 CST 2020
 */

package view.passwordView;

import classType.userType.Admin;
import sqlContact.AdminContact;

import javax.swing.*;
import java.awt.event.ActionEvent;

/*
 * @author:何翔
 * @date:2020/11/20 9:48
 * @description:密码管理窗口
 /*
 
 */

public class EditPasswordWindow {
    private Admin admin;
    public void showEditPasswordWindow(Admin admin1){
        editPasswordFrm.setVisible(true);
        this.admin = admin1;
    }
    public EditPasswordWindow() {
        initComponents();
    }

    private void resetbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:49
         * @description：重置填写信息
         */
        oldPasswordtextField.setText("");
        newPasswordtextField.setText("");
        confirmPasswordtextField.setText("");
    }

    private void cancelbuttonActionPerformed(ActionEvent e) {
        editPasswordFrm.dispose();
    }

    private void confirmEditbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:49
         * @description：修改密码
         */
        String oldPassword = oldPasswordtextField.getText().toString();
        String newPassword = newPasswordtextField.getText().toString();
        String confirmPassword = confirmPasswordtextField.getText().toString();
        if(oldPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "旧密码不能为空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(newPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "新密码不能为空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(confirmPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "确认密码不能为空!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!confirmPassword.equals(newPassword)){
            JOptionPane.showMessageDialog(null, "确认密码与新密码不一致!", "信息错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AdminContact adminContact = new AdminContact();
        Admin adminTmp = new Admin();
        adminTmp.setName(admin.getName());
        adminTmp.setId(admin.getId());
        adminTmp.setPassword(oldPassword);
        String getresult = adminContact.editPassword(adminTmp, newPassword);
        if(getresult.equals("旧密码错误!")||getresult.equals("修改失败!")){
            JOptionPane.showMessageDialog(null, getresult, "信息更改失败!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }else
            JOptionPane.showMessageDialog(null, getresult, "信息更改成功",
                    JOptionPane.INFORMATION_MESSAGE);
        adminContact.CloseCon();
        editPasswordFrm.dispose();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        editPasswordFrm = new JFrame();
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        oldPasswordtextField = new JTextField();
        newPasswordtextField = new JTextField();
        confirmPasswordtextField = new JTextField();
        confirmEditbutton = new JButton();
        resetbutton = new JButton();
        cancelbutton = new JButton();

        //======== editPasswordFrm ========
        {
            editPasswordFrm.setTitle("\u5bc6\u7801\u4fee\u6539\u754c\u9762");
            editPasswordFrm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            var editPasswordFrmContentPane = editPasswordFrm.getContentPane();

            //======== panel1 ========
            {

                //---- label1 ----
                label1.setText("\u539f\u5bc6\u7801\uff1a");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
                label1.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u539f\u5bc6\u7801.png")));

                //---- label3 ----
                label3.setText("\u65b0\u5bc6\u7801\uff1a");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 10f));
                label3.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u65b0\u5bc6\u7801.png")));

                //---- label2 ----
                label2.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));
                label2.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u786e\u8ba4\u5bc6\u7801.png")));

                //---- confirmEditbutton ----
                confirmEditbutton.setText("\u786e\u8ba4\u4fee\u6539");
                confirmEditbutton.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u786e\u8ba4.png")));
                confirmEditbutton.addActionListener(e -> confirmEditbuttonActionPerformed(e));

                //---- resetbutton ----
                resetbutton.setText("\u91cd\u7f6e\u6570\u636e");
                resetbutton.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u91cd\u7f6e.png")));
                resetbutton.addActionListener(e -> resetbuttonActionPerformed(e));

                //---- cancelbutton ----
                cancelbutton.setText("\u53d6\u6d88\u4fee\u6539");
                cancelbutton.setIcon(new ImageIcon(getClass().getResource("/image/EditPasswordView/\u53d6\u6d88.png")));
                cancelbutton.addActionListener(e -> cancelbuttonActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label1)
                                    .addComponent(label3))
                                .addComponent(label2)
                                .addComponent(confirmEditbutton, GroupLayout.Alignment.LEADING))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(newPasswordtextField, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldPasswordtextField, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(confirmPasswordtextField, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(resetbutton)
                                    .addGap(43, 43, 43)
                                    .addComponent(cancelbutton)
                                    .addContainerGap(50, Short.MAX_VALUE))))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(oldPasswordtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(newPasswordtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(confirmPasswordtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(confirmEditbutton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelbutton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetbutton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(35, Short.MAX_VALUE))
                );
            }

            GroupLayout editPasswordFrmContentPaneLayout = new GroupLayout(editPasswordFrmContentPane);
            editPasswordFrmContentPane.setLayout(editPasswordFrmContentPaneLayout);
            editPasswordFrmContentPaneLayout.setHorizontalGroup(
                editPasswordFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            editPasswordFrmContentPaneLayout.setVerticalGroup(
                editPasswordFrmContentPaneLayout.createParallelGroup()
                    .addGroup(editPasswordFrmContentPaneLayout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            editPasswordFrm.pack();
            editPasswordFrm.setLocationRelativeTo(editPasswordFrm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame editPasswordFrm;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JTextField oldPasswordtextField;
    private JTextField newPasswordtextField;
    private JTextField confirmPasswordtextField;
    private JButton confirmEditbutton;
    private JButton resetbutton;
    private JButton cancelbutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
