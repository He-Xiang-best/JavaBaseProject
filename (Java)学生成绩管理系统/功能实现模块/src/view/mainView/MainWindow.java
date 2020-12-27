/*
 * Created by JFormDesigner on Sun Oct 18 23:42:22 CST 2020
 */

package view.mainView;

import classType.userType.Admin;
import view.classView.AddClassWindow;
import view.classView.ClassManageWindow;
import view.courseView.AddCourseWindow;
import view.courseView.CourseManageWindow;
import view.loginView.LoginWindow;
import view.passwordView.EditPasswordWindow;
import view.scoreView.AddScoreWindow;
import view.scoreView.ScoreManageWindow;
import view.scoreView.ScoreStatistics;
import view.studentView.AddStudentWindow;
import view.studentView.StudentManageWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;

/*
 * @author:何翔
 * @date:2020/11/20 9:52
 * @description:功能总窗口
 /*
 
 */
public class MainWindow {
    private Admin admin;
    public void showMainWindow(Admin admin1){
        mainFrame.setVisible(true);
        this.admin=admin1;
    }
    public MainWindow() {
        initComponents();
    }

    private void backToLoginActionPerformed(ActionEvent e) {
        mainFrame.dispose();
        new LoginWindow().showLoginFrame();
    }

    private void exitSystemActionPerformed(ActionEvent e) {
        mainFrame.dispose();
        System.exit(0);
    }

    private void menuItem7ActionPerformed(ActionEvent e) {
        new EditPasswordWindow().showEditPasswordWindow(admin);
    }

    private void menuItem4ActionPerformed(ActionEvent e) {
        new AddClassWindow().showAddClassWindow();
    }

    private void menuItem6ActionPerformed(ActionEvent e) {
        new ClassManageWindow().showClassControlWindow();
    }

    private void addStudentActionPerformed(ActionEvent e) {
        new AddStudentWindow().showAddStudentStudentWindow();
    }

    private void StudentManageActionPerformed(ActionEvent e) {
        new StudentManageWindow().showStudentManageWindow();
    }

    private void AddCouseActionPerformed(ActionEvent e) {
        new AddCourseWindow().showAddCourseWindow();
    }

    private void CourseManageActionPerformed(ActionEvent e) {
        new CourseManageWindow().showCourseManageWindow();
    }

    private void AddScoreActionPerformed(ActionEvent e) {
        new AddScoreWindow().showAddScoreWindow();
    }

    private void scoreAllActionPerformed(ActionEvent e) {
       new ScoreManageWindow().showScoreManageWindow();
    }

    private void ClassScoreActionPerformed(ActionEvent e) { new ScoreStatistics().showScoreStatisticsWindow(); }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainFrame = new JFrame();
        menuBar1 = new JMenuBar();
        setting = new JMenu();
        menuItem7 = new JMenuItem();
        backToLogin = new JMenuItem();
        exitSystem = new JMenuItem();
        stu_manage = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu1 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu3 = new JMenu();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem10 = new JMenuItem();
        label1 = new JLabel();
        panel1 = new JPanel();

