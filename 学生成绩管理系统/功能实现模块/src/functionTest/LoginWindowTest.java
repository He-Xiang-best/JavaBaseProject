package functionTest;

import view.loginView.LoginWindow;
/*
 * @author:何翔
 * @date:2020/11/20 8:55
 * @description:主函数，程序入口
 /*
 
 */

public class LoginWindowTest {
    public static void main(String[] args) {
        show01();
    }

    public static void show01() {
        LoginWindow lw = new LoginWindow();
        lw.showLoginFrame();
    }

}