        //======== mainFrame ========
        {
            mainFrame.setTitle("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf\u4e3b\u754c\u9762");
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            var mainFrameContentPane = mainFrame.getContentPane();

            //======== menuBar1 ========
            {

                //======== setting ========
                {
                    setting.setText("\u9009\u9879\u8bbe\u7f6e");
                    setting.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Setting_choice/\u8bbe \u7f6e.png")));

                    //---- menuItem7 ----
                    menuItem7.setText("\u4e2a\u4eba\u4fe1\u606f\u4fee\u6539");
                    menuItem7.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Setting_choice/\u4e2a\u4eba\u4fe1\u606f.png")));
                    menuItem7.addActionListener(e -> menuItem7ActionPerformed(e));
                    setting.add(menuItem7);

                    //---- backToLogin ----
                    backToLogin.setText("\u8fd4\u56de\u767b\u5165\u754c\u9762");
                    backToLogin.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Setting_choice/\u8fd4\u56de.png")));
                    backToLogin.addActionListener(e -> backToLoginActionPerformed(e));
                    setting.add(backToLogin);

                    //---- exitSystem ----
                    exitSystem.setText("\u9000\u51fa\u7ba1\u7406\u7cfb\u7edf");
                    exitSystem.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Setting_choice/\u9000\u51fa.png")));
                    exitSystem.addActionListener(e -> exitSystemActionPerformed(e));
                    setting.add(exitSystem);
                }
                menuBar1.add(setting);

                //======== stu_manage ========
                {
                    stu_manage.setText("\u5b66\u751f\u7ba1\u7406");
                    stu_manage.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Stu_manage/\u7ba1\u7406.png")));

                    //---- menuItem1 ----
                    menuItem1.setText("\u6dfb\u52a0\u5b66\u751f");
                    menuItem1.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Stu_manage/\u589e\u52a0.png")));
                    menuItem1.addActionListener(e -> addStudentActionPerformed(e));
                    stu_manage.add(menuItem1);

                    //---- menuItem2 ----
                    menuItem2.setText("\u5b66\u751f\u7ba1\u7406");
                    menuItem2.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Stu_manage/\u5217\u8868.png")));
                    menuItem2.addActionListener(e -> StudentManageActionPerformed(e));
                    stu_manage.add(menuItem2);
                }
                menuBar1.add(stu_manage);

                //======== menu1 ========
                {
                    menu1.setText("\u73ed\u7ea7\u7ba1\u7406");
                    menu1.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Class_manage/\u73ed\u7ea7\u7ba1\u7406.png")));

                    //---- menuItem4 ----
                    menuItem4.setText("\u6dfb\u52a0\u73ed\u7ea7");
                    menuItem4.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Class_manage/\u589e\u52a0.png")));
                    menuItem4.addActionListener(e -> menuItem4ActionPerformed(e));
                    menu1.add(menuItem4);

                    //---- menuItem6 ----
                    menuItem6.setText("\u73ed\u7ea7\u7ba1\u7406");
                    menuItem6.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Class_manage/\u73ed\u7ea7\u5217\u8868.png")));
                    menuItem6.addActionListener(e -> menuItem6ActionPerformed(e));
                    menu1.add(menuItem6);
                }
                menuBar1.add(menu1);

                //======== menu3 ========
                {
                    menu3.setText("\u8bfe\u7a0b\u7ba1\u7406");
                    menu3.setIcon(new ImageIcon(getClass().getResource("/image/MainView/grade_score/\u8bfe\u7a0b.png")));

                    //---- menuItem8 ----
                    menuItem8.setText("\u6dfb\u52a0\u8bfe\u7a0b");
                    menuItem8.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Stu_manage/\u589e\u52a0.png")));
                    menuItem8.addActionListener(e -> AddCouseActionPerformed(e));
                    menu3.add(menuItem8);

                    //---- menuItem9 ----
                    menuItem9.setText("\u8bfe\u7a0b\u5217\u8868");
                    menuItem9.setIcon(new ImageIcon(getClass().getResource("/image/MainView/grade_score/\u8bfe\u7a0b2.png")));
                    menuItem9.addActionListener(e -> CourseManageActionPerformed(e));
                    menu3.add(menuItem9);
                }
                menuBar1.add(menu3);

                //======== menu2 ========
                {
                    menu2.setText("\u6210\u7ee9\u7ba1\u7406");
                    menu2.setIcon(new ImageIcon(getClass().getResource("/image/MainView/grade_score/\u6210\u7ee9.png")));

                    //---- menuItem3 ----
                    menuItem3.setText("\u6210\u7ee9\u6dfb\u52a0");
                    menuItem3.setIcon(new ImageIcon(getClass().getResource("/image/MainView/Stu_manage/\u589e\u52a0.png")));
                    menuItem3.addActionListener(e -> AddScoreActionPerformed(e));
                    menu2.add(menuItem3);

                    //---- menuItem5 ----
                    menuItem5.setText("\u6210\u7ee9\u5217\u8868");
                    menuItem5.setIcon(new ImageIcon(getClass().getResource("/image/MainView/grade_score/\u8bfe\u7a0b\u5217\u8868.png")));
                    menuItem5.addActionListener(e -> scoreAllActionPerformed(e));
                    menu2.add(menuItem5);

                    //---- menuItem10 ----
                    menuItem10.setText("\u6210\u7ee9\u7edf\u8ba1");
                    menuItem10.setIcon(new ImageIcon(getClass().getResource("/image/MainView/grade_score/\u6210\u7ee9 (1).png")));
                    menuItem10.addActionListener(e -> ClassScoreActionPerformed(e));
                    menu2.add(menuItem10);
                }
                menuBar1.add(menu2);
            }
            mainFrame.setJMenuBar(menuBar1);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/image/MainView/\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf\u5c01\u9762.png")));

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            );
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 585, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 395, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame mainFrame;
    private JMenuBar menuBar1;
    private JMenu setting;
    private JMenuItem menuItem7;
    private JMenuItem backToLogin;
    private JMenuItem exitSystem;
    private JMenu stu_manage;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu1;
    private JMenuItem menuItem4;
    private JMenuItem menuItem6;
    private JMenu menu3;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem5;
    private JMenuItem menuItem10;
    private JLabel label1;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
